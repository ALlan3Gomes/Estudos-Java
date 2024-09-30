package teste2;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // ALGORITMO PARA VERIFICAR SE UM NÚMERO ESTÁ NO INTERVALO ENTRE 100 E 200
        System.out.println("Informe um numero: ");
        int n2 = teclado.nextInt();
        
        if (n2 >= 100 && n2 <= 200)
            System.out.println("O número está no intervalo entre 100 e 200.");
        else
            System.out.println("O número NÃO está no intervalo entre 100 e 200.");
    }    
}
