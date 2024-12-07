package pet;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class coelho extends Pet {
      // ================================
      // Construtor
      // ================================
      public coelho(String _name) {
            this.name = _name;
            this.state = "neutro";
            this.tipo = "coelho";
            this.roupa = 0;
            this.est = new int[9];
            already = false;
            this.age = 0;
            this.health = 100;
            this.energy = 100;
            this.Islove = true;
            this.hungry = 100;
            this.humor = 100;
            this.hygiene = 100;
            this.logic = 0;
            this.tamacoin = 0;
            this.LoveNpc1 = 0;
            this.LoveNpc2 = 0;
            this.LoveNpc3 = 0;
            this.edhappen = false;
            this.timer();
      }

      @Override
      public void eat(String food) {
            switch (food) {
                  case "hotDog":
                        if (health - 10 <= 0) {
                              JOptionPane.showMessageDialog(null, " Saude muito biaxa :C");
                              break;
                        } else if (hungry + 20 > 100) {
                              JOptionPane.showMessageDialog(null, name + " Está cheio :D");
                              break;
                        }
                        this.health -= 10;
                        this.hungry += 20;
                        setHumor(10);
                        break;

                  case "iceCream":
                        if (health - 5 <= 0) {
                              JOptionPane.showMessageDialog(null, " Saude muito baixa :C");
                              break;
                        } else if (hungry + 10 > 100) {
                              JOptionPane.showMessageDialog(null, name + " Está cheio :D");
                              break;
                        }
                        this.health -= 5;
                        this.hungry += 10;
                        break;

                  case "burguer":
                        if (health - 20 <= 0) {
                              JOptionPane.showMessageDialog(null, " Saude muito baixa :C");
                              break;
                        } else if (hungry + 25 > 100) {
                              JOptionPane.showMessageDialog(null, name + " Está cheio :D");
                              break;
                        }
                        this.health -= 20;
                        this.hungry += 25;
                        setHumor(10);
                        break;

                  case "pizza":
                        if (health - 20 <= 0) {
                              JOptionPane.showMessageDialog(null, "Saude muito baixa :C");
                              break;
                        } else if (hungry + 25 > 100) {
                              JOptionPane.showMessageDialog(null, name + " Está cheio :D");
                              break;
                        }
                        this.health -= 20;
                        this.hungry += 25;
                        setHumor(10);
                        break;

                  case "coffe":
                        // comida favorita do coelho :D
                        if (hungry - 10 <= 0) {
                              JOptionPane.showMessageDialog(null, name + " Está com fome :C");
                              break;
                        } else if (health - 10 <= 0) {
                              JOptionPane.showInputDialog(null, "Saude muito baixa :C");
                              break;
                        } else if (energy + 30 > 100) {
                              JOptionPane.showMessageDialog(null, name + " Já está cheio de energia ;D");
                              break;
                        }
                        setHumor(30);
                        this.health -= 10;
                        this.hungry -= 10;
                        this.energy += 30;
                        break;

                  case "taco":
                        if (health - 5 <= 0) {
                              JOptionPane.showInputDialog(null, "Saude muito baixa :C");
                              break;
                        } else if (hungry + 15 > 100) {
                              JOptionPane.showMessageDialog(null, name + " Já está cheio :D");
                              break;
                        }
                        setHumor(20);
                        this.health -= 5;
                        this.hungry += 15;
                        break;

                  case "salad":
                        if (hungry + 20 > 100) {
                              JOptionPane.showMessageDialog(null, name + " Já está cheio :D");
                              break;
                        }
                        this.hungry += 20;
                        sumHealth(5);
                        setHumor(5);
                        break;

                  case "sushi":
                        if (hungry + 10 > 100) {
                              JOptionPane.showMessageDialog(null, name + " Já está cheio :D");
                              break;
                        }
                        this.hungry += 10;
                        this.logic += 1;
                        sumHealth(1);
                        break;
                  case "fruit":
                        if (hungry + 5 > 100) {
                              JOptionPane.showMessageDialog(null, name + " Já está cheio :D");
                              break;
                        }
                        this.hungry += 5;
                        setHumor(10);
                        break;
                  case "milk":
                        if (hungry + 5 > 100) {
                              JOptionPane.showMessageDialog(null, name + " Já está cheio :D");
                              break;
                        }
                        this.hungry += 5;
                        setHumor(5);
                        break;
                  default:
                        break;
            }
      }

      public ImageIcon sprite() {
            if (age <= 100) {
                  ImageIcon img = new ImageIcon("imgs/ovo.png");
                  return img;
            } else if (age <= 120) {
                  ImageIcon img1 = new ImageIcon("imgs/ovoq.png");
                  return img1;
            } else if (age <= 1020) {
                  ImageIcon img1 = new ImageIcon("imgs/Principal/cenario/coelho/filhote.png");
                  return img1;
            } else if (age <= 2400) {
                  ImageIcon img1 = new ImageIcon("imgs/Principal/cenario/coelho/adolescente.png");
                  return img1;
            } else {
                  ImageIcon img1 = new ImageIcon("imgs/Principal/cenario/coelho/adulto.png");
                  return img1;
            }
      }

      public void study(String _study) {
            if (this.hungry - 5 <= 0) {
                  JOptionPane.showMessageDialog(null, name + " Está fome :(");
                  return;
            }
            this.hungry -= 5;
            switch (_study) {
                  case "play":
                        // gosta
                        if (energy - 5 <= 10) {
                              JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                              setEdhappen(false);
                              break;
                        }
                        this.energy -= 5;
                        this.logic += 5;
                        setHumor(10);
                        this.tamacoin += 5;
                        setEdhappen(true);
                        break;
                  case "pc":
                        // não gosta
                        if (energy - 10 <= 10) {
                              JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                              setEdhappen(false);
                              break;
                        } else if (humor - 20 <= 0) {
                              JOptionPane.showMessageDialog(null, name + " Está triste :/");
                              setEdhappen(false);
                              break;
                        }
                        this.humor -= 20;
                        this.energy -= 10;
                        this.logic += 10;
                        this.tamacoin += 1;
                        setEdhappen(true);
                        break;
                  case "read":
                        // gosta
                        if (energy - 5 <= 10) {
                              JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                              setEdhappen(false);
                              break;
                        }
                        this.logic += 10;
                        this.energy -= 5;
                        setHumor(10);
                        this.tamacoin += 5;
                        setEdhappen(true);
                        break;
                  case "paint":
                        // gosta fav > regenera todo o humor do pet
                        if (energy - 5 <= 10) {
                              JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                              setEdhappen(false);
                              break;
                        }
                        this.logic += 10;
                        this.energy -= 5;
                        this.humor = 100;
                        this.tamacoin += 15;
                        setEdhappen(true);
                        break;
                  case "meditate":
                        // gosta
                        if (energy - 5 <= 10) {
                              JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                              setEdhappen(false);
                              break;
                        }
                        this.energy -= 5;
                        this.logic += 5;
                        setHumor(10);
                        this.tamacoin += 1;
                        setEdhappen(true);
                        break;
                  case "sport":
                        // não gosta
                        if (energy - 12 <= 10) {
                              JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                              setEdhappen(false);
                              break;
                        } else if (humor - 20 <= 0) {
                              JOptionPane.showMessageDialog(null, name + " Está triste :/");
                              setEdhappen(false);
                              break;
                        }
                        this.energy -= 15;
                        this.logic += 10;
                        this.humor -= 20;
                        this.tamacoin += 1;
                        setEdhappen(true);
                        break;
                  default:
                        break;
            }
      }

      // principal objetivo > ganhar tamacoins
      // vai perder --- energia e fome

      public void play(String game) {
            this.hungry -= 10;
            this.energy -= 5;
            switch (game) {
                  case "tictactoe":
                        this.tamacoin += 10;
                        setHumor(5);
                        break;
                  case "rockPaperScissors":
                        this.tamacoin += 10;
                        setHumor(5);
                        break;
                  case "memoryGame":
                        // game fav
                        this.tamacoin += 15;
                        setHumor(10);
                        break;
                  case "pingPong":
                        this.tamacoin += 20;
                        setHumor(5);
                        break;

            }
      }

      // city part
      public void socialize(int value, String npc) {
            switch (npc) {
                  case "npc1":
                        setLoveNpc1(value);
                        break;
                  case "npc2":
                        setLoveNpc2(value);
                        break;
                  case "npc3":
                        // best friend
                        setLove(value);
                        setLoveNpc3(value);
                        break;
                  default:
                        System.exit(1);
                        break;
            }
      }

}