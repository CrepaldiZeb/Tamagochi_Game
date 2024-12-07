package pet;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//atletico 
public class pato extends Pet {
    // ================================
    // Construtor
    // ================================
    public pato(String _name) {
        this.name = _name;
        this.state = "neutro";
        this.tipo = "pato";
        this.roupa = 0;
        this.est = new int[9];
        already = false;
        this.age = 0;
        this.health = 100;
        this.energy = 100;
        this.Islove = false;
        this.hungry = 100;
        this.humor = 100;
        this.hygiene = 100;
        this.logic = 0;
        this.tamacoin = 300;
        this.LoveNpc1 = 0;
        this.LoveNpc2 = 0;
        this.LoveNpc3 = 0;
        this.timer();
    }
        
    @Override
    public void eat(String food) {
        switch (food) {
            case "hotDog":
                if (health - 10 <= 0) {
                    JOptionPane.showInputDialog(null, "Saude muito baixa :C");
                    break;
                } else if (humor - 30 < 0) {
                    JOptionPane.showInputDialog(null, name + " Está triste :C");
                    break;
                } else if (hungry + 10 > 100) {
                    JOptionPane.showInputDialog(null, name + " Está cheio :D");
                    break;
                }
                this.humor -= 30;
                this.health -= 10;
                this.hungry += 20;
                break;

            case "iceCream":
                if (health - 5 <= 0) {
                    JOptionPane.showInputDialog(null, "Saude muito baixa :C");
                    break;
                }
                this.health -= 5;
                this.hungry += 10;
                break;
            case "burguer":
                if (health - 20 <= 0) {
                    JOptionPane.showInputDialog(null, "Saude muito baixa :C");
                    break;
                } else if (humor - 10 <= 0) {
                    JOptionPane.showInputDialog(null, name + " Está triste :C");
                    break;
                } else if (hungry + 25 > 100) {
                    JOptionPane.showInputDialog(null, name + " Está cheio :D");
                    break;
                }
                this.health -= 20;
                this.hungry += 25;
                this.humor -= 10;
                break;

            case "pizza":
                if (health - 20 <= 0) {
                    JOptionPane.showInputDialog(null, "Saude muito baixa :C");
                    break;
                } else if (humor - 10 <= 0) {
                    JOptionPane.showInputDialog(null, name + " Está triste :C");
                    break;
                } else if (hungry + 25 > 100) {
                    JOptionPane.showInputDialog(null, name + " Está cheio :D");
                    break;
                }
                this.health -= 20;
                this.hungry += 25;
                this.humor -= 10;
                break;

            case "coffe":
                if (health - 10 <= 0) {
                    JOptionPane.showInputDialog(null, "Saude muito baixa :C");
                    break;
                } else if (hungry - 10 <= 0) {
                    JOptionPane.showMessageDialog(null, name + " Está com fome :C");
                    break;
                } else if (energy + 30 > 100) {
                    JOptionPane.showMessageDialog(null, name + " Já está cheio de energia ;D");
                    break;
                }
                this.health -= 10;
                this.hungry -= 10;
                this.energy += 30;
                break;

            case "taco":
                if (health - 5 <= 0) {
                    JOptionPane.showInputDialog(null, "Saude muito baixa :C");
                    break;
                } else if (hungry + 15 > 100) {
                    JOptionPane.showInputDialog(null, name + " Está cheio :D");
                    break;
                }
                this.health -= 5;
                this.hungry += 15;
                break;

            case "salad":
                if (hungry + 20 > 100) {
                    JOptionPane.showInputDialog(null, name + " Está cheio :D");
                    break;
                }
                this.hungry += 20;
                setHumor(15);
                sumHealth(5);
                break;

            case "sushi":
                if (hungry + 5 > 100) {
                    JOptionPane.showInputDialog(null, name + " Está cheio :D");
                    break;
                }
                sumHealth(1);
                this.hungry += 5;
                this.logic += 1;
                break;

            case "fruit":
                if (hungry + 5 > 100) {
                    JOptionPane.showInputDialog(null, name + " Está cheio :D");
                    break;
                }
                this.hungry += 5;
                setHumor(10);
                break;

            case "milk":
                if (hungry + 5 > 100) {
                    JOptionPane.showInputDialog(null, name + " Está cheio :D");
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
            ImageIcon img1 = new ImageIcon("imgs/Principal/cenario/pato/filhote.png");
            return img1;
        } else if (age <= 2400) {
            ImageIcon img1 = new ImageIcon("imgs/Principal/cenario/pato/adolescente.png");
            return img1;
        } else {
            ImageIcon img1 = new ImageIcon("imgs/Principal/cenario/pato/adulto.png");
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
                    break;
                }
                this.energy -= 5;
                this.logic += 5;
                this.tamacoin += 5;
                setHumor(10);
                break;
            case "pc":
                // não gosta
                if (energy - 10 <= 10) {
                    JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                    break;
                } else if (humor - 20 <= 0) {
                    JOptionPane.showMessageDialog(null, name + " Está triste :/");
                    break;
                }
                this.humor -= 20;
                this.energy -= 10;
                this.logic += 10;
                this.tamacoin += 1;
                break;
            case "read":
                // não gosta
                if (energy - 10 <= 10) {
                    JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                    break;
                } else if (humor - 20 <= 0) {
                    JOptionPane.showMessageDialog(null, name + " Está triste :/");
                    break;
                }
                this.humor -= 20;
                this.energy -= 10;
                this.logic += 10;
                this.tamacoin += 5;
                break;
            case "paint":
                // não gosta
                if (energy - 10 <= 10) {
                    JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                    break;
                } else if (humor - 20 <= 0) {
                    JOptionPane.showMessageDialog(null, name + " Está triste :/");
                    break;
                }
                this.energy -= 10;
                this.logic += 10;
                this.humor -= 20;
                this.tamacoin += 5;
                break;
            case "meditate":
                // gosta
                if (energy - 5 <= 10) {
                    JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                    break;
                }
                this.energy -= 5;
                this.logic += 5;
                setHumor(10);
                this.tamacoin += 1;
                break;
            case "sport":
                // gosta fav
                if (energy - 15 <= 10) {
                    JOptionPane.showMessageDialog(null, name + " Está muito cansado :(");
                    break;
                }
                this.logic += 10;
                this.energy -= 15;
                this.humor = 100;
                this.tamacoin += 15;
                break;
            default:
                break;
        }
    }

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
                this.tamacoin += 15;
                setHumor(5);
                break;
            case "pingPong":
                // game fav
                this.tamacoin += 20;
                setHumor(10);
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
                // bunny
                setLove(value);
                setLoveNpc2(value);
                break;
            case "npc3":
                // rat
                setLoveNpc3(value);
                break;
            default:
                System.exit(1);
                break;
        }
    }

}