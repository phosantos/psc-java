import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int vetorC[] = new int[5];

        for(int i = 0; i < vetorA.length; i++){
            
            System.out.println("Digite o " + (i+1) + "º número:");
            vetorA[i] = entrada.nextInt();
        }

        for(int i = 0; i < vetorB.length; i++){
            
            System.out.println("Digite o " + (i+1) + "º número:");
            vetorB[i] = entrada.nextInt();
        }
        for(int i = 0; i < vetorC.length; i++){
            
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.print("[ ");
        for (int numero : vetorC) {
            System.out.print(numero + " ");
        }
        System.out.print("]");

        entrada.close();
    }
}
