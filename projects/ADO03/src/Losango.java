public class Losango extends FormaGeometrica {
    private double diagonalMenor, diagonalMaior;


    public Losango() {
    }

    public Losango(String nome, double diagonalMenor, double diagonalMaior) {
        super(nome);
        this.diagonalMenor = diagonalMenor;
        this.diagonalMaior = diagonalMaior;
    }

    public double getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double calcularArea() {
        return (diagonalMenor * diagonalMaior) / 2;
    }

    public String imprimir() {
        return String.format("%s\nDiagonal menor: %f\nDiagonal maior: %f\nÁrea: %f", super.imprimir(), getDiagonalMenor(), getDiagonalMaior(), calcularArea());
    }
}
