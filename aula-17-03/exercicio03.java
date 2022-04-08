import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int userValor = 1;

        while(userValor > 0){
            userValor = entrada.nextInt();
            if(userValor>0){
                System.out.println("Valor lido: " + userValor);
                System.out.println(userValor + "^2 = " + Math.pow(userValor,2));
                System.out.println(userValor + "^3 = " + Math.pow(userValor,3));
                System.out.println("Raiz quadrada: " + Math.sqrt(userValor) );
            }
            
        }


        entrada.close();
    }
}
