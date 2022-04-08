import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int votosCont[] = {0,0,0,0,0,0};

        for(int i = 0; i < 10;) {
            int voto = entrada.nextInt();
            if(!(voto > votosCont.length)){
                votosCont[voto-1]++;
                i++;
            } else {
                System.out.println("Digite um candidato válido");;
            }
            
        }

        for (int votos : votosCont) {
         System.out.print(votos + " ");   
        }

        entrada.close();
    }
}
