import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String opcao, mensagem;

        while (true) {
            mensagem = "===== Menu - Formas geométricas =====";
            mensagem += "\n\n1 - Cadastrar";
            mensagem += "\n2 - Calcular área total";
            mensagem += "\n3 - Listar";
            mensagem += "\n4 - Sair";

            opcao = JOptionPane.showInputDialog(null, mensagem);

            if(opcao == null || opcao.equals("4")) {
                break;
            }

            switch (opcao.trim()) {
                case "1" -> cadastrarForma();
                case "2" -> calcularAreaTotal();
                case "3" -> listarFormas();
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    public static void cadastrarForma() {
        String opcao, mensagem;

        mensagem = "===== Formas =====";
        mensagem += "\n\n1 - Quadrado";
        mensagem += "\n2 - Circulo";
        mensagem += "\n3 - Losando";
        mensagem += "\n4 - Voltar";

        opcao = JOptionPane.showInputDialog(null, mensagem);

        if(opcao == null || opcao.equals("4")) {
            return;
        }

        switch (opcao.trim()) {
            case "1":
                double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do lado do quadrado."));
                Quadrado quadrado = new Quadrado("Quadrado", lado);

                GerenciarFormaGeometrica.adicionar(quadrado);

                break;

            case "2":
                double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o raio do circulo."));
                Circulo circulo = new Circulo("Circulo", raio);

                GerenciarFormaGeometrica.adicionar(circulo);
                break;

            case "3":
                double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da diagonal menor do losango."));
                double diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da diagonal maior do losango."));
                Losango losango = new Losango("Losango", diagonalMenor, diagonalMaior);

                GerenciarFormaGeometrica.adicionar(losango);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }
    }

    public static void calcularAreaTotal() {
        String mensagem;

        mensagem = "===== Área total =====";
        mensagem += "\n\n" + GerenciarFormaGeometrica.calcularAreaTotal();

        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static void listarFormas() {
        String mensagem;

        mensagem = "===== Lista de formas =====";
        mensagem += "\n\n" + GerenciarFormaGeometrica.listar();

        JOptionPane.showMessageDialog(null, mensagem);
    }
}