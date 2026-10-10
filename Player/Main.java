//-------- Libraries -------//
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        //-------- Named window ---------//
        JFrame win = new JFrame("Player");

        //--------------- Close X Button -----------------//
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon Icon = new ImageIcon(Main.class.getResource("/Logo/Icon.png"));
        win.setIconImage(Icon.getImage());

        //---------------------- Background -----------------------//
        win.getContentPane().setBackground(Color.decode("#21212B"));
        
        //---------- Position ---------//
        win.setLocationRelativeTo(null);
        
        //--- Visibility ---//
        win.setVisible(true);
    }
}
