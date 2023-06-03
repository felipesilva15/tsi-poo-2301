import java.util.ArrayList;

public class GerenciarFormaGeometrica {
    public static ArrayList<FormaGeometrica> listaForma = new ArrayList<>();

    public static ArrayList<FormaGeometrica> getListaForma() {
        return listaForma;
    }

    public static void setListaForma(ArrayList<FormaGeometrica> listaForma) {
        GerenciarFormaGeometrica.listaForma = listaForma;
    }

    public static void adicionar(FormaGeometrica formaGeometrica) {
        listaForma.add(formaGeometrica);
    }

    public static double calcularAreaTotal() {
        double areaTotal = 0;

        for (FormaGeometrica forma : getListaForma()) {
            areaTotal += forma.calcularArea();
        }

        return areaTotal;
    }

    public static String listar() {
        String formas = "";

        for (FormaGeometrica forma : getListaForma()) {
            formas += "\n\n" + forma.imprimir();
        }

        return formas.trim();
    }
}
