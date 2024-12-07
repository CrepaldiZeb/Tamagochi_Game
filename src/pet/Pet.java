package pet;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

public abstract class Pet {
    // ================================
    // variaveis de status
    // ================================
    protected String name;
    protected String tipo;
    protected int est[];
    protected int roupa;
    protected boolean already;
    protected int TAge;
    protected String state;
    protected int age;
    protected int health;
    protected int energy;
    protected int love;
    protected int hungry;
    protected int humor;
    protected int logic;
    protected int hygiene;
    protected boolean Islove;
    protected int tamacoin;

    protected int LoveNpc1;
    protected int LoveNpc2;
    protected int LoveNpc3;
    protected boolean edhappen;

    // ================================
    // GET E SET
    // ================================
    public void setEdhappen(boolean v){
        this.edhappen = v;
    }
    public boolean getEdhappen(){
        return this.edhappen;
    }
    public String getType() {
        return this.tipo;
    }

    public int getLoveNpc1() {
        return this.LoveNpc1;
    }

    public int getLoveNpc2() {
        return this.LoveNpc2;
    }

    public int getLoveNpc3() {
        return this.LoveNpc3;
    }

    public void setLoveNpc1(int i) {
        if (i > 0) {
            this.LoveNpc1 += i;
        } else if (i < 0 && LoveNpc1 + i >= 0) {
            this.LoveNpc1 += i;
        }

    }

    public void setLoveNpc2(int i) {
        if (i > 0) {
            this.LoveNpc2 += i;
        } else if (i < 0 && LoveNpc2 + i >= 0) {
            this.LoveNpc2 -= i;
        }
    }

    public void setLoveNpc3(int i) {
        if (i > 0) {
            this.LoveNpc3 += i;
        } else if (i < 0 && LoveNpc3 + i >= 0) {
            this.LoveNpc3 -= i;
        }
    }

    public int getHygiene() {
        return this.hygiene;
    }

    public void setHygiene(int i) {
        if (hygiene > 100)
            this.hygiene = 100;

        else if (hygiene < 0)
            this.hygiene = 0;

        else
            this.hygiene = i;
    }

    public int getRoupa() {
        return roupa;
    }

    public void setRoupa(int roupa) {
        this.roupa = roupa;
        this.est[roupa] = 1;
    }

    public int getEstoque(int i) {
        return this.est[i];
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int _age) {
        this.age = _age;
    }

    public int getHealth() {
        return health;
    }

    public void sumHealth(int _health) {
        this.health += _health;
        if (health > 100) {
            health = 100;
        }
    }

    public int getEnergy() {
        return energy;
    }

    public String tipo() {
        return tipo;
    }

    public void setEnergy(int _energy) {
        if (energy > 100)
            energy = 100;

        else if (energy < 0)
            energy = 0;

        else
            this.energy = _energy;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int _love) {
        if(_love > 0){
            this.love += _love;

        }else if(_love + this.love >= 0){
            this.love += _love;
        }
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int _hungry) {
        if (hungry > 100)
            hungry = 100;

        else if (hungry < 0)
            hungry = 0;

        else
            this.hungry += _hungry;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int _humor) {
        this.humor += _humor;
        if (humor > 100) {
            humor = 100;
        } else if (humor < 0) {
            humor = 0;
        } else
            this.humor += _humor;
    }

    public int getLogic() {
        return logic;
    }

    public void setLogic(int _logic) {
        this.logic = _logic;
    }

    public boolean getIslove() {
        return Islove;
    }

    public String getState() {
        return state;
    }

    public void setIslove() {
        if (age >=1020) {
            Islove = true;
        }
    }

    public int getTamacoin() {
        return tamacoin;
    }

    public void setTamacoin(int _money) {
        this.tamacoin = _money;
    }

    // ================================
    // Metodos
    // ================================

    public void eat(String food) {
    }

    public void study(String _study) {
    }

