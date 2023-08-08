
package CorridaJava1;

public class Piloto extends Pessoa {
    
private String equipe;

    public Piloto(String nome, int idade, String equipe) {
        super(nome, idade);
        this.equipe = equipe;
    }

    public String getEquipe() {
        return equipe;
    } 
}

