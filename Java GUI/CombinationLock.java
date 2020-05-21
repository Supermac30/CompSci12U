import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CombinationLock extends JFrame implements ActionListener {
    JLabel label;
    JButton[] nums = new JButton[10];
    int[] password = {3, 1, 4, 1, 5};
    int counter = 0;
    public CombinationLock() {
        this.setTitle("Combination Lock");
        getContentPane().setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            nums[i] = new JButton(Integer.toString(i));
            nums[i].setActionCommand(Integer.toString(i));
            nums[i].addActionListener(this);
            getContentPane().add(nums[i]);
        }
        label = new JLabel();
        label.setText("Go on...");
        getContentPane().add(label);
        getContentPane().setBackground(Color.blue);
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    }

    public void actionPerformed(ActionEvent evt) {
        int pressed = Integer.parseInt(evt.getActionCommand());
        if (pressed == password[counter]) {
            label.setText("Go on...");
            getContentPane().setBackground(Color.blue);
            counter ++;
        }
        else {
            counter = 0;
            label.setText("Nope");
            getContentPane().setBackground(Color.red);
        }
        if (counter == password.length) {
            System.exit(0);
        }
        repaint();
    }

    public static void main(String[] args) {
        CombinationLock frm = new CombinationLock();
        frm.setSize(400, 150);
        frm.setVisible(true);
    }
}
