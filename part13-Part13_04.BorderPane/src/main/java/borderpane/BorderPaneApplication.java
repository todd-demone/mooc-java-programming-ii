package borderpane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;

public class BorderPaneApplication extends Application {

    public void start(Stage myStage) {
        BorderPane myBorderPane = new BorderPane();
        myBorderPane.setTop(new TextField("NORTH"));
        myBorderPane.setRight(new TextField("EAST"));
        myBorderPane.setBottom(new TextField("SOUTH"));
        
        Scene myScene = new Scene(myBorderPane);
        
        myStage.setScene(myScene);
        myStage.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

}
