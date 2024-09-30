package teste2;
import java.util.Scanner; 

public class questao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                  
        System.out.println("Informe um numero:");
        int numero = teclado.nextInt();
          
        if(numero % 100 == 0)
            System.out.println("Esse numero e par.");
        else 
            System.out.println("Esse numero e inpar");
         
    }
}
