import javax.swing.*;

import MainForm.MainForm;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adivinador");

        MainForm Adivinador = new MainForm();
        frame.setContentPane(Adivinador.getMainPanel());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}