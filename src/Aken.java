import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.*;
import java.io.*;
import java.util.*;

public class Aken extends Application
{
    int hunte = 5;
    int janesid = 30;
    TextField tfHunte = new TextField(String.valueOf(hunte));
    TextField tfJaneseid = new TextField(String.valueOf(janesid));
    Button nupp1 = new Button("1 p?ev");
    Button salvestusnupp = new Button("Salvesta");
    Button lugemisnupp = new Button("Loe");
    public void start(Stage stage)
    {
        VBox vb = new VBox();
        HBox hb = new HBox();
        hb.getChildren().addAll(tfHunte, tfJaneseid);
        HBox nupud = new HBox();
        nupud.getChildren().addAll(nupp1, salvestusnupp, lugemisnupp);
        vb.getChildren().addAll(hb, nupud);
        Group juur = new Group(vb);
        stage.setScene(new Scene(juur));
        stage.show();
    }
    //void
}
