import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);

        int opcao;
        boolean executarPrograma = true;

        System.out.println("Dica: Os dados são retornados no formato JSON");

        while (executarPrograma) {
            System.out.println("\nQual opção você deseja realizar?");
            System.out.println("0 - Encerar programa.");
            System.out.println("1 - Cadastrar carro.");
            System.out.println("2 - Listar carros.");
            System.out.println("3 - Gerenciar carro.");
            opcao = scInt.nextInt();

            switch (opcao) {
                case 0 -> executarPrograma = false;
                case 1 -> cadastrarCarro();
                case 2 -> listarCarros();
                case 3 -> gerenciarCarro();
                default -> System.out.println("\nOpção inválida!");
            }
        }
    }

    public static void cadastrarCarro() {
        Scanner scInt = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        String marcaRoda, marcaCarro, modeloCarro;
        double torqueMotor, litragemMotor, larguraRoda;
        int cilindrosMotor, aroRoda, qtRodas, indexCarro;
        boolean copiarRoda, rodaCheia;
        Motor motor;
        Roda roda = new Roda(0, "", 0);

        // Criando motor
        System.out.println("\nInforme o torque do motor:");
        torqueMotor = scDouble.nextDouble();

        System.out.println("\nInforme a litragem do motor:");
        litragemMotor = scDouble.nextDouble();

        System.out.println("\nInforme a quantidade de cilindros do motor:");
        cilindrosMotor = scInt.nextInt();

        motor = new Motor(torqueMotor, litragemMotor, cilindrosMotor);

        // Criando rodas
        System.out.println("\nQuantas rodas possuem o carro?");
        qtRodas = scInt.nextInt();
        ArrayList<Roda> listaRodas = new ArrayList<>(qtRodas);

        for (int i = 0; i < qtRodas; i++) {
            if (i > 0) {
                System.out.println("\nDeseja copiar os dados da última roda? (S ou N)");
                copiarRoda = scString.nextLine().toUpperCase().charAt(0) == 'S' ? true : false;

                if (copiarRoda) {
                    listaRodas.add(roda);
                    continue;
                }
            }

            System.out.println("\nInforme o aro da roda:");
            aroRoda = scInt.nextInt();

            System.out.println("\nInforme a largura da roda:");
            larguraRoda = scDouble.nextDouble();

            System.out.println("\nInforme a marca da roda:");
            marcaRoda = scString.nextLine();

            roda = new Roda(aroRoda, marcaRoda, larguraRoda);

            System.out.println("\nA roda está cheia? (S ou N)");
            rodaCheia = scString.nextLine().toUpperCase().charAt(0) == 'S' ? true : false;

            if (rodaCheia) {
                roda.encher();
            }

            listaRodas.add(roda);
        }

        // Criando carro
        System.out.println("\nInforme a marca do carro:");
        marcaCarro = scString.nextLine();

        System.out.println("\nInforme o modelo do carro:");
        modeloCarro = scString.nextLine();

        Carro carro = new Carro(marcaCarro, modeloCarro, motor, listaRodas);

        // Adicionando carro na lista
        System.out.println("\nInforme a posição na lista para cadastrar o carro (Informe \"-1\" caso deseje seguir a sequência).");
        indexCarro = scInt.nextInt();

        if (indexCarro >= 0) {
            GerenciarCarro.adicionar(carro, indexCarro);
        } else {
            GerenciarCarro.adicionar(carro);
        }

        System.out.println("\n=== Carro cadastrado ===");
    }

    public static void listarCarros() {
        if (GerenciarCarro.getListaCarro().isEmpty()) {
            System.out.println("\nNenhum carro cadastrado!");
            return;
        }

        System.out.println("\n=== Lista de carros cadastrados ===\n");

        System.out.println(GerenciarCarro.listar());
    }

    public static void gerenciarCarro() {
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        String marcaCarro;
        int opcao;
        boolean executarGerenciamento = true;
        Carro carro;

        System.out.println("\nQual a marca do carro que você deseja gerenciar?");
        marcaCarro = marcaCarro = scString.nextLine();

        carro = GerenciarCarro.buscarCarro(marcaCarro);

        if (carro == null) {
            System.out.println("\nCarro não encontrado!");
            return;
        }

        while (executarGerenciamento) {
            System.out.println("\nO que você deseja realizar com o carro?");
            System.out.println("0 - Voltar ao menu.");
            System.out.println("1 - Ligar/Desligar motor.");
            System.out.println("2 - Acelerar carro.");
            System.out.println("3 - Frear carro.");
            System.out.println("4 - Exibir dados do carro.");
            opcao = scInt.nextInt();

            switch (opcao) {
                case 0 -> executarGerenciamento = false;
                case 1 -> carro.getMotor().ligarDesligar();
                case 2 -> carro.acelerar();
                case 3 -> carro.frear();
                case 4 -> {
                    System.out.println("\nDados do carro: ");
                    System.out.println(carro.imprimir());
                }
                default -> System.out.println("\nOpção inválida!");
            }
        }
    }
}