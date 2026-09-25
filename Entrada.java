import java.util.Scanner;


public class Entrada {

    /*  barra asterisco é usado para fazer comentários longos */

    // para comentários curtos, usamos duas barras

    final static double PI = 3.14159;

    public static void main(String[] args) {
        
        // Instanciando a classe Scanner, sendo a instancia o objeto leitura,
        // que receberá dados de entrada do usuário através do teclado.
        Scanner leitura = new Scanner(System.in);

        //println é usado para exibir mensagens na tela, e o cursor vai para a próxima linha
        //print é usado para exibir mensagens na tela, e o cursor permanece na mesma linha
        System.out.print("Digite um valor: ");

        // O método nextInt() da classe Scanner é usado para ler um valor inteiro digitado pelo usuário.
        int valor = leitura.nextInt();

        System.out.println("O valor digitado foi: " + valor);


        double area = PI * (valor * valor);

        System.out.println("A área do círculo é: " + area);
    }
}
