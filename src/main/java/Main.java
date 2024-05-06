import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculadora");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JTextField numField1 = new JTextField(10);
            JTextField numField2 = new JTextField(10);

            JButton addButton = new JButton("+");
            JButton subButton = new JButton("-");
            JButton mulButton = new JButton("*");
            JButton divButton = new JButton("/");

            JLabel resultLabel = new JLabel("Resultado:");

            addButton.addActionListener(e -> {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                resultLabel.setText("Resultado: " + (num1 + num2));
            });

            subButton.addActionListener(e -> {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                resultLabel.setText("Resultado: " + (num1 - num2));
            });

            mulButton.addActionListener(e -> {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                resultLabel.setText("Resultado: " + (num1 * num2));
            });

            divButton.addActionListener(e -> {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                if (num2 != 0) {
                    resultLabel.setText("Resultado: " + (num1 / num2));
                } else {
                    resultLabel.setText("Erro: divisão por zero!");
                }
            });

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 2));
            panel.add(new JLabel("Número 1:"));
            panel.add(numField1);
            panel.add(new JLabel("Número 2:"));
            panel.add(numField2);
            panel.add(addButton);
            panel.add(subButton);
            panel.add(mulButton);
            panel.add(divButton);
            panel.add(resultLabel);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
