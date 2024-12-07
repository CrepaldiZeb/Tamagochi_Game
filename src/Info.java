import javax.swing.*;
import java.awt.*;

public class Info  {
    JFrame frame1 = new JFrame();
    JButton voltar = new JButton();

    Info(){
        frame1.setLayout(null);
        //PATO ===============================
        JLabel pato = new JLabel();
        ImageIcon patoP = new ImageIcon("imgs/Info/pato.png");
        pato.setIcon(patoP);
        pato.setFont(new Font(null,Font.PLAIN,22));
        pato.setForeground(Color.black);
        pato.setText("<html><p>Buff de 10% em tarefas que exijam:</p>Humor, Saude.<p><br>Debuff de 10% em tarefas que exijam:</p>Lógica</html>");
        pato.setIconTextGap(75);
        pato.setVerticalTextPosition(JLabel.BOTTOM);
        pato.setHorizontalTextPosition(JLabel.CENTER);
        pato.setVerticalAlignment(JLabel.CENTER);
        pato.setHorizontalAlignment(JLabel.CENTER);
        JPanel pp = new JPanel();
        pp.setOpaque(true);
        pp.setBackground(new Color(0xFFd33b));
        pp.setBounds(15,0,400,670);
        pp.setBorder(BorderFactory.createEmptyBorder(70,10,10,10));
        pp.add(pato);
        frame1.add(pp);
        //PATO ===============================

        //RATO ===============================
        JLabel rato = new JLabel();
        ImageIcon ratoP = new ImageIcon("imgs/Info/rato.png");
        rato.setIcon(ratoP);
        rato.setFont(new Font(null,Font.PLAIN,22));
        rato.setForeground(Color.black);
        rato.setText("<html><p>Buff de 10% em tarefas que exijam:</p>Lógica.<p><br>Debuff de 10% em tarefas que exijam:</p>Humor, Saude.</html>");
        rato.setIconTextGap(70);
        rato.setVerticalTextPosition(JLabel.BOTTOM);
        rato.setHorizontalTextPosition(JLabel.CENTER);
        rato.setVerticalAlignment(JLabel.CENTER);
        rato.setHorizontalAlignment(JLabel.CENTER);
        JPanel pr = new JPanel();
        pr.setLayout(new BorderLayout());
        pr.setOpaque(true);
        pr.setBackground(new Color(0xD9D9D9));
        pr.setBounds(435,0,400,670);
        pr.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        pr.add(rato);
        frame1.add(pr);
        //RATO ===============================

        //COELHO ===============================
        JLabel coelho = new JLabel();
        ImageIcon coelhoP = new ImageIcon("imgs/Info/coelho.png");
        coelho.setIcon(coelhoP);
        coelho.setFont(new Font(null,Font.PLAIN,22));
        coelho.setForeground(Color.black);
        coelho.setText("<html><p>Buff de 5% em tarefas que exijam:</p>Lógica.<p><br>Debuff de 5% em tarefas que exijam:</p> Humor.</html>");
        coelho.setIconTextGap(70);
        coelho.setVerticalTextPosition(JLabel.BOTTOM);
        coelho.setHorizontalTextPosition(JLabel.CENTER);
        coelho.setVerticalAlignment(JLabel.CENTER);
        coelho.setHorizontalAlignment(JLabel.CENTER);
        JPanel pc = new JPanel();
        pc.setLayout(new BorderLayout());
        pc.setOpaque(true);
        pc.setBackground(new Color(0xFFF1F1));
        pc.setBounds(850,0,400,670);
        pc.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        pc.add(coelho);
        frame1.add(pc);
        //COELHO ===============================



        frame1.setVisible(true);
        frame1.getContentPane().setBackground(Color.black);
        frame1.setSize(1280,720);
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

}
