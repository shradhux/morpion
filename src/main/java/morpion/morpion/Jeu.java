package morpion.morpion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Jeu {

    @FXML
    private Button btnaa;

    @FXML
    private Button btnab;

    @FXML
    private Button btnac;

    @FXML
    private Button btnba;

    @FXML
    private Button btnbc;

    @FXML
    private Button btnca;

    @FXML
    private Button btncb;

    @FXML
    private Button btncc;

    @FXML
    private Label joueurCourant;

    private String joueur1;
    private String joueur2;

    public Jeu(String joueur1,String joueur2){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }
    @FXML
    void placerDans(ActionEvent event) {
        Button maSource =(Button) event.getSource();
        maSource.setText("0");
    }
}
