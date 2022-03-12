package project.frames.staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Manager extends Cashier{

    public void staffOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("Staff");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/staff/StaffController.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }

    public void viewSupplyOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("Supply");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/supply/SupplyMain.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }

    public void approveOnAction(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Approved!");
    }
}
