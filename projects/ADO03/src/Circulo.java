public class Circulo extends FormaGeometrica {
    private double raio;
    private final double pi = 3.14159;

    public Circulo() {
        super();
    }

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi * (this.raio * this.raio);
    }

    public String imprimir() {
        return String.format("%s\nRaio: %f\nÁrea: %f", super.imprimir(), getRaio(), calcularArea());
    }
}
