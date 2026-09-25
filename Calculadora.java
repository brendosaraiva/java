import java.util.Scanner;
import java.text.DecimalFormat;


public class Calculadora {
    public static void main(String[] args) {
        int a;
        int b;
        float resultado;

        Scanner leitura = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Calculadora Básica");
        System.out.println("(+, -, x, /)");
        System.out.print("Digite a operação aritmética: ");

        String operacao = leitura.next();

        System.out.print("Digite o primeiro número: ");
        a = leitura.nextInt();
        System.out.print("Digite o segundo número: ");
        b = leitura.nextInt();

        switch (operacao) {
            case "+":
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case "x":
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                resultado = a / b;
                System.out.println("Resultado: " + df.format(resultado));
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        leitura.close();
    }
}
