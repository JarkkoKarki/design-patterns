package memento;

import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;

import java.util.HashMap;
import java.util.Map;

public class ListView {
    Controller controller;
    javafx.scene.control.ListView<String> listView;
    private Map<String, IMemento> mementoMap;

    public ListView(Controller controller) {
        this.controller = controller;
        listView = new javafx.scene.control.ListView<>();
        mementoMap = new HashMap<>();

        // Selection Model
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                IMemento selectedMemento = mementoMap.get(newValue); // Haetaan arvo HashMapista, jossa on memento
                if (selectedMemento != null) {
                    controller.model.restoreState(selectedMemento); // Päivitetään state
                    controller.gui.updateGui();
                }
            }
        });
    }

    public ObservableList<String> getItems() {
        return listView.getItems();
    }

    public void updateListView(ObservableList<String> items, Map<String, IMemento> mementoMap) {
        // Päivitetään Memento lista ja Itemit sivulla
        this.mementoMap = mementoMap;
        listView.setItems(items);
    }
}