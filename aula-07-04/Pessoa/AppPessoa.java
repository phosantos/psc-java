package Pessoa;

public class AppPessoa {
  public static void main(String[] args) {
      Pessoa p = new Pessoa();
      p.setNome("João");
      p.setIdade(20);
      p.setAltura(1.82);
      System.out.println(p.getNome());
      System.out.println(p.getIdade());
      System.out.println(p.getAltura());
  }  
}
