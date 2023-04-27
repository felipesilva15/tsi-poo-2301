import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        processarMeteoros();
    }

    public static void processarMeteoros(){
        String coordenadas[], coordenadasMeteoros[] = new String[10];
        int x1, y1, x2, y2, qtMeteoros, contador = 0;

        // Instancia os scanners de texto e número separadamente
        Scanner scString = new Scanner(System.in);
        Scanner scInteger = new Scanner(System.in);

        // Coleta e processa as informações
        while(true) {
            contador++;

            // Obtém as coordenadas da propriedade
            coordenadas = scString.nextLine().trim().split(" ", 4);

            x1 = Integer.parseInt(coordenadas[0]);
            y1 = Integer.parseInt(coordenadas[1]);
            x2 = Integer.parseInt(coordenadas[2]);
            y2 = Integer.parseInt(coordenadas[3]);

            // Verifica se deve parar a execução
            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0){
                return;
            }

            // Solicita a quantidade de meteoros
            qtMeteoros = scInteger.nextInt();

            // Armazena as coordenadas dos meteoros
            for(int i = 1; i <= qtMeteoros; i++){
                coordenadasMeteoros[i-1] = scString.nextLine().trim();
            }

            System.out.println("");

            // Realiza os testes
            System.out.println("Teste " + contador);
            System.out.println(calcularQuantidadeQuedas(x1, y1, x2, y2, coordenadasMeteoros));
            System.out.println("");
        }
    }

    public static int calcularQuantidadeQuedas(int x1, int y1, int x2, int y2, String coordenadasMeteoros[]){
        int x, y, quedas = 0;
        String coordenadasProcessadas[];

        // Verifica a quantidade de quedas de acordo com as coordenadas dos meteoros
        for(int i = 0; i < coordenadasMeteoros.length; i++){
            if(coordenadasMeteoros[i] == null){
                continue;
            }

            // Processa as coordenadas do meteoro
            coordenadasProcessadas = coordenadasMeteoros[i].split(" ", 2);

            x = Integer.parseInt(coordenadasProcessadas[0]);
            y = Integer.parseInt(coordenadasProcessadas[1]);

            // Verifica se o meteoro irá cair na propriedade
            if(x >= x1 && x <= x2 && y <= y1 && y >= y2){
                quedas += 1;
            }
        }

        return quedas;
    }
}