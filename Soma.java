import java.util.Scanner;


public class Soma {
    public static void main(String[] args) {
        int soma = 0;
        Scanner leitura = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite o " + i + "º valor: ");

            int valor = leitura.nextInt();
             soma += valor;
        }

        System.out.println("A soma dos valores é: " + soma);
        leitura.close();
    }
}
