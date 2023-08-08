
package CorridaJava1;

public class CarroDeCorrida extends Veiculo {
    private int numero;
    private String patrocinador;

    public CarroDeCorrida(String marca, String modelo, int ano, int numero, String patrocinador) {
        super(marca, modelo, ano);
        this.numero = numero;
        this.patrocinador = patrocinador;
    }

    public int getNumero() {
        return numero;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

}
