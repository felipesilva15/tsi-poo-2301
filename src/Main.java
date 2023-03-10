import java.util.Scanner;

class Main {
    public static void main(String[] args) {

    /*
    String nome = "Felipe";
    int idade = 18;
    double peso = 71.85;
    boolean sexo = true;

    System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nSexo: " + sexo + "\n");

    for(int i = 0; i < 10; i++){
      System.out.println(i);
    }

    int numeroValidar = 1;

    if (numeroValidar % 2 == 0){
      System.out.println("\n" + numeroValidar + " É par");
    } else{
      System.out.println("\n" + numeroValidar + " É ímpar");
    }

    */

    /* String nome;
    int idade;
    double peso;
    char sexo;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o seu nome:");
    nome = sc.nextLine();

    System.out.println("Digite a sua idade:");
    idade = sc.nextInt();

    System.out.println("Digite o seu peso:");
    peso = sc.nextDouble();

    System.out.println("Digite o seu sexo:");
    sexo = sc.next().charAt(0);

    System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nSexo: " + sexo + "\n"); */

    /* Scanner sc = new Scanner(System.in);
    System.out.println("Digite a sua idade:");
    int idade = sc.nextInt();

    int validador = 10;

    if(idade > validador){
      System.out.println("Sua idade é maior do que " + validador);
    } else{
      System.out.println("Sua idade menor do que " + validador);
    } */

/* String nome1, nome2;
    int idade1, idade2;

    Scanner scString = new Scanner(System.in);
    Scanner scNumber = new Scanner(System.in);

    System.out.println("Digite o nome da primeira pessoa:");
    nome1 = scString.nextLine();

    System.out.println("Digite a idade da primeira pessoa:");
    idade1 = scNumber.nextInt();

    System.out.println("Digite o nome da segunda pessoa:");
    nome2 = scString.nextLine();

    System.out.println("Digite a idade da segunda pessoa:");
    idade2 = scNumber.nextInt();

    scString.close();
    scNumber.close();

    if(idade1 > idade2){
      System.out.println("O " + nome1 + " é o mais velho.");
    } else{
      System.out.println("O " + nome2 + " é o mais velho.");
    } */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int total = sc.nextInt();

        System.out.println(total);

        while(total <= 100){
            total *= 3;

            System.out.println(total);
        }
    }
}