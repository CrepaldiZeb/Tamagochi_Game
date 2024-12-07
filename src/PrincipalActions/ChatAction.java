//tem q formatar 
package PrincipalActions;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import pet.Pet;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

public class ChatAction {
    JFrame frame = new JFrame();
    JLayeredPane tela = new JLayeredPane();
    Pet petPointer;

    public ChatAction(Pet pet) {
       
        petPointer = pet;
        // =======================
        // JLayeredPane
        // =======================
        tela.setBounds(0, 0, 950, 600);
        tela.setOpaque(true);
        tela.setLayout(null);

        // ===========================
        // JLabel for the background
        // ===========================
        JLabel background = new JLabel();
        ImageIcon bckground = new ImageIcon("imgs/chat/background.png");
        background.setIcon(bckground);
        background.setBounds(0, 0, 1027, 580);

        // ============================
        // JLabel for panel
        // ============================
        JLabel pane = new JLabel();
        ImageIcon pne = new ImageIcon("imgs/chat/pane.png");
        pane.setIcon(pne);
        pane.setBounds(20, 20, 900, 490);

        // npc's labels
        JLabel c1 = new JLabel();
        JLabel c2 = new JLabel();
        JLabel c3 = new JLabel();

        // bar npc's labels
        JLabel stbar1 = new JLabel();
        JLabel stbar2 = new JLabel();
        JLabel stbar3 = new JLabel();
        ImageIcon lockedBar = new ImageIcon("imgs/chat/lockedBar.png");

        stbar1.setVisible(true);
        stbar1.setOpaque(true);
        stbar1.setBackground(Color.decode("#f7f7f0"));
        stbar1.setBounds(410, 380, 250, 82);

        stbar2.setVisible(true);
        stbar2.setOpaque(true);
        stbar2.setBackground(Color.decode("#f7f7f0"));
        stbar2.setBounds(410, 250, 250, 82);

        stbar3.setVisible(true);
        stbar3.setOpaque(true);
        stbar3.setBounds(410, 120, 250, 80);

        if (petPointer.getIslove() == false) {
            stbar1.setIcon(lockedBar);
            stbar2.setIcon(lockedBar);
            stbar3.setIcon(lockedBar);

            ImageIcon locked = new ImageIcon("imgs/chat/lock.png");
            c1.setIcon(locked);
            c2.setIcon(locked);
            c3.setIcon(locked);
            c1.setBounds(180, 340, 300, 170);
            c2.setBounds(180, 210, 300, 170);
            c3.setBounds(180, 80, 300, 170);

        } else {
            timer();
            ImageIcon c1character = new ImageIcon("imgs/chat/duck.png");
            ImageIcon c2character = new ImageIcon("imgs/chat/bunny.png");
            ImageIcon c3character = new ImageIcon("imgs/chat/rat.png");

            ImageIcon noHeart = new ImageIcon("imgs/chat/noHeart.png");
            ImageIcon oneHeart = new ImageIcon("imgs/chat/oneHeart.png");
            ImageIcon twoHeart = new ImageIcon("imgs/chat/twoHeart.png");
            ImageIcon threeHeart = new ImageIcon("imgs/chat/threeHeart.png");

            c1.setIcon(c1character);
            c2.setIcon(c2character);
            c3.setIcon(c3character);
            c1.setBounds(255, 340, 300, 170);
            c2.setBounds(255, 210, 300, 170);
            c3.setBounds(255, 80, 300, 170);

            stbar1.setIcon(noHeart);
            stbar1.setBounds(410, 380 + 10, 250, 75);
            stbar2.setIcon(noHeart);
            stbar2.setBounds(410, 250 + 10, 250, 75);
            stbar3.setIcon(noHeart);
            stbar3.setBounds(410, 120 + 10, 250, 75);

            // c1
            if (petPointer.getLoveNpc1() >= 10) {
                // one heart    
                stbar1.setIcon(oneHeart);

                if (petPointer.getLoveNpc1() >= 40) {
                    // two hearts
                    stbar1.setIcon(twoHeart);
                    if (petPointer.getLoveNpc1() >= 70) {
                        // thre hearts
                        stbar1.setIcon(threeHeart);
                    }
                }
            }
            // c2
            if (petPointer.getLoveNpc2() > 10) {
                stbar2.setIcon(oneHeart);   
                if(petPointer.getLoveNpc2() >= 40){
                    stbar2.setIcon(twoHeart);
                    if(petPointer.getLoveNpc2() >= 70){
                        stbar2.setIcon(threeHeart);
                    }
                }
            }
            // c3
            if (petPointer.getLoveNpc3() > 10) {
                stbar3.setIcon(oneHeart);
                if(petPointer.getLoveNpc3() >=40){
                    stbar3.setIcon(twoHeart);
                    if(petPointer.getLoveNpc3() >= 70){
                        stbar3.setIcon(threeHeart);
                    }
                }
            }

        }

        // ===================
        // Frame
        // ===================
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(950, 600);
        frame.setVisible(true);
        frame.setResizable(false);

        tela.add(stbar3, Integer.valueOf(3));
        tela.add(stbar2, Integer.valueOf(3));
        tela.add(stbar1, Integer.valueOf(3));
        tela.add(c3, Integer.valueOf(2));
        tela.add(c2, Integer.valueOf(2));
        tela.add(c1, Integer.valueOf(2));
        tela.add(pane, Integer.valueOf(1));
        tela.add(background, Integer.valueOf(0));
        frame.add(tela);
    }
    protected void timer() {
        Timer timer = new Timer();
        TimerTask tarefa = new TimerTask()  {
            @Override
            public void run() {
                //love ta ficando neg
                System.out.print("entrou pra tirar\n"+ "npc1: "+petPointer.getLoveNpc1());
                petPointer.setLoveNpc1(-5);
                petPointer.setLoveNpc2(-5);
                petPointer.setLoveNpc3(-5);
            }
        };
        timer.scheduleAtFixedRate(tarefa, 0, 25000);
    }

}
