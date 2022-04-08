package Robo;

public class Robo {
    private char direcao;

    public void setDirecao(char direcao) {
        if(direcao == 'N' || direcao == 'S' || direcao == 'L' || direcao == 'O'){
            this.direcao = direcao;
        }
        else {
            System.out.println("Direcao");
        }
    }

    public char getDirecao() {
        return direcao;
    }
}
