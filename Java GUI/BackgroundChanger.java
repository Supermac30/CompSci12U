// modified code from the examples

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BackgroundChanger {
    public static void main(String[] args) {
        ButtonFrame2 frm = new ButtonFrame2();
        frm.setVisible(true);
    }
}

class ButtonFrame2 extends JFrame implements ActionListener {
    JButton bChange; // reference to the button object, declared outside constructor

    // constructor for ButtonFrame
    ButtonFrame2() {
        setTitle("Background Changer"); //I can also use this.setTitle("Action Event Demo");
        bChange = new JButton("Change"); // construct a Button
        bChange.addActionListener(this); // register the ButtonFrame object as the listener
        getContentPane().setBackground(Color.blue);
        getContentPane().setLayout(new FlowLayout()); // set the layout
        getContentPane().add(bChange); // add the button to the JFrame
        setSize(400, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /** This method is inherited from the ActionListener interface.
     My class implements ActionListener, I have to include this method in my class.
     This method is triggered when an Action Event happens on button bChange */
    public void actionPerformed(ActionEvent evt) {
        if (getContentPane().getBackground() == Color.blue) {
            getContentPane().setBackground(Color.red);
        } else {
            getContentPane().setBackground(Color.blue);
        }
        repaint(); // ask the system to paint the screen.
    }
}
