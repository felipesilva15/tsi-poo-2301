public class Roda {
    private int aro;
    private String marca;
    private double largura;
    private boolean cheio;

    public Roda(int aro, String marca, double largura) {
        this.aro = aro;
        this.marca = marca;
        this.largura = largura;
    }

    public int getAro() {
        return this.aro;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getLargura() {
        return this.largura;
    }

    public boolean getCheio() {
        return this.cheio;
    }

    public void encher() {
        this.cheio = true;
    }

    public String imprimir() {
        return "{ " +
                "aro: " + this.getAro() +
                ", marca: " + this.getMarca() +
                ", largura: " + this.getLargura() +
                ", cheio: " + (this.getCheio() ? "Sim" : "Não") +
                " }";
    }
}
