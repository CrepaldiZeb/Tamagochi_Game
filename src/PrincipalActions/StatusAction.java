package PrincipalActions;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

import pet.Pet;

public class StatusAction {
    JFrame frame = new JFrame();
    JLayeredPane tela = new JLayeredPane();
    JLabel bg = new JLabel();
    JLabel h1 = new JLabel();
    JLabel h2 = new JLabel();
    JLabel h3 = new JLabel();
    JLabel h4 = new JLabel();
    JLabel h5 = new JLabel();
    JLabel h6 = new JLabel();
    JLabel h7 = new JLabel();
    
    ImageIcon c0;
    ImageIcon c1;
    ImageIcon c2;
    ImageIcon c3;
    ImageIcon c4;
    ImageIcon c5;



    public StatusAction(Pet p){


        ImageIcon back = new ImageIcon("imgs/status/bg.png");
        bg.setIcon(back);
        bg.setBounds(0, 0, 1027, 600);

        h1.setBounds(444,126,250,41);
        h1.setOpaque(true);
        h1.setBackground(Color.white);

        h2.setBounds(444,189,250,41);
        h2.setOpaque(true);
        h2.setBackground(Color.white);

        h3.setBounds(444,252,250,41);
        h3.setOpaque(true);
        h3.setBackground(Color.white);

        h4.setBounds(444,315,250,41);
        h4.setOpaque(true);
        h4.setBackground(Color.white);

        h5.setBounds(444,378,250,41);
        h5.setOpaque(true);
        h5.setBackground(Color.white);

        h6.setBounds(444,441,250,41);
        h6.setOpaque(true);
        h6.setBackground(Color.white);

        h7.setBounds(544,507,40,40);
        h7.setOpaque(true);
        h7.setBackground(Color.white);

        c0 = new ImageIcon("imgs/status/0.png");
        c1 = new ImageIcon("imgs/status/1.png");
        c2 = new ImageIcon("imgs/status/2.png");
        c3 = new ImageIcon("imgs/status/3.png");
        c4 = new ImageIcon("imgs/status/4.png");
        c5 = new ImageIcon("imgs/status/5.png");

        paint(h1,hearts(p.getHungry()));
        paint(h2,hearts(p.getEnergy()));
        paint(h3,hearts(p.getHealth()));
        paint(h4,hearts(p.getHumor()));
        paint(h5,hearts(p.getLove()));
        paint(h6,hearts(p.getHygiene()));

        String l = ""+p.getLogic();
        h7.setText(l);
        h7.setFont(new Font("Open Sans",Font.BOLD,23));

        tela.setLayout(null);
        tela.setBounds(0,0,1027,600);
        tela.add(bg,Integer.valueOf(0));
        tela.add(h1,Integer.valueOf(1));
        tela.add(h2,Integer.valueOf(1));
        tela.add(h3,Integer.valueOf(1));
        tela.add(h4,Integer.valueOf(1));
        tela.add(h5,Integer.valueOf(1));
        tela.add(h6,Integer.valueOf(1));
        tela.add(h7,Integer.valueOf(1));

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1027, 600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(tela);
    }

    private int hearts(int i){
        if(i<10 && i>=0)
            return 0;
        else if(i>=10 && i<20)
            return 1;
        else if(i>=20 && i<40)
            return 2;
        else if(i>=40 && i<60)
            return 3;
        else if(i>=60 && i<80)
            return 4;
        else if(i>=80 && i<=100)
            return 5;
        else 
            return 0;
    }

    private void paint(JLabel j, int i){
        switch(i){
            case 0:
            j.setIcon(c0);
            break;

            case 1:
            j.setIcon(c1);
            break;

            case 2:
            j.setIcon(c2);
            break;

            case 3:
            j.setIcon(c3);
            break;

            case 4:
            j.setIcon(c4);
            break;

            case 5:
            j.setIcon(c5);
            break;

            default:
        }
    }

}
