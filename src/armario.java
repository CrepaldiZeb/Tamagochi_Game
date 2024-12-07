import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pet.Pet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class armario implements ActionListener{
    JFrame frame = new JFrame();
    JLayeredPane tela = new JLayeredPane();
    JButton back = new JButton();
    JButton next = new JButton();
    JButton comprar = new JButton();
    JLabel roupas = new JLabel();
    JLabel info = new JLabel();
    Pet pt;
    ImageIcon vetor[] = new ImageIcon[9];
    String text[] = new String[9];
    int i;





     public armario(Pet p){
        i=0;  
        pt = p;
        vetor[0] = new ImageIcon("imgs/Principal/cenario/Acessórios/preview/sem.png");
        vetor[1] =  new ImageIcon("imgs/Principal/cenario/Acessórios/preview/chapeu.png");
        vetor[2] =  new ImageIcon("imgs/Principal/cenario/Acessórios/preview/fita.png");
        vetor[3] =  new ImageIcon("imgs/Principal/cenario/Acessórios/preview/flor.png");
        vetor[4] =  new ImageIcon("imgs/Principal/cenario/Acessórios/preview/oculos.png");
        vetor[5] =  new ImageIcon("imgs/Principal/cenario/Acessórios/preview/p_colorido.png");
        vetor[6] =  new ImageIcon("imgs/Principal/cenario/Acessórios/preview/p_loira.png");
        vetor[7] =  new ImageIcon("imgs/Principal/cenario/Acessórios/preview/p_topete.png");
        vetor[8] =  new ImageIcon("imgs/Principal/cenario/Acessórios/preview/gravata.png");

        text[0] = "0";
        text[1] =  "15";
        text[2] =  "15";
        text[3] =  "15";
        text[4] =  "20";
        text[5] =  "25";
        text[6] =  "25";
        text[7] =  "25";
        text[8] =  "20";

        
        JLabel armario = new JLabel();
        ImageIcon armar;
        if(pt.tipo() == "pato")
          armar = new ImageIcon("imgs/Principal/cenario/Acessórios/armario_p.png");
        else if(pt.tipo() == "rato")
          armar = new ImageIcon("imgs/Principal/cenario/Acessórios/armario_r.png");
        else
          armar = new ImageIcon("imgs/Principal/cenario/Acessórios/armario_c.png");
        
        tela.setLayout(null);
        
        armario.setIcon(armar);
        armario.setBounds(0,0,1027,600);

        roupas.setIcon(vetor[0]);
        roupas.setBounds(0,0,1027,600);

        info.setText("Preço: " + text[0] +"T");
        info.setBounds(635, 440, 150, 50);
        info.setFont(new Font(null,Font.BOLD,25)); 
        info.setForeground(Color.BLACK); 
        
        
        back.setBounds(400,280,80,50);
        ImageIcon bk = new ImageIcon("imgs/Principal/cenario/Acessórios/preview/back.png");
        back.setBackground( new Color(202, 97, 22));//ca6116
        back.setFocusable(false);
        back.setBorder(null);
        back.setIcon(bk);
        back.addActionListener(this);

        next.setBounds(880,280,80,50);
        ImageIcon nx = new ImageIcon("imgs/Principal/cenario/Acessórios/preview/next.png");
        next.setBackground( new Color(202, 97, 22));//ca6116
        next.setFocusable(false);
        next.setBorder(null);
        next.setIcon(nx);
        next.addActionListener(this);

     
        comprar.setBounds(830,480,150,80);
        comprar.setText("Comprar");  
        comprar.addActionListener(this);
        comprar.setFont(new Font(null,Font.BOLD,25));
        comprar.setFocusable(false);

        tela.setBounds(0, 0, 1027, 600);
        tela.setBackground(Color.CYAN);
        tela.setOpaque(true);

        tela.add(comprar,Integer.valueOf(3));  
        tela.add(info,Integer.valueOf(3)); 
        tela.add(roupas,Integer.valueOf(2));
        tela.add(next,Integer.valueOf(1));
        tela.add(back,Integer.valueOf(1));
        tela.add(armario,Integer.valueOf(0));
        frame.add(tela);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1027,600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource() == back){
         selector(-1);
         if(pt.getEstoque(i) == 1)
               info.setText("Adiquirido");
         else
         info.setText("Preço: " + text[i] +"T"); 
      }
     else if(e.getSource()== next){
          selector(1);
          if(pt.getEstoque(i) == 1)
               info.setText("Adiquirido");
         else
          info.setText("Preço: " + text[i] +"T");
     }

     else if(e.getSource() == comprar){
          if(pt.getEstoque(i) == 1){
               //return 
               pt.setRoupa(i);
               frame.dispose();
          }
         else if(pt.getTamacoin() < (Integer.parseInt(text[i]))){
               JOptionPane.showMessageDialog(null,"Tamacoins insuficientes. Tamacoins: " + pt.getTamacoin());
          }
          else{
               pt.setTamacoin(pt.getTamacoin()-(Integer.parseInt(text[i])));
               System.out.println(pt.getTamacoin());
               pt.setRoupa(i);
               frame.dispose();
          }
          System.out.println(pt.getRoupa());
     }
      roupas.setIcon(vetor[i]);
    }

    private void selector(int a){
          i = i + a;
          if(i>=vetor.length)
               i=0;
          else if(i<0)
               i = 8;
    }

        
     }
     
   
