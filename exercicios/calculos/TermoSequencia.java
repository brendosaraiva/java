package exercicios.calculos;
import java.util.Scanner;
import java.lang.Math;


public class TermoSequencia {
    public static void main(String[] args) {
        // Código para calcular o termo da sequência
    
        int a;
        int x;
        int n;
        int p = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência: ");
        n = leitura.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print("Digite o valor de a: ");
            a = leitura.nextInt();

            System.out.print("Digite o valor de x: ");
            x = leitura.nextInt();

            System.out.println();
    
            p += a * Math.pow(x, i);
        }

        System.out.print("O valor de p é: " + p);

        leitura.close();

    }
}
