package PrincipalActions;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import pet.Pet;

public class eatAction implements ActionListener{
 //guarda a opção que o usuario escolheu para chamar a função eat certa
    public Pet petPointer;   
    
    //================================
    //          Botões
    //================================
    JButton hotdog = new JButton();
    JButton iceCream = new JButton();
    JButton burguer = new JButton();
    JButton salad = new JButton();
    JButton pizza = new JButton();
    JButton fruit = new JButton();
    JButton milk = new JButton();
    JButton sushi = new JButton();
    JButton taco = new JButton();
    JButton coffe = new JButton();

 public void eatAciton(Pet pet){
    petPointer = pet;

    JFrame cframe = new JFrame();

    ImageIcon feedBackground = new ImageIcon("imgs/comidas/Feed_background.png");
    JLabel feedback = new JLabel(feedBackground,JLabel.CENTER);
    feedback.setBounds(0,0,700,500);
             
    ImageIcon feedT = new ImageIcon("imgs/comidas/feed1.png");
    JLabel feedtitle = new JLabel(feedT);
    feedtitle.setBounds(10,20,300,100);

    //hotdog     
    ImageIcon hotdo = new ImageIcon("imgs/comidas/hotdog.png");
    hotdog.setIcon(hotdo);
    hotdog.addActionListener(this);
    //icecream
    ImageIcon ice = new ImageIcon("imgs/comidas/icecream.png");
    iceCream.setIcon(ice);
    iceCream.addActionListener(this);
    //burguer
    ImageIcon bugue = new ImageIcon("imgs/comidas/burguer.png");
    burguer.setIcon(bugue);
    burguer.addActionListener(this);
    //salad
    ImageIcon salada = new ImageIcon("imgs/comidas/salad.png");
    salad.setIcon(salada);
    salad.addActionListener(this);
    //pizza
    ImageIcon pizz = new ImageIcon("imgs/comidas/pizza.png");
    pizza.setIcon(pizz);
    pizza.addActionListener(this);
    //fruit
    ImageIcon frui = new ImageIcon("imgs/comidas/apple.png");
    fruit.setIcon(frui);
    fruit.addActionListener(this);
    //milk    
    ImageIcon mil = new ImageIcon("imgs/comidas/milk.png");
    milk.setIcon(mil);
    milk.addActionListener(this);
    //sushi
    ImageIcon sush = new ImageIcon("imgs/comidas/sushi.png");
    sushi.setIcon(sush);
    sushi.addActionListener(this);
    //taco
    ImageIcon tac = new ImageIcon("imgs/comidas/taco.png");
    taco.setIcon(tac);
    taco.addActionListener(this);
    //coffe
    ImageIcon coff = new ImageIcon("imgs/comidas/coffe.png");
    coffe.setIcon(coff);
    coffe.addActionListener(this);
            

    JPanel btu = new JPanel();
    btu.setLayout(new GridLayout(2,4,2,2));
    btu.setBackground(Color.black);
    btu.setBounds(40,150,600,260); 
    btu.add(hotdog);
    btu.add(iceCream);
    btu.add(burguer);
    btu.add(salad);
    btu.add(pizza);
    btu.add(fruit);
    btu.add(milk);
    btu.add(sushi);
    btu.add(taco);
    btu.add(coffe);

    //================================
    //          Frame
    //================================

    cframe.setLayout(null);
    cframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    cframe.setSize(700,500);
    cframe.setVisible(true);
    cframe.setResizable(false);
    cframe.add(feedtitle);
    cframe.add(btu);
    cframe.add(feedback);
   

 }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.hotdog){
            if(petPointer.getTamacoin()-10 <= 0 ){
                JOptionPane.showMessageDialog(null,"Tamacoins insuficientes :c");
                return;
            }
            petPointer.setTamacoin(petPointer.getTamacoin() - 10);
            petPointer.eat("hotDog");

        }else if(e.getSource() == this.iceCream){
            if(petPointer.getTamacoin()-3 <= 0 ){
                JOptionPane.showMessageDialog(null,"Tamacoins insuficientes :c");
                return;
            }
            petPointer.setTamacoin(petPointer.getTamacoin() - 3);
            petPointer.eat("iceCream");

        }else if(e.getSource() == this.burguer){
            if(petPointer.getTamacoin()-12 <= 0 ){
                JOptionPane.showMessageDialog(null,"Tamacoins insuficientes :c");
                return;
            }
            petPointer.setTamacoin(petPointer.getTamacoin() - 12);
            petPointer.eat("burguer");

        }else if(e.getSource() == this.salad){
            if(petPointer.getTamacoin()-5 <= 0 ){
                JOptionPane.showMessageDialog(null,"Tamacoins insuficientes :c");
                return;
            }
            petPointer.setTamacoin(petPointer.getTamacoin() - 5);
            petPointer.eat("salad");

        }else if(e.getSource() == this.pizza){
            if(petPointer.getTamacoin()-12 <= 0 ){
                JOptionPane.showMessageDialog(null,"Tamacoins insuficientes :c");
                return;
            }
            petPointer.setTamacoin(petPointer.getTamacoin() - 12);
            petPointer.eat("pizza");

        }else if(e.getSource() == this.fruit){
            if(petPointer.getTamacoin()-5 <= 0 ){
                JOptionPane.showMessageDialog(null,"Tamacoins insuficientes :c");
                return;
            }
            petPointer.setTamacoin(petPointer.getTamacoin() - 5);
            petPointer.eat("fruit");

        }else if(e.getSource() == this.milk){
            if(petPointer.getTamacoin()-3 <= 0 ){
                JOptionPane.showMessageDialog(null,"Tamacoins insuficientes :c");
                return;
            }
            petPointer.setTamacoin(petPointer.getTamacoin() - 3);
            petPointer.eat("milk");

        }else if(e.getSource() == this.sushi){
            if(petPointer.getTamacoin()-10 <= 0 ){
                JOptionPane.showMessageDialog(null,"Tamacoins insuficientes :c");
                return;
            }
            petPointer.setTamacoin(petPointer.getTamacoin() - 10);
            petPointer.eat("sushi");

        }else if(e.getSource() == this.taco){
            if(petPointer.getTamacoin()-10 <= 0 ){
                JOptionPane.showMessageDialog(null,"Tamacoins insuficientes :c");
                return;
            }
            petPointer.setTamacoin(petPointer.getTamacoin() - 10);
            petPointer.eat("taco");

        }else if(e.getSource() == this.coffe){
            if(petPointer.getTamacoin()-3 <= 0 ){
                JOptionPane.showMessageDialog(null,"Tamacoins insuficientes :c");
                return;
            }
            petPointer.setTamacoin(petPointer.getTamacoin() - 3);
            petPointer.eat("coffe");
        }
    } 
}
