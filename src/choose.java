import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class choose implements ActionListener {
    //classe vai servir para pegar o nome do pet escolhido pelo usuario e a opçao de pet
    public String name; 
    public int op; 
    boolean out = true;

    //================================
    //      GET E SET
    //================================
    public String getname(){
        return name;
    }
    public void setname(String _name){
        this.name = _name;
    }

    public int getOp(){
        return op;
    }
    public void setOp(int _op){
        this.op = _op;
    }
    
   
    JFrame frame = new JFrame();
    // Imagens ======================
    ImageIcon pt = new ImageIcon("imgs/Pato/patod.png");
    ImageIcon co = new ImageIcon("imgs/Coelho/coelhod.png");
    ImageIcon rt = new ImageIcon("imgs/Rato/ratod.png");

    ImageIcon pa = new ImageIcon("imgs/Pato/patoa.png");
    ImageIcon ca = new ImageIcon("imgs/Coelho/coelhoa.png");
    ImageIcon ra = new ImageIcon("imgs/Rato/ratoa.png");

    //botão para começar o jogo > vai charmar a classe "Principal"
    JButton start = new JButton();
    //ipname > variavel que vai armazenar o nome do pet
    JTextField ipname = new JTextField();
    JRadioButton pato = new JRadioButton();
    JRadioButton coelho = new JRadioButton();
    JRadioButton rato = new JRadioButton();

    public void choose(){
      
        JPanel paneop = new JPanel();
        JLabel lb = new JLabel();
        JPanel bt = new JPanel();
        JPanel st = new JPanel(); 

        st.setOpaque(true);
        st.setBounds(450,300,120,40);
        
        start.setText("Começar");
        start.setFont(new Font(null,Font.PLAIN,17));
        start.setFocusable(false);
        start.addActionListener(this);

        pato.setIcon(pt);
        pato.addActionListener(this);

        coelho.setIcon(co);
       coelho.addActionListener(this);

        rato.setIcon(rt);
        rato.addActionListener(this);

        lb.setText("Nome do pet:");
        lb.setFont(new Font(null,Font.BOLD,25));
        paneop.setOpaque(true);
        paneop.add(lb,JFrame.TOP_ALIGNMENT);
        paneop.add(ipname);
        ipname.setPreferredSize(new Dimension(300,40));
        ipname.setHorizontalAlignment(JTextField.RIGHT);
        ipname.setFont(new Font(null,Font.PLAIN,20));
        paneop.setBounds(0,35,600,50);

        bt.setLayout(new GridLayout(1,2,0,25));
        bt.setOpaque(true);
        bt.setBounds(25,120,535,150);

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(600,400);
        bt.add(pato);
        bt.add(coelho);
        bt.add(rato);
        st.add(start);
        frame.add(st);
        frame.add(st);
        frame.add(paneop);
        frame.add(bt);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        while(out){
            System.out.println("");
        }

    }
    @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == pato){
                pato.setIcon(pa);
                rato.setIcon(rt);
                coelho.setIcon(co);
                op=1;
            }
            else if(e.getSource() == rato){
                pato.setIcon(pt);
                rato.setIcon(ra);
                coelho.setIcon(co);
                op=2;
            }
            else if(e.getSource() == coelho){
                pato.setIcon(pt);
                rato.setIcon(rt);
                coelho.setIcon(ca);
                op=3;
            }
            else if(e.getSource() == start){
                out = false;
                name = ipname.getText();
                //System.out.println(name);
                Principal jogo = new Principal();
                jogo.definePet(op, name);
                frame.setVisible(false);
                jogo.Principal();
            }
            
        }
    

          
}