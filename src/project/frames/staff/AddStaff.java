package project.frames.staff;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javax.swing.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AddStaff implements Initializable {
    public TextField userId;
    public TextField userName;
    public TextField password;
    public Button saveItem;
    public Label lblSelect;
    public ComboBox comboRole;
    public Label showRole;
    public DatePicker joinedDate;

    String id, name, pw, date, role;

    public void saveItemOnAction(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Added data!\n" +
                "\nId: "+userId.getText() +
                "\nName: "+userName.getText()+
                "\nPassword: "+password.getText() +
                "\nRole: "+role +
                "\nJoin Date: "+date);
    }
    ObservableList<String> list= FXCollections.observableArrayList("Floor Worker", "Cashier", "Manager");

    public void showRole(ActionEvent actionEvent) {


        role=comboRole.getSelectionModel().getSelectedItem().toString();
        showRole.setText(role);
    }

    public void pickDate(ActionEvent actionEvent) {
        LocalDate localDepDate=joinedDate.getValue();
        date=localDepDate.toString();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboRole.setItems(list);
    }
}
