public class Exercicio19 {
    public static void main(String[] args) {
        int numeros[] = {10,34,21,13,10};
        
        int maior = 0;
        for(int i = 0; i < numeros.length;i++){
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println(maior);
    }
}
