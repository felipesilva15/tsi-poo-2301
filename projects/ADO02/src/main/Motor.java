public class Motor {
    private double torque, litragem;
    private int cilindros;
    private boolean ligado;

    public Motor(double torque, double litragem, int cilindros) {
        this.torque = torque;
        this.litragem = litragem;
        this.cilindros = cilindros;
    }

    public double getTorque() {
        return this.torque;
    }

    public double getLitragem() {
        return this.litragem;
    }

    public int getCilindros() {
        return this.cilindros;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void ligarDesligar() {
        this.ligado = !this.getLigado();
    }

    public String imprimir() {
        return "{ " +
                "torque: " + this.getTorque() +
                ", litragem: " + this.getLitragem() +
                ", cilindros: " + this.getCilindros() +
                ", ligado: " + (this.getLigado() ? "Sim" : "Não") +
                " }";
    }
}
