import java.util.ArrayList;

public class GerenciarCarro {
    private static ArrayList<Carro> listaCarro = new ArrayList<>();

    public static ArrayList<Carro> getListaCarro() {
        return listaCarro;
    }

    public static void adicionar(Carro carro) {
        getListaCarro().add(carro);
    }

    public static void adicionar(Carro carro, int index) {
        getListaCarro().add(index, carro);
    }

    public static String listar() {
        String carros = "";

        for (Carro c : getListaCarro()) {
            carros += ", " + c.imprimir();
        }

        if (carros.length() > 0) {
            carros = carros.substring(2);
        }

        return "[ " + carros + " ]";
    }

    public static Carro buscarCarro(String marca) {
        for (Carro c : getListaCarro()) {
            if (c.getMarca().equalsIgnoreCase(marca)) {
                return c;
            }
        }

        return null;
    }
}
