package games;

import java.util.Random;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class mg {
    JFrame frame = new JFrame();
    JLayeredPane tela = new JLayeredPane();

    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    

    public mg() {
        // =======================
        // JLayeredPane
        // =======================
        tela.setBounds(0, 0, 1027, 600);
        tela.setOpaque(true);
        tela.setLayout(null);

        // ===========================
        // JLabel for background
        // ===========================
        JLabel background = new JLabel();
        ImageIcon bkground = new ImageIcon("imgs/mg/background.png");
        background.setIcon(bkground);
        background.setBounds(0,0,1027,600);

        // ===========================
        // JLabel buttons background
        // ===========================
        JLabel pane = new JLabel();
        ImageIcon pne = new ImageIcon("imgs/mg/p.png");
        pane.setIcon(pne);
        pane.setBounds(15,30,1800,500);

        // ===========================
        // JPanel buttons option
        // ===========================
        JPanel bt = new JPanel();
        bt.setLayout(new GridLayout(3,3,15,15));
        bt.setBounds(300, 80,420, 420);
        bt.setBackground(Color.decode("#f7f7f0"));

        bt.add(b1);
        bt.add(b2);
        bt.add(b3);
        bt.add(b4);
        bt.add(b5);
        bt.add(b6);
        bt.add(b7);
        bt.add(b8);
        bt.add(b9);







        //===================
        //      Frame
        //===================
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1027, 600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(bt,Integer.valueOf(2));
        frame.add(pane,Integer.valueOf(1));
        frame.add(background,Integer.valueOf(0));
        frame.add(tela);
    }

}
