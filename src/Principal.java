import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import PrincipalActions.ChatAction;
import PrincipalActions.CityAction;
import PrincipalActions.StatusAction;
import PrincipalActions.eatAction;
import PrincipalActions.educationAction;
import PrincipalActions.playAction;
import PrincipalActions.sleepAction;
import pet.Pet;
import pet.coelho;
import pet.pato;
import pet.rato;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Principal implements ActionListener {

    // botões da tela principal
    JButton jogar = new JButton();
    JButton educar = new JButton();
    JButton dormir = new JButton();
    JButton banheiro = new JButton();
    JButton armario = new JButton();
    JButton cidade = new JButton();
    JButton comida = new JButton();
    JButton status = new JButton();
    JButton sair = new JButton();
    JButton chat = new JButton();
    // cria o objeto do pet escolhido
    public int opp;
    public String name;
    protected Pet pet;
    JLabel p = new JLabel();
    JLabel roupa = new JLabel();
    JLabel coco = new JLabel();
    JLayeredPane tela = new JLayeredPane();
    JFrame frame = new JFrame();
    // Instancia as classes dos botões
    int rps[];
    armario OBa;

    public void Principal() {
        switch (opp) {
            case 1:
                pet = new pato(name);
                System.out.println(name);
                System.out.print("pato");
                break;
            case 2:
                pet = new rato(name);
                System.out.println(name);
                System.out.print("rato");
                break;
            case 3:
                pet = new coelho(name);
                System.out.println(name);
                System.out.print("coelho");
                break;
            default:
                break;
        }

        Timer timer = new Timer();
        JPanel ubt = new JPanel();
        JPanel dbt = new JPanel();

        rps = new int[9];
        rps[0] = 1;
        rps[1] = 0;
        rps[2] = 0;
        rps[3] = 0;
        rps[4] = 0;
        rps[5] = 0;
        rps[6] = 0;
        rps[7] = 0;
        rps[8] = 0;

        // ================================
        // Botões parte de cima
        // ================================

        ubt.setLayout(new GridLayout(1, 5, 3, 0));

        ubt.add(jogar);
        ImageIcon jg = new ImageIcon("imgs/Principal/jogar.png"); // tam > 167 100
        jogar.setIcon(jg);
        jogar.addActionListener(this);
        jogar.setFocusable(false);
        jogar.setBackground(Color.WHITE);

        ubt.add(banheiro);
        ImageIcon bath = new ImageIcon("imgs/Principal/privada.png");
        banheiro.setIcon(bath);
        banheiro.setFocusable(false);
        banheiro.setBackground(Color.WHITE);

        ubt.add(status);
        ImageIcon cruz = new ImageIcon("imgs/Principal/cruz.png");
        status.setIcon(cruz);
        status.setFocusable(false);
        status.setBackground(Color.WHITE);
        status.addActionListener(this);

        ubt.add(comida);
        comida.addActionListener(this);
        ImageIcon chap = new ImageIcon("imgs/Principal/comer.png");
        comida.setIcon(chap);
        comida.setFocusable(false);
        comida.setBackground(Color.WHITE);

        ubt.add(sair);
        ImageIcon exit = new ImageIcon("imgs/Principal/sair.png");
        sair.setFocusable(false);
        sair.setIcon(exit);
        sair.addActionListener(this);
        sair.setBackground(Color.WHITE);

        ubt.setBackground(new Color(228, 242, 237));
        ubt.setBounds(0, 0, 700, 100);

        // ================================
        // Botões da parte de baixo
        // ================================
        dbt.setLayout(new GridLayout(1, 5, 3, 0));

        dbt.add(educar);
        ImageIcon book = new ImageIcon("imgs/Principal/book.png");
        educar.setIcon(book);
        educar.setFocusable(false);
        educar.addActionListener(this);
        educar.setBackground(Color.WHITE);

        dbt.add(dormir);
        ImageIcon cama = new ImageIcon("imgs/Principal/cama.png");
        dormir.setFocusable(false);
        dormir.setIcon(cama);
        dormir.addActionListener(this);
        dormir.setBackground(Color.WHITE);

        dbt.add(armario);
        ImageIcon cl = new ImageIcon("imgs/Principal/cabi.png");
        armario.setIcon(cl);
        armario.setFocusable(false);
        armario.addActionListener(this);
        // armario.setEnabled(false);
        armario.setBackground(Color.WHITE);

        dbt.add(chat);
        ImageIcon cha = new ImageIcon("imgs/Principal/chat.png");
        chat.setFocusable(false);
        chat.setIcon(cha);
        chat.setBackground(Color.WHITE);
        chat.addActionListener(this);

        dbt.add(cidade);
        ImageIcon cida = new ImageIcon("imgs/Principal/door.png");
        cidade.setFocusable(false);
        cidade.setIcon(cida);
        cidade.setBackground(Color.WHITE);
        cidade.addActionListener(this);

        dbt.setBackground(new ColorUIResource(75, 100, 150));
        dbt.setBounds(0, 700, 700, 100);

        // ================================
        // TELA
        // ================================

        // Layered pane > para poder posicionar o fundo da tela e o personagem
        tela.setBounds(0, 100, 700, 600);
        tela.setOpaque(true);
        tela.setLayout(null);

        // setando a imagem de background da tela principal
        JLabel fundo = new JLabel();
        ImageIcon bg = new ImageIcon("imgs/Principal/cenario/fundo.png");
        fundo.setIcon(bg);
        fundo.setBounds(0, -50, 700, 700);

        // setando a imagem do personagem > vai ter que ficar dentro da classe de cada
        // bixinho
        JLabel personagem = new JLabel();
        personagem.setBounds(200, 150, 700, 600);

        // expressões
        ImageIcon eu = new ImageIcon("imgs/Principal/cenario/Expressões/cansado.png");
        p.setIcon(eu);
        p.setBounds(0, 0, 700, 700);

        // cosméticos "imgs/Principal/cenario/Acessórios/vazio.png"
        ImageIcon vz = new ImageIcon("imgs/Principal/cenario/Acessórios/vazio.png");
        roupa.setIcon(vz);
        roupa.setBounds(-4, -100, 700, 700);

        // coco"imgs/Principal/cenario/coco.png"
        coco.setIcon(vz);
        coco.setBounds(550, 500, 100, 100);

        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                personagem.setIcon(pet.sprite());
                timeAction();
                if (pet.getAge() > 120) {
                    personagem.setBounds(0, -100, 700, 700);
                }
                vestir(pet.getRoupa());
                frame.repaint();
            }
        };
        tela.add(fundo, Integer.valueOf(0));
        tela.add(personagem, Integer.valueOf(1));
        tela.add(p, Integer.valueOf(2));
        tela.add(roupa, Integer.valueOf(3));
        tela.add(coco, Integer.valueOf(4));

        timer.scheduleAtFixedRate(tarefa, 0, 1000);
        // ================================
        // Frame
        // ================================

        frame.add(ubt);
        frame.add(dbt);
        frame.add(tela);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 900);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dormir) {
            // chamar o metodo sleep dentro da classe do pet
            sleepAction s = new sleepAction(pet);

        } else if (e.getSource() == comida) {
            eatAction comer = new eatAction();
            comer.eatAciton(pet);
        } else if (e.getSource() == sair) {
            System.exit(0);
        } else if (e.getSource() == educar) {
            educationAction estudar = new educationAction(pet);
            estudar.educationA();
        } else if (e.getSource() == jogar) {
            // logica minima > 50
            if (pet.getLogic() <= 50) {
                ImageIcon prompt = new ImageIcon("imgs/jogar/prompt.png");
                JOptionPane.showMessageDialog(null,
                        pet.getName() + " Precisa aprender mais! \n Vá para as atividades :D", "Aviso",
                        JOptionPane.PLAIN_MESSAGE, prompt);
                return;
            }
            if (pet.getHungry() <= 0) {
                JOptionPane.showMessageDialog(null, pet.getName() + " Está com fome :c");
                return;
            }
            playAction joga = new playAction();
            joga.playAction(pet);
        } else if (e.getSource() == armario) {
            if (pet.getAge() > 1020 && pet.getAge() < 2400) {
                switch (pet.tipo()) {
                    case "rato":
                        ImageIcon rt = new ImageIcon("imgs/city/middlerat.png");
                        JOptionPane.showMessageDialog(null, pet.getName() + " É muito novo ainda!!", "",
                                JOptionPane.PLAIN_MESSAGE, rt);
                        return;
                    case "coelho":
                        ImageIcon bn = new ImageIcon("imgs/city/middlebunny.png");
                        JOptionPane.showMessageDialog(null, pet.getName() + " É muito novo ainda!!", "",
                                JOptionPane.PLAIN_MESSAGE, bn);
                        return;
                    case "pato":
                        ImageIcon pt = new ImageIcon("imgs/city/middleduck.png");
                        JOptionPane.showMessageDialog(null, pet.getName() + " É muito novo ainda!!", "",
                                JOptionPane.PLAIN_MESSAGE, pt);
                        return;
                    default:
                        System.out.println("ERRO");
                        return;
                }
            }
            if (pet.getAge() < 1020) {
                switch (pet.tipo()) {
                    case "rato":
                        ImageIcon rt = new ImageIcon("imgs/city/lilrat.png");
                        JOptionPane.showMessageDialog(null, pet.getName() + " É muito novo ainda!!", "",
                                JOptionPane.PLAIN_MESSAGE, rt);
                        return;
                    case "coelho":
                        ImageIcon bn = new ImageIcon("imgs/city/lilbunny.png");
                        JOptionPane.showMessageDialog(null, pet.getName() + " É muito novo ainda!!", "",
                                JOptionPane.PLAIN_MESSAGE, bn);
                        return;
                    case "pato":
                        ImageIcon pt = new ImageIcon("imgs/city/lilduck.png");
                        JOptionPane.showMessageDialog(null, pet.getName() + " É muito novo ainda!!", "",
                                JOptionPane.PLAIN_MESSAGE, pt);
                        return;
                    default:
                        System.out.println("ERRO");
                        return;
                }
            }
            OBa = new armario(pet);
            frame.repaint();
        } else if (e.getSource() == status) {
            StatusAction a = new StatusAction(pet);
        } else if (e.getSource() == chat) {
            ChatAction ch = new ChatAction(pet);
        } else if (e.getSource() == cidade) {
            if (pet.getAge() < 1020) {
                switch (pet.tipo()) {
                    case "rato":
                        ImageIcon rt = new ImageIcon("imgs/city/lilrat.png");
                        JOptionPane.showMessageDialog(null, pet.getName() + " É muito novo ainda!!", "",
                                JOptionPane.PLAIN_MESSAGE, rt);
                        return;
                    case "coelho":
                        ImageIcon bn = new ImageIcon("imgs/city/lilbunny.png");
                        JOptionPane.showMessageDialog(null, pet.getName() + " É muito novo ainda!!", "",
                                JOptionPane.PLAIN_MESSAGE, bn);
                        return;
                    case "pato":
                        ImageIcon pt = new ImageIcon("imgs/city/lilduck.png");
                        JOptionPane.showMessageDialog(null, pet.getName() + " É muito novo ainda!!", "",
                                JOptionPane.PLAIN_MESSAGE, pt);
                        return;
                    default:
                        System.out.println("ERRO");
                        return;
                }
            }
            CityAction city = new CityAction(pet);

        }

    }

    private void timeAction() {
        if (pet.getState() == "cansado") {
            p.setIcon(pet.emotion("cansado"));

        } else if (pet.getState() == "depressivo") {
            p.setIcon(pet.emotion("depressivo"));
            pet.sumHealth(-3);
        } else if (pet.getState() == "faminto") {
            p.setIcon(pet.emotion("faminto"));
        } else if (pet.getState() == "feliz") {
            p.setIcon(pet.emotion("feliz"));

        } else if (pet.getState() == "triste") {
            p.setIcon(pet.emotion("triste"));

        } else if (pet.getState() == "doente") {
            p.setIcon(pet.emotion("doente"));
        } else {
            p.setIcon(pet.emotion("neutro"));
        }

        if (pet.getAge() < 120)
            p.setBounds(0, -900, 700, 700);

        else if (pet.getAge() >= 120 && pet.getAge() < 1020)
            p.setBounds(0, 16, 700, 700);

        else if (pet.getAge() >= 1020 && pet.getAge() < 2400)
            p.setBounds(0, -46, 700, 700);

        else if (pet.getAge() >= 2400)
            p.setBounds(0, -96, 700, 700);

        if (pet.getAge() >= 2400)
            armario.setEnabled(true);

        if (pet.getHygiene() < 30) {
            ImageIcon cc = new ImageIcon("imgs/Principal/cenario/coco.png");
            coco.setIcon(cc);
        }

        // default time actions
        if (pet.getAge() % 5 == 0) {
            pet.setHygiene(pet.getHygiene() - 5);
            pet.sumHealth(2);
            pet.setEnergy(pet.getEnergy() - 3);
            pet.setHumor(-2);
            pet.setHungry(-5);
        }
    }

    private void vestir(int i) {
        ImageIcon rp;
        switch (i) {
            case 0:
                rp = new ImageIcon("imgs/Principal/cenario/Acessórios/vazio.png");
                break;
            case 1:
                rp = new ImageIcon("imgs/Principal/cenario/Acessórios/chapeu.png");
                break;
            case 2:
                rp = new ImageIcon("imgs/Principal/cenario/Acessórios/fita.png");
                break;
            case 3:
                rp = new ImageIcon("imgs/Principal/cenario/Acessórios/flor.png");
                break;
            case 4:
                rp = new ImageIcon("imgs/Principal/cenario/Acessórios/oculos.png");
                break;
            case 5:
                rp = new ImageIcon("imgs/Principal/cenario/Acessórios/peruca_colorida.png");
                break;
            case 6:
                rp = new ImageIcon("imgs/Principal/cenario/Acessórios/peruca_loira.png");
                break;
            case 7:
                rp = new ImageIcon("imgs/Principal/cenario/Acessórios/peruca_topete.png");
                break;
            case 8:
                rp = new ImageIcon("imgs/Principal/cenario/Acessórios/gravata.png");
                break;
            default:
                rp = new ImageIcon("imgs/Principal/cenario/Acessórios/vazio.png");
        }
        roupa.setIcon(rp);
    }

    // metodo para pegar a opção e o nome do pet
    public void definePet(int _op, String _name) {
        this.opp = _op;
        this.name = _name;
    }

}
