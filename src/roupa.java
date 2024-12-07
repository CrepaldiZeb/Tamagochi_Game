import javax.swing.ImageIcon;

public class roupa {
    ImageIcon img;
    String price;
    Boolean comprado;
    public roupa(String p, String caminho){
        char as = '"';
        this.img = new ImageIcon(as+caminho+as);
        this.price = p;
    }
    public String getPrice() {
        return this.price;
    }
    public Boolean getComprado() {
        return this.comprado;
    }
    public void setComprado(Boolean com) {
        this.comprado = com;
    }
    public ImageIcon getImg() {
        return this.img;
    }
}
