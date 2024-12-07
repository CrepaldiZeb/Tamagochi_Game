package PrincipalActions;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import pet.Pet;

public class educationAction implements ActionListener{
    Pet petPointer;
    //education ed = new education(petPointer);
    JLayeredPane tela = new JLayeredPane();
    //==============================
    //  Botões
    //==============================
    JButton play = new JButton("instrumento");
    JButton pc = new JButton("computador");
    JButton read = new JButton("leitura");
    JButton paint = new JButton("pintura");
    JButton meditate = new JButton("meditar");
    JButton sport = new JButton("esporte");

    public educationAction(Pet p ){
        petPointer = p;
        System.out.print(petPointer.getType());
    }
    education ed = new education(petPointer);

    public void educationA(){
        JFrame frame = new JFrame();

        
        tela.setBounds(0,0,1027,600);
        tela.setOpaque(true);
        tela.setLayout(null);

        JLabel fnd = new JLabel();
        ImageIcon fundo = new ImageIcon("imgs/educar/fundo_1027x600.png");
        fnd.setIcon(fundo);
        fnd.setBounds(0,0,1027,600);
        //tela.setBounds(0,0,1027,600);
            
        JLabel back = new JLabel();
        back.setLayout(null);
        back.setBounds(20,30,960,540);
        ImageIcon img = new ImageIcon("imgs/educar/f.png");
        back.setIcon(img);

        

        play.addActionListener(this);
        play.setBackground(Color.decode("#ff69eb"));
        play.setFont(new Font("Neue Machina Ultra Bold",Font.BOLD,18));
        play.setFocusable(false);
        play.setForeground(Color.white);

        pc.addActionListener(this);
        pc.setBackground(Color.decode("#ff69eb"));
        pc.setFont(new Font("Neue Machina Ultra Bold",Font.BOLD,18));
        pc.setFocusable(false);
        pc.setForeground(Color.white);

        read.addActionListener(this);
        read.setBackground(Color.decode("#ff69eb"));
        read.setFont(new Font("Neue Machina Ultra Bold",Font.BOLD,18));
        read.setFocusable(false);
        read.setForeground(Color.white);

        paint.addActionListener(this);
        paint.setBackground(Color.decode("#ff69eb"));
        paint.setFont(new Font("Neue Machina Ultra Bold",Font.BOLD,18));
        paint.setFocusable(false);
        paint.setForeground(Color.white);

        meditate.addActionListener(this);
        meditate.setBackground(Color.decode("#ff69eb"));
        meditate.setFont(new Font("Neue Machina Ultra Bold",Font.BOLD,18));
        meditate.setFocusable(false);
        meditate.setForeground(Color.white); 
        meditate.addActionListener(this);

        sport.addActionListener(this);
        sport.setBackground(Color.decode("#ff69eb"));
        sport.setFont(new Font("Neue Machina Ultra Bold",Font.BOLD,18));
        sport.setFocusable(false);
        sport.setForeground(Color.white); 
        sport.addActionListener(this);

        JPanel bt = new JPanel();
        bt.setLayout(new GridLayout(6,1,0,8));
        bt.setBounds(380,160,220,320); 
        bt.setBackground(Color.decode("#f7f7f0"));
        bt.add(play);
        bt.add(pc);
        bt.add(read);
        bt.add(paint);
        bt.add(meditate);
        bt.add(sport);
        
        
        //================================
        //          Frame
        //================================

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1027,600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(bt,Integer.valueOf(2));
        frame.add(back,Integer.valueOf(1));
      
        frame.add(fnd,Integer.valueOf(0));
      //  frame.add(bt,Integer.valueOf(1));
        //frame.add(bt);
        frame.add(tela);

    }
    @Override
    //toda atividade vai tirar 5 de fome
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.play){
            petPointer.study("play");
            if(petPointer.getEdhappen() == true){
                ed.eduationAnimation("play");
            }
        }else if(e.getSource() == this.pc){
            petPointer.study("pc");
            if(petPointer.getEdhappen() == true){
                ed.eduationAnimation("pc");
            }
        }else if(e.getSource() == this.read){
            petPointer.study("read");
            if(petPointer.getEdhappen() == true){
                ed.eduationAnimation("read");
            }

        }else if(e.getSource() == this.paint){
        
            petPointer.study("paint");

        }else if(e.getSource() == this.meditate){

            petPointer.study("meditate");
            
        }else if(e.getSource() == this.sport){

            petPointer.study("sport");
        }
    }
}
