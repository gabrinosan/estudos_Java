import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        //Criando o Botão
        Button button = new Button("Botão");

        //Criando um Campo de Texto
        TextField textField = new TextField();

        //Criando o Label
        Label label = new Label("Escreva seu nome:");

        //Layout da janela de exibição
        VBox vbox = new VBox(10, label, textField, button);
        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
