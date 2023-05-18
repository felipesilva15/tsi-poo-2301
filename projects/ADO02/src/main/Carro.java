import java.util.ArrayList;

public class Carro {
    private String marca, modelo;
    private int velocidade;
    private Motor motor;
    private ArrayList<Roda> listaRodas;

    public Carro(String marca, String modelo, Motor motor, ArrayList<Roda> listaRodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.listaRodas = listaRodas;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public ArrayList<Roda> getListaRodas() {
        return this.listaRodas;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void acelerar() {
        if (this.velocidade == 140) {
            return;
        }

        this.velocidade += 10;
    }

    public void frear() {
        if (this.velocidade == 0) {
            return;
        }

        this.velocidade -= 10;
    }

    public String imprimir() {
        String rodas = "";

        for (Roda r : this.getListaRodas()) {
            rodas += ", " + r.imprimir();
        }

        // Retira a virgula inicial caso tenham rodas vinculadas ao carro
        if(rodas.length() > 0){
            rodas = rodas.substring(2);
        }

        return "{ " +
                "marca: " + this.getMarca() +
                ", modelo: " + this.getModelo() +
                ", velocidade: " + this.getVelocidade() +
                ", motor: " + this.getMotor().imprimir() +
                ", rodas: [ " + rodas + " ]" +
                " }";
    }
}
