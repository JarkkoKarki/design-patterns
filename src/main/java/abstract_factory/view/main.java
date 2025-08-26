package abstract_factory.view;


import abstract_factory.AFactory;
import abstract_factory.BFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/abstract.fxml"));

        boolean useAFactory = true;
        if (useAFactory) {
            fxmlLoader.setController(new AFactory());
        } else {
            fxmlLoader.setController(new BFactory());
        }

        Parent root = fxmlLoader.load();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}