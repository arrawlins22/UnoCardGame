package code;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HomeWindow {
    Stage window;
    Scene scene1;
    Button startButton;
    public void display() {
        window = new Stage();
        window.setTitle("Uno");
        startButton = new Button();
        startButton.setText("Start");

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        startButton.setOnAction(e -> {
            boolean display = LoginBox.display();
            window.close();
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(startButton);
        scene1 = new Scene(layout, 300, 250);
        window.setScene(scene1);
        window.show();
    }

    private void closeProgram() {
        Boolean answer = ConfirmBox.display("Title", "Are you sure?");
        if(answer) {
            window.close();
        }
    }

}
