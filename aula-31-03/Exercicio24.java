import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigo;
        double total = 0;

        System.out.println("----FAÇA SEU PEDIDO----");
        System.out.println("100 - Cachorro Quente - R$ 1,20");
        System.out.println("101 - Bauru Simple - R$ 1,30");
        System.out.println("102 - Bauru com ovo - R$ 1,50");
        System.out.println("103 - Hambúrguer - R$ 1,20");
        System.out.println("104 - Cheeseburguer - R$ 1,30");
        System.out.println("105 - Refrigerante - R$ 1,00");
        System.out.println("DIGITE 0 PARA FECHAR O PEDIDO");

        do {
            codigo = entrada.nextInt();

            switch (codigo) {
                case 100:
                System.out.println("Cachorro Quente - R$ 1,20");
                total += 1.20;    
                    break;
                case 101:
                System.out.println("Bauru Simple - R$ 1,30");
                total += 1.30;    
                    break;
                case 102:
                System.out.println("Bauru com ovo - R$ 1,50");
                total += 1.50;    
                    break;
                case 103:
                System.out.println("Hambúrguer - R$ 1,20");
                total += 1.20;   
                    break;
                case 104:
                System.out.println("Cheeseburguer - R$ 1,30");
                total += 1.30;   
                    break;
                case 105:
                System.out.println("Refrigerante - R$ 1,00");
                total += 1.00;     
                    break;
            
            }
        } while(codigo != 0);

        System.out.println("Total: R$" + total);

        entrada.close();
    }
}
