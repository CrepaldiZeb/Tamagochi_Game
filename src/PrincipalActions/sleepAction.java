package PrincipalActions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


import pet.Pet;

public class sleepAction implements ActionListener {
    // chama um frame
    // entrada de texto que vai dar as horas dormidas
    // vai ter um limite de quantas horas podem passar max = 13 n é permitido neg
    // chama a função do pet ára ajustar a idade
    Pet pet;
    JFrame frame = new JFrame();
    JLayeredPane tela = new JLayeredPane();
    JLabel bg = new JLabel();
    JLabel Q = new JLabel();
    JButton ok = new JButton("ok");
    JComboBox box;

    public sleepAction(Pet p) {
        tela.setBounds(0,0,1027,600);
        pet =p;
        // ===================
        //   Frame
        // ===================

        String[] hrs = {"1 hora","2 horas","3 horas","4 horas","5 horas","6 horas","7 horas","8 horas"};
        box = new JComboBox<>(hrs);
        box.setBounds(400,260,200,50);
        box.setFont(new Font("Open Sans",Font.BOLD,15));
        box.setFocusable(false);
        box.setBackground(Color.white);
        

        ok.setBounds(431, 405 , 120,50);
        ok.setFont(new Font("Open Sans",Font.BOLD,18));
        ok.setForeground(Color.white);
        ok.setBackground(Color.black);
        ok.setFocusable(false);
        ok.addActionListener(this);

        ImageIcon white = new ImageIcon("imgs/sleep/semi.png");
        Q.setIcon(white);
        Q.setBounds(0,0,1027,600);

        ImageIcon back = new ImageIcon("imgs/sleep/bg.png");
        bg.setIcon(back);
        bg.setBounds(0, 0, 1027, 600);

        tela.add(bg,Integer.valueOf(0));
        tela.add(Q,Integer.valueOf(1));
        tela.add(box,Integer.valueOf(2));
        tela.add(ok,Integer.valueOf(3));
        tela.setLayout(null);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1027, 600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(tela);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ok){
            pet.sleep(box.getSelectedIndex()+1);
            frame.dispose();
        }
    }
}
