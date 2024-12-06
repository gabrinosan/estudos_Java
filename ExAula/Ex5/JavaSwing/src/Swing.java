import javax.swing.*;

public class Swing {
    public static void main(String[] args) {
        // Criando o JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        
        //Criando o Botão
        JButton button = new JButton("Botão");

        //Criando a Caixa de Texto
        JTextField textField = new JTextField(20);

        //Criando o Label
        JLabel label = new JLabel("Digite seu nome:");

        //Layout da janela de exibição
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
