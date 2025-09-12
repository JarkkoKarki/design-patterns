package memento;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    Model model;
    Gui gui;
    private List<IMemento> history; // Memento history
    //____
    // NEW UNDOHISTORY
    private List<IMemento> undoHistory;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.undoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");

            undoHistory.add(history.get(history.size() - 1));

            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    //____
    public void redo() {
        if (!undoHistory.isEmpty()) {
            System.out.println("Memento found in undoHistory");

            history.add(undoHistory.get(undoHistory.size() - 1));

            IMemento previousState = undoHistory.remove(undoHistory.size() - 1);

            model.restoreState(previousState);
            gui.updateGui();
        }
    }
    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);

        //____
        undoHistory.clear();

        // Update ListView
        gui.updateListView(history);
    }

}