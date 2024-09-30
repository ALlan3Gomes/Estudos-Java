
public class Funcionario {
      String profissao;
      int idade;
      String nome;
      
      void setValores(String n, int i, String p){
      nome = n;
      idade = i;
      profissao = p;        
      this.setIdade(i);
      }
      void verDados(){
          System.out.println("\nNome:" + nome);
          System.out.println("Idade:" + idade);
          System.out.println("Profissao:" + profissao);
      }
      void envelhecer(){
      idade++;
      }
      void setIdade(int i){
      if (idade % 2 == 0 || idade % 2 == 1){
        idade = i;   
          
          }else{
          
          System.out.println("Valor errado");
          
        }      
    }
}
