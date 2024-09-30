package teste2;
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // ALGORITMO PARA IMPRIMIR UMA CONDIÇÃO CONFORME O NÚMERO INFORMADO
        System.out.println("Informe um número: ");
        int num = teclado.nextInt();
        
        if (num <= 10)
            System.out.println("F1");
        else if (num <= 100)
            System.out.println("F2");
        else
            System.out.println("F3");
    }    
}
