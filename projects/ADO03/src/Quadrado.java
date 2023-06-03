public class Quadrado extends FormaGeometrica {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {
        super();
    }

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public String imprimir() {
        return String.format("%s\nLado: %f\nÁrea: %f", super.imprimir(), getLado(), calcularArea());
    }
}
