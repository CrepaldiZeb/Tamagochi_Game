package PrincipalActions;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import city.Coffee;
import city.Library;
import city.Sport;
import pet.Pet;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CityAction implements ActionListener {

    JFrame frame = new JFrame();
    JLayeredPane tela = new JLayeredPane();

    Pet petPointer;
    JButton lib = new JButton("Biblioteca");
    JButton cof = new JButton("Café");
    JButton sport = new JButton("Quadra");

    public CityAction(Pet p) {
        petPointer = p;
        System.out.println(petPointer.getType());

        // ==============================
        // JLabel for background image
        // ==============================
        JLabel background = new JLabel();
        ImageIcon bck = new ImageIcon("imgs/city/background.png");
        background.setIcon(bck);
        background.setBounds(0, 0, 1027, 600);

        // ==============================
        // JLabel for option pane
        // ==============================
        JLabel option = new JLabel();
        ImageIcon pn = new ImageIcon("imgs/city/pane.png");
        option.setIcon(pn);
        option.setLabelFor(null);
        option.setBounds(320, 30, 420, 518);

        // ==============================
        // Buttons
        // ==============================
        lib.addActionListener(this);
        lib.setBackground(Color.decode("#ffdc5e"));
        lib.setFont(new Font("Neue Machina Ultra Bold", Font.BOLD, 21));
        lib.setFocusable(false);
        lib.setForeground(Color.white);

        cof.addActionListener(this);
        cof.setBackground(Color.decode("#ffdc5e"));
        cof.setFont(new Font("Neue Machina Ultra Bold", Font.BOLD, 21));
        cof.setFocusable(false);
        cof.setForeground(Color.white);

        sport.addActionListener(this);
        sport.setBackground(Color.decode("#ffdc5e"));
        sport.setFont(new Font("Neue Machina Ultra Bold", Font.BOLD, 21));
        sport.setFocusable(false);
        sport.setForeground(Color.white);

        JPanel bt = new JPanel();
        bt.setLayout(new GridLayout(3, 1, 0, 20));
        bt.setBounds(405, 190, 250, 220);
        bt.setBackground(Color.decode("#f7f7f0"));
        bt.add(lib);
        bt.add(cof);
        bt.add(sport);

        // ===================
        // Frame
        // ===================
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1027, 600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(bt, Integer.valueOf(2));
        frame.add(option, Integer.valueOf(1));
        frame.add(background, Integer.valueOf(0));
        frame.add(tela);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.lib) {
            Library library = new Library(petPointer);
            frame.dispose();
        }else if(e.getSource() == this.cof){
            Coffee coffe = new Coffee();
            coffe.CoffeAction(petPointer);
            frame.dispose();
        }else if(e.getSource() == this.sport){
            Sport sp = new Sport();
            sp.SportAction(petPointer);
            frame.dispose();
        }
    }
}
