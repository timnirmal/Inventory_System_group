package project.frames.staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Cashier  extends FloorWorker {

    public void billOnAction(ActionEvent actionEvent) {
        Stage stage = new Stage();
        stage.setTitle("transaction");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/BillFinished.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }
}
