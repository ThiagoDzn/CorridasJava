
package CorridaJava1;

public class App {
    public static void main(String[] args) {
        
        Piloto piloto = new Piloto("João", 30, "Equipe A");

      
        CarroDeCorrida carro = new CarroDeCorrida("Ferrari", "F1", 2023, 7, "Patrocinador X");

        System.out.println("Piloto: " + piloto.getNome() + ", Idade: " + piloto.getIdade() + ", Equipe: " + piloto.getEquipe());
        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno() + ", Número: " + carro.getNumero() + ", Patrocinador: " + carro.getPatrocinador());
        
    }
}
