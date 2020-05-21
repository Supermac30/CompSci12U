// The starting code is taken from the examples

import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;


public class ErrorMessage extends JFrame {

    JLabel inLabel = new JLabel("Enter Your Name:  ");
    JTextField inText = new JTextField(15);
    JLabel outLabel = new JLabel("Here is Your Name :");
    JTextField outText = new JTextField(15);

    public ErrorMessage() {
        setTitle("Error Message");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(inLabel);
        getContentPane().add(inText);
        getContentPane().add(outLabel);
        getContentPane().add(outText);
        inText.addActionListener(a -> copyText());
        outText.addActionListener(a -> errorPrompt());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // The application code.
    void copyText() {
        String name = inText.getText();
        outText.setText(name);
    }

    void errorPrompt() {
        JOptionPane.showMessageDialog(this, "Please input your name in the top text field.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        inText.requestFocus();
    }

    public static void main(String[] args) {
        ErrorMessage echo = new ErrorMessage();
        echo.setSize(400, 150);
        echo.setVisible(true);
    }
}