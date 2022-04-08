import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[5];
        int numerosB[] = new int[5];

        for(int i = 0; i < numeros.length; i++){
            
            System.out.println("Digite o " + (i+1) + "º número:");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < numerosB.length; i++) {
            numerosB[i] = numeros[i] * 3;
        }

        System.out.print("[ ");
        for (int numero : numerosB) {
            System.out.print(numero + " ");
        }
        System.out.print("]");


        entrada.close();
    }
}
