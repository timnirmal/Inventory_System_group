package project.frames.staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class StaffController {
    public void addStaffOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("Supply");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/staff/AddStaff.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }



    public void showStaffOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("Supply");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/staff/ShowStaff.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }


    public void editOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("Supply");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/staff/EditStaff.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }
}
