package city;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pet.Pet;

public class sportChat implements ActionListener{
    JFrame frame = new JFrame(); // declaration for the frame
    JLayeredPane tela = new JLayeredPane();
    // Buttons declaration
    JButton friendly = new JButton("Amigavel");
    JButton romantic = new JButton("Romântico");
    JButton mean = new JButton("Maldoso");
    JButton funny = new JButton("Engraçado");
    // ========================
    // Variables
    // ========================

    // tells if an option was choose
    boolean bol;
    // tells wich sprite should be displayed
    int sprite;
    // pointer to get the Pet
    Pet petPointer;

    // ======================
    // constructor
    // ======================
    public sportChat(Pet p) {
        // set the pointer
        petPointer = p;
        // set initially bol as false to not display an sprite
        bol = false;
        sprite = 0;
    }

    // ======================
    // Gets and Sets
    // ======================
    public boolean getBol() {
        return this.bol;
    }

    public void setBol(boolean t) {
        this.bol = t;
    }

    public void setSprite(int i) {
        this.sprite = i;
    }

    public int getSprite() {
        return this.sprite;
    }
    public void sportChatAction(){
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
        ImageIcon bckground = new ImageIcon("imgs/city/sportconv.png");
        background.setIcon(bckground);
        background.setBounds(0, 0, 1027, 580);

        // ============================
        // JPanel for buttons
        // ============================
        JPanel bt = new JPanel();
        bt.setLayout(new GridLayout(4, 1, 0, 20));
        bt.setBounds(380, 100, 320, 380);
        bt.add(friendly);
        bt.add(romantic);
        bt.add(mean);
        bt.add(funny);

         // =====================
        // Buttons features
        // =====================
        friendly.addActionListener(this);
        friendly.setBackground(Color.decode("#d0c8a9"));
        friendly.setFont(new Font("Neue Machina Ultra Bold", Font.BOLD, 21));
        friendly.setFocusable(false);
        friendly.setForeground(Color.white);

        romantic.addActionListener(this);
        romantic.setBackground(Color.decode("#d0c8a9"));
        romantic.setFont(new Font("Neue Machina Ultra Bold", Font.BOLD, 21));
        romantic.setFocusable(false);
        romantic.setForeground(Color.white);

        mean.addActionListener(this);
        mean.setBackground(Color.decode("#d0c8a9"));
        mean.setFont(new Font("Neue Machina Ultra Bold", Font.BOLD, 21));
        mean.setFocusable(false);
        mean.setForeground(Color.white);

        funny.addActionListener(this);
        funny.setBackground(Color.decode("#d0c8a9"));
        funny.setFont(new Font("Neue Machina Ultra Bold", Font.BOLD, 21));
        funny.setFocusable(false);
        funny.setForeground(Color.white);

        // ===================
        // Frame
        // ===================
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1027, 600);
        frame.setVisible(true);
        frame.setResizable(false);
        tela.add(bt, Integer.valueOf(1));
        tela.add(background, Integer.valueOf(0));
        frame.add(tela);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == friendly) {
            // more 10 love
            petPointer.socialize(10, "npc2"); // sets npc2 love
            // will return to the Library the sprite to be animated
            sprite = 1;
            bol = true;
            frame.dispose();
        } else if (e.getSource() == romantic) {
            // more 15 love
            petPointer.socialize(15, "npc2"); // sets npc2 love
            // will return to the Library the sprite to be animated
            sprite = 2;
            bol = true;
            frame.dispose();
        } else if (e.getSource() == mean) {
            // less 15 love
            petPointer.socialize(-15, "npc2"); // sets npc2 love
            // will return to the Library the sprite to be animated
            sprite = 3;
            bol = true;
            frame.dispose();

        } else if (e.getSource() == funny) {
            // more 5 love
            petPointer.socialize(5, "npc2"); // sets npc2 love
            // will return to the Library the sprite to be animated
            sprite = 1;
            bol = true;
            frame.dispose();
        }
    }

}
