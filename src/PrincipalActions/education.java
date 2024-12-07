package PrincipalActions;

import javax.swing.JFrame;
import pet.Pet;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class education {
    JFrame frame = new JFrame();
    Pet petPointer;
    JLayeredPane tela = new JLayeredPane();
    JLabel sprite = new JLabel();
    JLabel action = new JLabel();
    JLabel logicp = new JLabel();
    JLabel tamacoinp = new JLabel(); // escrita da pontação
    JLabel tamacoin = new JLabel(); // moeda

    // tamacoin ===========================================
    ImageIcon tmcoin = new ImageIcon("imgs/educar/coin.png");
    ImageIcon tmc1 = new ImageIcon("imgs/educar/1tmc.png");
    ImageIcon tmc5 = new ImageIcon("imgs/educar/5tmc.png");
    ImageIcon tmc10 = new ImageIcon("imgs/educar/10tmc.png");
    ImageIcon tmc15 = new ImageIcon("imgs/educar/15tmc.png");
    // logic ==================================================
    ImageIcon lgc5 = new ImageIcon("imgs/educar/5lgc.png");
    ImageIcon lgc10 = new ImageIcon("imgs/educar/10lgc.png");

    // actions actions =============================================
    ImageIcon play = new ImageIcon("imgs/educar/music.png");
    ImageIcon paint = new ImageIcon("imgs/educar/paint.png");
    ImageIcon pc = new ImageIcon("imgs/educar/pc.png");
    ImageIcon read = new ImageIcon("imgs/educar/read.png");
    ImageIcon sport = new ImageIcon("imgs/educar/sport.png");
    ImageIcon meditate = new ImageIcon("imgs/educar/meditate.png");

    ImageIcon lHappyB = new ImageIcon("imgs/educar/LhappyB.png");
    ImageIcon lpissedB = new ImageIcon("imgs/educar/LpissedB.png");
    ImageIcon mHappyB = new ImageIcon("imgs/educar/MhappyB.png");
    ImageIcon mpissedB = new ImageIcon("imgs/educar/MpissedB.png");
    ImageIcon aHappyB = new ImageIcon("imgs/educar/AhappyB.png");
    ImageIcon apissedB = new ImageIcon("imgs/educar/ApissedB.png");

    ImageIcon lHappyD = new ImageIcon("imgs/educar/LhappyD.png");
    ImageIcon lpissedD = new ImageIcon("imgs/educar/LpissedD.png");
    ImageIcon mHappyD = new ImageIcon("imgs/educar/MhappyD.png");
    ImageIcon mpissedD = new ImageIcon("imgs/educar/MpissedD.png");
    ImageIcon aHappyD = new ImageIcon("imgs/educar/AhappyD.png");
    ImageIcon apissedD = new ImageIcon("imgs/educar/ApissedD.png");

    ImageIcon lHappyR = new ImageIcon("imgs/educar/LhappyR.png");
    ImageIcon lpissedR = new ImageIcon("imgs/educar/LpissedR.png");
    ImageIcon mHappyR = new ImageIcon("imgs/educar/MhappyR.png");
    ImageIcon mpissedR = new ImageIcon("imgs/educar/MpissedR.png");
    ImageIcon aHappyR = new ImageIcon("imgs/educar/AhappyR.png");
    ImageIcon apissedR = new ImageIcon("imgs/educar/ApissedR.png");

    String op;
    int ps;
    int c;

    int spritex = 450;
    int spritey = 300;
    int spriteh;
    int spritew;
    int x = -1;
    int y = -1;

    public education(Pet p) {
        //this.op = ed;
        petPointer = p;
        c = 0;
        spriteh = 0;
        spritew = 0;
    }

    public void eduationAnimation(String ed) {
        System.out.println("aqui");
        this.op = ed;
        // =======================
        // JLayeredPane
        // =======================
        tela.setBounds(0, 0, 1027, 600);
        tela.setOpaque(true);
        tela.setLayout(null);

        // ===========================
        // JLabel for the background
        // ===========================
        JLabel background = new JLabel();
        ImageIcon bckground = new ImageIcon("imgs/educar/education.png");
        background.setIcon(bckground);
        background.setBounds(0, 0, 1027, 580);

        switch (op) {
            case "play":
                if (petPointer.getType() == "coelho") {
                    // pos
                    ps = 1;
                } else if (petPointer.getType() == "rato") {
                    // neg
                    ps = 0;
                } else if (petPointer.getType() == "pato") {
                    // pos
                    ps = 1;
                }
                // seta a imagem de tamacoin e seta a imagem de logica
                tamacoinp.setIcon(tmc5);
                logicp.setIcon(lgc5);
                action.setIcon(play);
                break;
            case "pc":
                if (petPointer.getType() == "coelho") {
                    ps = 0;

                } else if (petPointer.getType() == "rato") {
                    ps = 1;
                    tamacoinp.setIcon(tmc15);
                    logicp.setIcon(lgc10);
                    action.setIcon(pc);
                    break;

                } else if (petPointer.getType() == "pato") {
                    ps = 0;
                }
                tamacoinp.setIcon(tmc10);
                logicp.setIcon(lgc10);
                action.setIcon(pc);
                break;
            case "read":
                if (petPointer.getType() == "coelho") {
                    ps = 1;
                } else if (petPointer.getType() == "rato") {
                    ps = 1;
                } else if (petPointer.getType() == "pato") {
                    ps = 0;
                }
                tamacoinp.setIcon(tmc5);
                logicp.setIcon(lgc10);
                action.setIcon(read);
                break;
            case "paint":
                if (petPointer.getType() == "coelho") {
                    ps = 1;
                    tamacoinp.setIcon(tmc15);
                    logicp.setIcon(lgc10);
                    action.setIcon(paint);
                    break;
                } else if (petPointer.getType() == "rato") {
                    ps = 1;
                } else if (petPointer.getType() == "pato") {
                    ps = 0;
                }
                tamacoinp.setIcon(tmc5);
                logicp.setIcon(lgc10);
                action.setIcon(paint);
                break;
            case "meditate":
                if (petPointer.getType() == "coelho") {
                    ps = 1;
                } else if (petPointer.getType() == "rato") {
                    ps = 0;
                } else if (petPointer.getType() == "pato") {
                    ps = 1;
                }
                tamacoinp.setIcon(tmc1);
                logicp.setIcon(lgc5);
                action.setIcon(meditate);
                break;
            case "sport":
                if (petPointer.getType() == "coelho") {
                    ps = 0;

                } else if (petPointer.getType() == "rato") {
                    ps = 0;
                } else if (petPointer.getType() == "pato") {
                    // fav
                    ps = 1;
                    logicp.setIcon(lgc10);
                    tamacoinp.setIcon(tmc15);
                    action.setIcon(sport);
                    break;
                }
                logicp.setIcon(lgc10);
                tamacoinp.setIcon(tmc1);
                action.setIcon(sport);
                break;

            default:
                System.exit(1);
                break;
        }

        switch (petPointer.getType()) {
            case "coelho":
                if (petPointer.getAge() < 1020) {
                    // baby
                    spriteh = 226;
                    spritew = 150;
                    if (ps == 1) {
                        // happy sprite
                        sprite.setIcon(lHappyB);
                    } else {
                        // pissed sprite
                        sprite.setIcon(lpissedB);
                    }
                } else if (petPointer.getAge() > 1020 && petPointer.getAge() < 2400) {
                    // teen
                    spriteh = 270;
                    spritew = 150;
                    if (ps == 1) {
                        sprite.setIcon(mHappyB);
                    } else {
                        sprite.setIcon(mpissedB);
                    }
                } else if (petPointer.getAge() > 2400) {
                    // adult
                    spriteh = 250;
                    spritew = 150;
                    if (ps == 1) {
                        sprite.setIcon(aHappyB);
                    } else {
                        sprite.setIcon(apissedB);
                    }
                }
                break;
            case "rato":
                if(petPointer.getAge() < 1020){
                    spritew = 150;
                    spriteh = 118;
                    if(ps == 1){
                        sprite.setIcon(lHappyR);
                    }else{
                        sprite.setIcon(lpissedR);
                    }
                }else if(petPointer.getAge() > 1020 && petPointer.getAge() < 2400){
                    spritew = 150;
                    spriteh = 150;
                    if(ps == 1){
                        sprite.setIcon(mHappyR);
                    }else{
                        sprite.setIcon(mpissedR);
                    }
                }else if(petPointer.getAge() > 2400){
                    spritew=150;
                    spriteh=191;
                    if(ps == 1){
                        sprite.setIcon(aHappyR);
                    }else{
                        sprite.setIcon(apissedR);
                    }
                }
                break;
            case "pato":
                if(petPointer.getAge() < 1020){
                    spritew = 150;
                    spriteh = 156;
                    if(ps == 1){
                        sprite.setIcon(lHappyD);
                    }else{
                        sprite.setIcon(lpissedD);
                    }
                }else if(petPointer.getAge() > 1020 && petPointer.getAge() < 2400){
                    spritew = 150;
                    spriteh = 170;
                    if(ps==1){
                        sprite.setIcon(mHappyD);
                    }else{
                        sprite.setIcon(mpissedD);
                    }
                }else if(petPointer.getAge() > 2400){
                    spritew =150;
                    spriteh = 191;
                    if(ps ==1){
                        sprite.setIcon(aHappyD);
                    }else{
                        sprite.setIcon(apissedD);
                    }
                }
                break;
            default:
                System.exit(1);
                break;
        }

        action.setBounds(350, 300, 100, 112);
        action.setVisible(false);
        // action.setIcon(play);

        // sprite.setBounds(450, 300, 150, 226);
        sprite.setVisible(false);
        // sprite.setIcon(lHappyB);

        // logicp.setIcon(lp);
        logicp.setBounds(430, 100, 150, 33);
        logicp.setVisible(false);

        // moeda
        tamacoin.setIcon(tmcoin);
        tamacoin.setBounds(400, 62, 100, 100);
        tamacoin.setVisible(false);

        tamacoinp.setBounds(430, 100, 150, 20);

        timer();
        // ================================
        // Frame
        // ================================

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1027, 600);
        frame.setVisible(true);
        tela.add(tamacoinp, Integer.valueOf(2));
        tela.add(tamacoin, Integer.valueOf(2));
        tela.add(logicp, Integer.valueOf(2));
        tela.add(action, Integer.valueOf(1));
        tela.add(sprite, Integer.valueOf(1));
        tela.add(background, Integer.valueOf(0));
        frame.setResizable(false);
        frame.add(tela);
    }

    // ==================
    // Timer
    // ==================
    protected void timer() {
        Timer timer = new Timer();
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                if (c < 30) {
                    switch (ps) {
                        case 1:
                            // positivo move no y
                            sprite.setVisible(true);
                            sprite.setBounds(450, spritey, spritew, spriteh);
                            action.setVisible(true);
                            action.setBounds(350, spritey - 50, 100, 112);
                            if (c < 15) {
                                tamacoinp.setVisible(true);
                                tamacoin.setVisible(true);
                            }
                            if (c > 15) {
                                tamacoinp.setVisible(false);
                                tamacoin.setVisible(false);
                                logicp.setVisible(true);
                            }
                            if (spritey == 296) {
                                y *= -1;
                            } else if (spritey == 300) {
                                y = -1;
                            }
                            break;
                        case 0:
                            // move no x
                            sprite.setVisible(true);
                            sprite.setBounds(spritex, 300, spritew, spriteh);
                            action.setVisible(true);
                            action.setBounds(spritex - 100, 250, 100, 112);
                            if (c < 15) {
                                tamacoinp.setVisible(true);
                                tamacoin.setVisible(true);
                            }
                            if (c > 15) {
                                tamacoinp.setVisible(false);
                                tamacoin.setVisible(false);
                                logicp.setVisible(true);
                            }
                            if (spritex == 447) {
                                x *= -1;
                            } else if (spritex == 453) {
                                x = -1;
                            }
                            break;

                    }
                    spritex += x;
                    spritey += y;
                    c++;
                } else if (c == 30) {
                    spritex = 450;
                    spritey = 300;
                    x = -1;
                    y = -1;
                    frame.dispose();
                }
            }
        };
        timer.scheduleAtFixedRate(tarefa, 0, 100);

    }

}
