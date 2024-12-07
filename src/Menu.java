import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pet.coelho;
import pet.coelho;

public class Menu implements ActionListener {
    JButton jogar = new JButton("Jogar");
    JButton info = new JButton("Info");
    JButton sair = new JButton("Sair");
    JFrame frame = new JFrame();
   

    public void call() {
       

        //LOGO ===================================
        JLabel logo = new JLabel();
        ImageIcon icon = new ImageIcon("imgs/logo.png");
        logo.setVisible(true);
        logo.setOpaque(true);
        logo.setIcon(icon);
        logo.setBounds(50, 0, 400, 250);
        frame.add(logo);
        //LOGO ===================================
        jogar.setFont(new Font(null, Font.PLAIN, 25));
        jogar.setFocusable(false);
        jogar.addActionListener(this);

        info.setFont(new Font(null, Font.PLAIN, 25));
        info.setFocusable(false);
        info.addActionListener(this);

        sair.setFont(new Font(null, Font.PLAIN, 25));
        sair.setFocusable(false);
        sair.addActionListener(this);
        //LABEL ===================================
        JLabel label = new JLabel();
        label.setBounds(40, 250, 400, 350);
        label.setOpaque(true);
        label.setLayout(new GridLayout(3, 1, 0, 50));
        label.add(jogar);
        label.add(info);
        label.add(sair);
        frame.add(label);
        //LABEL ===================================



        //FRAME ===================================
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        //FRAME ===================================
    }

    @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jogar) {
                frame.dispose();
                choose c = new choose();
                c.choose();
                //Principal p = new Principal();
                //p.Principal();
            } else if(e.getSource() == info) {
                this.call();
                Info info = new Info();
            } else {
                int r = JOptionPane.showConfirmDialog(null, "Você quer mesmo sair do jogo ?", "Sair ?", JOptionPane.YES_NO_OPTION);
                if (r == 0){
                    frame.dispose();
                    System.exit(0);

            }
        }
    }
}