    public void sleep(int i) {
        /*
         * aparece uma tela pedindo o tempo de sono do pet, caso seja um tempo menor que
         * 8, o pet não vai recuperar a barra de energia cheia
         * caso o tanto de hora seja compativel com um tempo bom de sono, a barra de
         * energia enche
         */
        // float sleepTime = Float.parseFloat(JOptionPane.showInputDialog("Quanto tempo
        // você vai dormir ?"));

        /*
         * if(sleepTime > 0){
         * //caso menor que 8
         * if(sleepTime <= 7 ){
         * age += sleepTime;
         * energy = (int)(sleepTime*13);
         * //tratando caso o valor utrapasse o valor maximo do status energia
         * if(energy > 100){
         * energy = 100;
         * }
         * }
         * //caso de um sono bom
         * else{
         * age+= sleepTime;
         * energy = 100;
         * }
         * }
         */
        if (i == 8) {
            this.energy = 100;
        } else
            this.energy = i * 12;

        this.age += i * 10;
        this.humor -= 3 * i;
    }

    public ImageIcon emotion(String text) {
        ImageIcon ic;
        if (text == "feliz") {
            ic = new ImageIcon("imgs/Principal/cenario/Expressões/feliz.png");
        } else if (text == "cansado") {
            ic = new ImageIcon("imgs/Principal/cenario/Expressões/cansado.png");
        } else if (text == "depressivo") {
            ic = new ImageIcon("imgs/Principal/cenario/Expressões/depressivo.png");
        } else if (text == "doente") {
            ic = new ImageIcon("imgs/Principal/cenario/Expressões/doente.png");
        } else if (text == "faminto") {
            ic = new ImageIcon("imgs/Principal/cenario/Expressões/faminto.png");
        } else if (text == "triste") {
            ic = new ImageIcon("imgs/Principal/cenario/Expressões/triste.png");
        } else {
            ic = new ImageIcon("imgs/Principal/cenario/Expressões/neutro.png");
        }

        return ic;
    }

    public void estado() {
        already = true;
        if (this.energy <= 30) {
            TAge = age;
            state = "cansado";
        } else if (this.energy <= 30 && this.humor <= 15 && this.health <= 30) {
            TAge = age;
            state = "depressivo";
        } else if (this.hungry <= 30) {
            TAge = age;
            state = "faminto";
        } else if (this.humor >= 70 && this.health >= 60) {
            TAge = age;
            state = "feliz";
        } else if (this.humor <= 35) {
            TAge = age;
            state = "triste";
        } else if (this.health <= 40) {
            TAge = age;
            state = "doente";
        } else {
            TAge = age;
            state = "neutro";
        }
    }

    public ImageIcon roupa(String text) {
        ImageIcon ico;
        if (text == "chapeu") {
            ico = new ImageIcon("imgs/Principal/cenario/Acessórios/chapeu.png");
        } else if (text == "fita") {
            ico = new ImageIcon("imgs/Principal/cenario/Acessórios/fita.png");
        } else if (text == "flor") {
            ico = new ImageIcon("imgs/Principal/cenario/Acessórios/flor.png");
        } else if (text == "gravata") {
            ico = new ImageIcon("imgs/Principal/cenario/Acessórios/gravata.png");
        } else if (text == "peruca_colorida") {
            ico = new ImageIcon("imgs/Principal/cenario/Acessórios/peruca_colorida.png");
        } else if (text == "peruca_loira") {
            ico = new ImageIcon("imgs/Principal/cenario/Acessórios/peruca_loira.png");
        } else if (text == "peruca_topete") {
            ico = new ImageIcon("imgs/Principal/cenario/Acessórios/peruca_topete.png");
        } else {
            ico = new ImageIcon("imgs/Principal/cenario/Acessórios/vazio.png");
        }

        return ico;
    }

    protected void timer() {
        Timer timer = new Timer();
        TimerTask tarefa = new TimerTask()  {
            @Override
            public void run() {
                age++;
                estado();
                setIslove();
              //  System.out.println("age: " + age);
              //  System.out.println("estado: " + state);
            }
        };
        timer.scheduleAtFixedRate(tarefa, 0, 1000);
    }

    public void play(String game) {
    }

    public void socialize(int v, String npc) {
    }

    public void vestir(String accessory) {
    }

    public ImageIcon sprite() {
        return null;
    }

    public void banho() {
        this.hygiene = 100;
    }

}
