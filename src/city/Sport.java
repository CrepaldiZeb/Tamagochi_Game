package city;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import pet.Pet;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class Sport implements ActionListener {
    JFrame frame = new JFrame(); // declaration for the frame
    JLayeredPane tela = new JLayeredPane();
    // Buttons declaration
    JButton chat = new JButton("Conversar");
    JButton back = new JButton(new ImageIcon("imgs/city/back.png"));
    // ========================
    // Variables
    // ========================
    // pointer to get the Pet
    Pet petpointer;
    // will get the number of the sprite that will show up
    int sprite;
    // will check when a button was clicked so the animation show up
    boolean bol;
    // counter for the animation and variables to move the sprite
    int c = 0;
    int npcx = 460;
    int npcy = 82;
    int y = -1;
    int x = -1;

    // ===============================
    // Images for the npc animation
    // ===============================
    ImageIcon npc = new ImageIcon("imgs/city/normalBunny.png");
    ImageIcon npcHappy = new ImageIcon("imgs/city/happyBunny.png");
    ImageIcon npcSad = new ImageIcon("imgs/city/sadBunny.png");
    ImageIcon lheart = new ImageIcon("imgs/city/lHeart.png");
    ImageIcon rheart = new ImageIcon("imgs/city/rHeart.png");
    // label for the npc
    JLabel npcSprite = new JLabel();
    // labels for the extra sprite animation
    JLabel rHeart = new JLabel();
    JLabel lHeart = new JLabel();

    public void SportAction(Pet p) {
        petpointer = p;
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
        ImageIcon bckground = new ImageIcon("imgs/city/sportBackground.png");
        background.setIcon(bckground);
        background.setBounds(0, 0, 1027, 580);

        // ==============================
        // JLabel for the sport sprite
        // ==============================
        JLabel sport = new JLabel();
        ImageIcon sp = new ImageIcon("imgs/city/sport.png");
        sport.setIcon(sp);
        sport.setBounds(340, 1, 480, 480); // + 40 no x

        // ===========================
        // JPanel for the chat button
        // ===========================
        JPanel bt = new JPanel();
        bt.setLayout(new GridLayout(1, 1, 5, 5));
        bt.setBounds(470, 470, 350, 90);
        // chat button ====================
        chat.addActionListener(this);
        chat.setBackground(Color.decode("#d0c8a9"));
        chat.setFont(new Font("Neue Machina Ultra Bold", Font.BOLD, 25));
        chat.setFocusable(false);
        chat.setForeground(Color.white);
        bt.add(chat);
        // ===========================
        // JPanel for the back button
        // ===========================
        JLabel bt2 = new JLabel();
        bt2.setLayout(new GridLayout(1, 1, 0, 0));
        bt2.setBounds(340, 470, 130, 90);
        // back button =====================
        back.addActionListener(this);
        back.setFocusable(false);
        back.setBackground(Color.decode("#d0c8a9"));
        bt2.add(back);

        // =======================
        // Sprites
        // =======================
        // npc basic sprite
        npcSprite.setIcon(npc);
        npcSprite.setBounds(460, 82, 300, 390); // x > + 30 y : 48
        // add the hearts sprite on the frame but do not show them
        lHeart.setVisible(false);
        rHeart.setVisible(false);

        // ===================
        // Frame
        // ===================
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1027, 600);
        frame.setVisible(true);
        frame.setResizable(false);
        tela.add(rHeart, Integer.valueOf(3));
        tela.add(lHeart, Integer.valueOf(3));
        tela.add(npcSprite, Integer.valueOf(3));
        tela.add(bt2, Integer.valueOf(2));
        tela.add(bt, Integer.valueOf(2));
        tela.add(sport, Integer.valueOf(1));
        tela.add(background, Integer.valueOf(0));
        frame.add(tela);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.chat) {
            // Call the option frame =====================
            sportChat sportchat = new sportChat(petpointer);
            sportchat.sportChatAction();
            Timer timer = new Timer();
            TimerTask tarefa = new TimerTask() {
                @Override
                public void run() {
                    // check if one option was choosen
                    bol = sportchat.getBol();
                    // check the sprite that will show up
                    sprite = sportchat.getSprite();

                    // if one option is choosen ===============
                    if (bol == true && c < 20) {
                        switch (sprite) {
                            case 1:
                                // friendly and funny case
                                npcSprite.setIcon(npcHappy);
                                npcSprite.setBounds(460, npcy, 300, 390);
                                break;
                            case 2:
                                // romantic case
                                npcSprite.setIcon(npcHappy);
                                npcSprite.setBounds(460, npcy, 300, 390);
                                // ===================
                                // Hearts Sprites
                                // ===================
                                lHeart.setIcon(lheart);
                                lHeart.setVisible(true);
                                lHeart.setBounds(580, npcy - 50, 40, 37);
                                rHeart.setIcon(rheart);
                                rHeart.setVisible(true);
                                rHeart.setBounds(630, npcy - 20, 40, 37);

                                // if the time for the animation ended, the hearts get not visible
                                if (c == 19) {
                                    lHeart.setVisible(false);
                                    rHeart.setVisible(false);
                                }
                                break;
                            case 3:
                                // sad case
                                npcSprite.setIcon(npcSad);
                                npcSprite.setBounds(npcx, 82, 300, 390);

                                // ==========================
                                // Moving sprite x variable
                                // =========================

                                // max value that the sprite goes to the left side is 417
                                if (npcx == 457) {
                                    x *= -1; // set the variable positive
                                } else if (npcx == 463) {
                                    x = -1; // set the variable negative
                                }
                                break;
                            case 0:
                                // nothing happen
                                break;
                        }
                        // ===========================
                        // Moving sprite y variable
                        // ==========================

                        // max value that the sprite goes up is 126
                        if (npcy == 78) {
                            y *= -1; // set the variable positive
                        } else if (npcy == 82) {
                            y = -1; // set the variable negative
                        }
                        // sum the varibles to move the coordinates
                        npcx += x;
                        npcy += y;
                        // increments the counter for the animation
                        c++;
                    }
                    // if the counter got into the max value --- 20
                    if (c > 19) {
                        // zero the counter and sets the coordinates variables
                        c = 0;
                        npcy = 82;
                        npcx = 460;
                        // set the variable that checks if a animation should happen
                        sportchat.setBol(false);
                        sportchat.setSprite(0);
                        // set the normal sprite on the npc label
                        npcSprite.setIcon(npc);
                        npcSprite.setBounds(460, 82, 300, 390);
                    }
                }
            };
            timer.scheduleAtFixedRate(tarefa, 0, 100);

        } else if (e.getSource() == this.back) {
            // back option that dispose the frame
            frame.dispose();
        }
    }

}
