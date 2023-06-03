public abstract class FormaGeometrica {
    private String nome;

    public FormaGeometrica() {
    }

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    public String imprimir() {
        return String.format("Nome: %s", getNome());
    }
}
