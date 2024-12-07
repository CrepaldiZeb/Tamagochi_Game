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

public class Library implements ActionListener {
    JFrame frame = new JFrame(); // declaration for the frame
    JLayeredPane tela = new JLayeredPane();
    // Buttons declaration
    JButton chat = new JButton("Conversar");
    JButton back = new JButton(new ImageIcon("imgs/city/back.png"));
    // ========================
    //      Variables
    // ========================
    // pointer to get the Pet
    Pet petpointer;
    // will get the number of the sprite that will show up
    int sprite;
    // will check when a button was clicked so the animation show up
    boolean bol;
    // counter for the animation and variables to move the sprite
    int c = 0;
    int npcx = 420;
    int npcy = 130;
    int y = -1;
    int x = -1;

    // ===============================
    // Images for the npc animation
    // ===============================
    ImageIcon npc = new ImageIcon("imgs/city/normalDuck.png");
    ImageIcon npcHappy = new ImageIcon("imgs/city/happyduck.png");
    ImageIcon npcSad = new ImageIcon("imgs/city/sadDuck.png");
    ImageIcon lheart = new ImageIcon("imgs/city/lHeart.png");
    ImageIcon rheart = new ImageIcon("imgs/city/rHeart.png");
    // label for the npc
    JLabel npcSprite = new JLabel();
    // labels for the extra sprite animation
    JLabel rHeart = new JLabel();
    JLabel lHeart = new JLabel();

    public Library(Pet p) {
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
        ImageIcon bckground = new ImageIcon("imgs/city/libBackground.png");
        background.setIcon(bckground);
        background.setBounds(0, 0, 1027, 580);

        // ==============================
        // JLabel for the library sprite
        // ==============================
        JLabel library = new JLabel();
        ImageIcon lib = new ImageIcon("imgs/city/lib.png");
        library.setIcon(lib);
        library.setBounds(300, 1, 480, 480);

        // ===========================
        // JPanel for the chat button
        // ===========================
        JPanel bt = new JPanel();
        bt.setLayout(new GridLayout(1, 1, 5, 5));
        bt.setBounds(430, 460, 350, 100);
        // chat button ====================
        chat.addActionListener(this);
        chat.setBackground(Color.decode("#9a140c"));
        chat.setFont(new Font("Neue Machina Ultra Bold", Font.BOLD, 25));
        chat.setFocusable(false);
        chat.setForeground(Color.white);
        bt.add(chat);

        // ===========================
        // JPanel for the back button
        // ===========================
        JLabel bt2 = new JLabel();
        bt2.setLayout(new GridLayout(1, 1, 0, 0));
        bt2.setBounds(300, 460, 130, 100);
        // back button =====================
        back.addActionListener(this);
        back.setFocusable(false);
        back.setBackground(Color.decode("#9a140c"));
        bt2.add(back);

        // =======================
        // Sprites
        // =======================
        // npc basic sprite
        npcSprite.setIcon(npc);
        npcSprite.setBounds(420, 130, 300, 348);
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
        tela.add(library, Integer.valueOf(1));
        tela.add(background, Integer.valueOf(0));
        frame.add(tela);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // clicked on the chat button
        if (e.getSource() == this.chat) {
            // Call the option frame ======================
            libChat libchat = new libChat(petpointer);
            libchat.libChatAction();

            // ===================
            // Timer
            // ===================
            Timer timer = new Timer();
            TimerTask tarefa = new TimerTask() {
                @Override
                public void run() {
                    // check if one option was choosen
                    bol = libchat.getBol();
                    // check the sprite that will show up
                    sprite = libchat.getSprite();

                    // if one option is choosen ===============
                    if (bol == true && c < 20) {
                        switch (sprite) {
                            case 1:
                                // friendly and funny case
                                npcSprite.setIcon(npcHappy);
                                npcSprite.setBounds(420, npcy, 300, 348);
                                break;
                            case 2:
                                // romantic case
                                npcSprite.setIcon(npcHappy);
                                npcSprite.setBounds(420, npcy, 300, 348);
                                // ===================
                                // Hearts Sprites
                                // ===================
                                lHeart.setIcon(lheart);
                                lHeart.setVisible(true);
                                lHeart.setBounds(540, npcy - 30, 40, 37);
                                rHeart.setIcon(rheart);
                                rHeart.setVisible(true);
                                rHeart.setBounds(590, npcy, 40, 37);

                                // if the time for the animation ended, the hearts get not visible
                                if (c == 19) {
                                    lHeart.setVisible(false);
                                    rHeart.setVisible(false);
                                }
                                break;
                            case 3:
                                // sad case
                                npcSprite.setIcon(npcSad);
                                npcSprite.setBounds(npcx, 130, 300, 348);

                                // ==========================
                                // Moving sprite x variable
                                // =========================

                                // max value that the sprite goes to the left side is 417
                                if (npcx == 417) {
                                    x *= -1; // set the variable positive
                                } else if (npcx == 423) {
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
                        if (npcy == 126) {
                            y *= -1; // set the variable positive
                        } else if (npcy == 130) {
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
                        npcy = 130;
                        npcx = 420;
                        // set the variable that checks if a animation should happen
                        libchat.setBol(false);
                        libchat.setSprite(0);
                        // set the normal sprite on the npc label
                        npcSprite.setIcon(npc);
                        npcSprite.setBounds(420, 130, 300, 348);
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
