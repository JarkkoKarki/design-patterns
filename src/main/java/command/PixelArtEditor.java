package command;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PixelArtEditor extends Application {
    private static final int SIZE = 8;
    private static final int CELL_PIXELS = 40;

    private final EditorModel model = new EditorModel(SIZE);
    private final Rectangle[][] cells = new Rectangle[SIZE][SIZE];

    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(2);
        gridPane.setVgap(2);

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                Rectangle rect = new Rectangle(CELL_PIXELS, CELL_PIXELS);
                rect.setStroke(Color.LIGHTGRAY);
                rect.setFill(Color.WHITE);
                cells[r][c] = rect;
                gridPane.add(rect, c, r);
            }
        }

        updateView();

        Button codeButton = new Button("Create Code");
        codeButton.setOnAction(e -> new GenerateCodeCommand(model).execute());

        BorderPane root = new BorderPane();
        root.setCenter(gridPane);
        root.setBottom(codeButton);
        BorderPane.setMargin(codeButton, new Insets(10));

        Scene scene = new Scene(root);
        scene.setOnKeyPressed(e -> {
            Command cmd = switch (e.getCode()) {
                case UP -> new MoveCursorUpCommand(model);
                case DOWN -> new MoveCursorDownCommand(model);
                case LEFT -> new MoveCursorLeftCommand(model);
                case RIGHT -> new MoveCursorRightCommand(model);
                case SPACE -> new TogglePixelCommand(model);
                default -> null;
            };
            if (cmd != null) {
                cmd.execute();
                updateView();
            }
        });

        stage.setTitle("Pixel Art Editor (8x8)");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        scene.getRoot().requestFocus();
    }

    private void updateView() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                cells[r][c].setFill(model.getPixel(r, c) ? Color.BLACK : Color.WHITE);
                cells[r][c].setStroke(Color.LIGHTGRAY);
                cells[r][c].setStrokeWidth(1);
            }
        }
        int cr = model.getCursorRow();
        int cc = model.getCursorCol();
        cells[cr][cc].setStroke(Color.ORANGERED);
        cells[cr][cc].setStrokeWidth(3);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
