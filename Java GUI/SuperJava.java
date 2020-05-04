import javax.swing.*;
import java.awt.*;

public class SuperJava extends JFrame{
    JPanel panel;
    JLabel label;

    public static void main(String args[]) {
        new SuperJava();
    }

    public SuperJava(){
        label = new JLabel();
        panel = new JPanel();

        ImageIcon img = new ImageIcon(getClass().getResource("enigma.jpg"));
        Image newImg = img.getImage().getScaledInstance(360, 392, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(newImg));

        label.setText("SUPERJAVA!");
        label.setFont(new Font("Serif", Font.BOLD, 20));
        label.setForeground(new Color(0xff0000));
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);

        panel.add(label);

        setContentPane(panel);
        setSize(400, 500);
        setTitle("Labels: Exercise 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
