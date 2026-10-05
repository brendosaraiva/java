//import java.util.ArrayList;
import java.util.Scanner;


public class LoopFor {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // Loop for decrescente de 10 a 1
        for (int i = 10; i >= 1; i--)
            System.out.println(i);

        // Loop for crescente de 1 a 10
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        System.out.print("Digite um número para ver a tabuada: ");
        int valor = leitura.nextInt();

        // Tabuada
        for (int i = 0; i <= 10; i++)
            System.out.println(valor + " x " + i + " = " + (valor * i));       
    }
}


