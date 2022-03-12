package project.frames.staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class FloorWorker {

    public void storesOnAction(ActionEvent actionEvent) {
        Stage stage = new Stage();
        stage.setTitle("New Item");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/NewItem.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }

    public void supplyOnAction(ActionEvent actionEvent) {
        Stage stage = new Stage();
        stage.setTitle("Supply");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/supply/SupplyMain.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }

}
