import java.awt.*;
import javax.swing.*;
public class ExpandShrink extends JFrame{
    JButton shrinkButton, expandButton;
    public ExpandShrink() {
        this.setTitle("Shrink Expand Buttons");
        shrinkButton = new JButton("Shrink");
        expandButton = new JButton("Expand");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(shrinkButton);
        getContentPane().add(expandButton);
        shrinkButton.addActionListener( a -> setSize((int) (getSize().getWidth() * 0.9), (int) (getSize().getHeight()* 0.9)));
        expandButton.addActionListener( a -> setSize((int) (getSize().getWidth() * 1.1), (int) (getSize().getHeight()* 1.1)));
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );

    }
    public static void main(String[] args) {
        ExpandShrink frm = new ExpandShrink();
        frm.setSize(400, 150);
        frm.setVisible(true);
    }
}
