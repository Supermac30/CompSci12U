import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class TwoWayConversion  extends JFrame {
    JLabel title = new JLabel("Convert Fahrenheit to Celsius");
    JLabel inlabel = new JLabel("Fahrenheit");
    JLabel outlabel = new JLabel("Celsius");
    JTextField inFahr = new JTextField(7);
    JTextField outCel = new JTextField(7);
    JButton FtoC = new JButton("F to C");
    JButton CtoF = new JButton("C to F");

    public static void main(String[] args) {
        TwoWayConversion frame = new TwoWayConversion();
        frame.setSize( 200, 150 );
        frame.setVisible(true);
    }

    public TwoWayConversion (){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(title);
        getContentPane().add(inlabel);
        getContentPane().add(outlabel);
        getContentPane().add(inFahr);
        getContentPane().add(outCel);
        getContentPane().add(FtoC);
        getContentPane().add(CtoF);
        outlabel.setBorder(new EmptyBorder(0,20,0,15));

        FtoC.addActionListener(a -> FtoC());
        CtoF.addActionListener(a -> CtoF());

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int option = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
                if(option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    void FtoC() {
        try {
            String start = inFahr.getText();
            double fahr = Double.parseDouble(start);
            double cels = (fahr - 32) * (5.0 / 9.0);
            String result = String.format("%.2f", cels);
            outCel.setText(result);
        } catch (NumberFormatException e) {
            errorPrompt();
            inFahr.requestFocus();
        }
    }
    void CtoF() {
        try {
            String start = outCel.getText();
            double cels = Double.parseDouble(start);
            double fahr = cels*(9.0/5.0)+32;
            String result = String.format("%.2f", fahr);
            inFahr.setText(result);
        } catch (NumberFormatException e) {
            errorPrompt();
            outCel.requestFocus();
        }
    }
    void errorPrompt() {
        JOptionPane.showMessageDialog(this, "You must enter a number.", "Invalid Data!", JOptionPane.ERROR_MESSAGE);
    }

}


