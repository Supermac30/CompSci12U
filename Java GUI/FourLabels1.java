import javax.swing.*;
import java.awt.*;

public class FourLabels1 extends JFrame{
    JPanel panel;
    JLabel[] labels;

    public static void main(String[] args) {
        new FourLabels1();
    }

    public FourLabels1() {
        panel = new JPanel();
        labels = new JLabel[4];

        String[] colorLabels = {"Red", "Blue", "Orange", "Magenta"};
        int[] colors = {0xFF0000, 0x0000FF, 0xFFA500, 0xFF00FF};
        Dimension d = new Dimension(100 , 20);
        for (int i = 0; i < 4; i++) {
            labels[i] = new JLabel();
            labels[i].setText(colorLabels[i] + " Label");
            labels[i].setOpaque(true);
            labels[i].setBackground(new Color(colors[i]));
            labels[i].setPreferredSize(d);
            labels[i].setHorizontalAlignment(JLabel.CENTER);
            panel.add(labels[i]);
        }

        labels[0].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        labels[1].setBorder(BorderFactory.createLoweredBevelBorder());
        labels[2].setBorder(BorderFactory.createEtchedBorder());
        labels[3].setBorder(BorderFactory.createDashedBorder(null));

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        setContentPane(panel);
        setSize(300, 100);
        setTitle("Labels: Exercise 1");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
