package teste2;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // ALGORITMO PARA ENCONTRAR O MENOR ENTRE TRÊS NÚMEROS
        System.out.println("Informe 3 números: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        
        int menor = num1;
        if (num2 < menor)
            menor = num2;
        if (num3 < menor)
            menor = num3;
        
        System.out.println("O menor número é: " + menor);
    }    
}
