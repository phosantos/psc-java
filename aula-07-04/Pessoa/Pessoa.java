package Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public void setNome(String nome) {
        if(!nome.contains("#")){
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    
}
