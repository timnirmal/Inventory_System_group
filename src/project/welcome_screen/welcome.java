package project.welcome_screen;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;


public class welcome  {



    public Button logButton;
    public TextField usernameTF=null;
    public PasswordField pWTF=null;
    public Label welcomeLabel;



    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        try {
            if(usernameTF.getText().equals("059") && pWTF.getText().equals("admin123")){   //owner
                Stage stage = new Stage();
                stage.setTitle("Owner");
                welcomeLabel.setText(" Access Granted ! ");
                stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/staff/Owner.fxml"))));
                stage.show();
            }
            else if( usernameTF.getText().charAt(0)=='1' && pWTF.getText().equals("user00") ){   //manager
                Stage stage = new Stage();
                stage.setTitle("Manager");
                welcomeLabel.setText(" Access Granted ! ");
                stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/staff/Manager.fxml"))));
                stage.show();
            }
            else
            if(usernameTF.getText().charAt(0)=='2' && pWTF.getText().equals("abc123")){    //cashier
                Stage stage = new Stage();
                stage.setTitle("Floor Worker");
                welcomeLabel.setText(" Access Granted ! ");
                stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/staff/FloorWorker.fxml"))));
                stage.show();
            }
            else if(usernameTF.getText().charAt(0)=='3'&& pWTF.getText().equals("xyz123")){   //floor worker
                Stage stage = new Stage();
                stage.setTitle("Cashier");
                welcomeLabel.setText(" Access Granted ! ");
                stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/staff/Cashier.fxml"))));
                stage.show();
            }
            else {
                JOptionPane.showMessageDialog(null, "Access Denied!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
