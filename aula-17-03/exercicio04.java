import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1,n2, mediaAluno, accMediaAluno = 0, mediaTotal;
        for(int i = 0;i<5;i++){
            do {
                System.out.println("Digite a n1 do " + (i+1) + "º aluno");
                n1 = entrada.nextDouble();
            }while (n1<0 && n1 >= 10);
    
            do {
                System.out.println("Digite a n2 do " + (i+1) + "º aluno");
                n2 = entrada.nextDouble();
            }while (n2<0 && n2 >= 10);
            mediaAluno = (n1 + n2)/2;
            accMediaAluno += mediaAluno;
            System.out.println("Média aluno " + (i+1) + " = " + mediaAluno);
        }

        mediaTotal = accMediaAluno/5;
        System.out.println("Média total da turma: " + mediaTotal);

        entrada.close();
    }
}
