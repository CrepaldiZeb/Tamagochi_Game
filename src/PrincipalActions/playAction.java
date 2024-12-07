package PrincipalActions;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pet.Pet;

public class playAction implements ActionListener{
    Pet petPointer;
    JLayeredPane tela = new JLayeredPane(); 
    JButton jv = new JButton("jogo da velha");
    JButton ppt = new JButton("jokenpô");
    JButton jm = new JButton("jogo da memoria");
    JButton pp = new JButton("Ping Pong");

    public void playAction(Pet p){
        petPointer = p;
        JFrame frame = new JFrame();

        tela.setBounds(0,0,1027,600);
        tela.setOpaque(true);
        tela.setLayout(null);

        JLabel fundo = new JLabel();
        ImageIcon fnd = new ImageIcon("imgs/jogar/fundo.png");
        fundo.setIcon(fnd);
        fundo.setBounds(0, 0, 1027, 600);

        


        
        JLabel back = new JLabel();
        back.setLayout(null);
        back.setBounds(281,60,465,465);
        ImageIcon img = new ImageIcon("imgs/jogar/back.png");
        back.setIcon(img);

        jv.addActionListener(this);
        jv.setBackground(Color.decode("#8eecf5"));
        jv.setFont(new Font("Neue Machina Ultra Bold",Font.BOLD,21));
        jv.setFocusable(false);
        jv.setForeground(Color.white);

        ppt.addActionListener(this);
        ppt.setBackground(Color.decode("#8eecf5"));
        ppt.setFont(new Font("Neue Machina Ultra Bold",Font.BOLD,21));
        ppt.setFocusable(false);
        ppt.setForeground(Color.white);

        jm.addActionListener(this);
        jm.setBackground(Color.decode("#8eecf5"));
        jm.setFont(new Font("Neue Machina Ultra Bold",Font.BOLD,19));
        jm.setFocusable(false);
        jm.setForeground(Color.white);

        pp.addActionListener(this);
        pp.setBackground(Color.decode("#8eecf5"));
        pp.setFont(new Font("Neue Machina Ultra Bold",Font.BOLD,21));
        pp.setFocusable(false);
        pp.setForeground(Color.white);




        JPanel bt = new JPanel();
        bt.setLayout(new GridLayout(4,1,0,10));
        bt.setBackground(Color.white);
        bt.setBounds(132+281,190,201,300);
        bt.add(jv);
        bt.add(ppt);
        bt.add(jm);
        bt.add(pp);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1027,600);
        frame.setVisible(true);
        frame.setResizable(false);
        tela.add(fundo,Integer.valueOf(0));
        tela.add(back,Integer.valueOf(1));
        tela.add(bt,Integer.valueOf(2));
        frame.add(tela);
        //frame.add(bt);
        //frame.add(back);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.jv){
           if(petPointer.getHungry()-10 <= 0){
                JOptionPane.showMessageDialog(null,petPointer.getName()+ " Está com fome :c");
                return;

           }else if(petPointer.getEnergy()-5 <= 0){
                JOptionPane.showMessageDialog(null, petPointer.getName()+" Está muito cansado :(");
                return;    
           } 
           petPointer.play("tictactoe");
            //jogo da velha

        }else if(e.getSource() == this.ppt){
            if(petPointer.getHungry()-10 <= 0){
                JOptionPane.showMessageDialog(null,petPointer.getName()+ " Está com fome :c");
                return;

           }else if(petPointer.getEnergy()-5 <= 0){
                JOptionPane.showMessageDialog(null, petPointer.getName()+" Está muito cansado :(");
                return;    
           } 
           petPointer.play("tockPaperScissors");
            //pedra papel tesoura

        }else if(e.getSource() == this.jm){
            if(petPointer.getHungry()-10 <= 0){
                JOptionPane.showMessageDialog(null,petPointer.getName()+ " Está com fome :c");
                return;

           }else if(petPointer.getEnergy()-5 <= 0){
                JOptionPane.showMessageDialog(null, petPointer.getName()+" Está muito cansado :(");
                return;    
           } 
           petPointer.play("memoryGame");
            //jogo da memoria

        }else if(e.getSource() == this.pp){
            if(petPointer.getHungry()-10 <= 0){
                JOptionPane.showMessageDialog(null,petPointer.getName()+ " Está com fome :c");
                return;

           }else if(petPointer.getEnergy()-5 <= 0){
                JOptionPane.showMessageDialog(null, petPointer.getName()+" Está muito cansado :(");
                return;    
           } 
           petPointer.play("pingPong");
            //ping pong

        }
    }
}
