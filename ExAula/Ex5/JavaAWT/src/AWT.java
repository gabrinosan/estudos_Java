import java.awt.*;

public class AWT {
    public static void main(String[] args) {
        //Criando a janela de exibição
        Frame frame = new Frame();
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        //Criando o Botão
        Button button = new Button("Botão");

        //Criando a Caixa de Texto
        TextField textField = new TextField(20);

        //Criando a Label
        Label label = new Label("Digite seu nome:");

        //Adicionando componentes a janela
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);
    }
}
