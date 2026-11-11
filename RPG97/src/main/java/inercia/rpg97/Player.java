package inercia.rpg97;

public class Player {
    private String nome;
    private  int idade;
    private String classe;

    public Player(String nome, int idade, String classe){
        this.nome = nome;
        this.idade = idade;
        this.classe = classe;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

}
