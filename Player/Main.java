//-------- Libraries -------//
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        //-------- Named window ---------//
        JFrame win = new JFrame("Player");

        //---------- Position ---------//
        win.setLocationRelativeTo(null);
        
        //--- Visibility ---//
        win.setVisible(true);
    }
}
