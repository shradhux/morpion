package morpion.morpion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class HelloController {

        @FXML
        private TextField joueur1;

        @FXML
        private TextField joueur2;

        @FXML
        private Button tt;

        @FXML
        private Pane zz;

        @FXML
        void lancerpartie(ActionEvent event) {
                System.out.println("bonjour");
                System.out.println(joueur1.getText());
                System.out.println(joueur2.getText());
                HelloApplication.changeScene("jeu",new Jeu(joueur1.getText(),joueur2.getText()));

        }



}