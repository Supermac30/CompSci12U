import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClicketyClick {
    public static void main(String[] args) {
        ButtonFrame frm = new ButtonFrame();
        frm.setVisible(true);
    }
}
class ButtonFrame extends JFrame implements ActionListener {
    JButton bCount;
    int timesPressed = 0;

    ButtonFrame() {
       this.setTitle("Clickety Click");
       bCount = new JButton("You have clicked 0 times.");
       setLayout(new FlowLayout());
       bCount.addActionListener(this);
       setSize(400, 150);
       add(bCount);
    }

    public void actionPerformed(ActionEvent evt) {
        bCount.setText("You have clicked " + ++timesPressed + " times.");
        if (timesPressed == 10) {
            JOptionPane.showMessageDialog(this, "Press OK to exit.", "You are out of clicks.", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}