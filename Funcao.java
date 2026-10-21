import java.util.Scanner;


public class Funcao {
    // As funções são blocos de código que realizam tarefas específicas e podem ser reutilizadas em diferentes partes do programa. Elas ajudam a organizar o código, tornando-o mais legível e modular.
    // Os procedimentos são funções que não retornam um valor, enquanto as funções podem retornar valores. No caso da calculadora, a função "calculadora" retorna o resultado da operação aritmética realizada.
    // Para especificar funções em Java, utilizamos a palavra-chave "static" para indicar que a função pertence à classe e não a uma instância específica da classe. Além disso, definimos o tipo de retorno da função (neste caso, "double") e os parâmetros que a função recebe (neste caso, dois inteiros e uma string).
    public static double calculadora(int a, int b, String op){

        // O tipo de dado double foi escolhido para o resultado, pois a divisão pode gerar números decimais.
        // double é utilizado para armazenar números de ponto flutuante de precisão dupla, o que é adequado para cálculos matemáticos que podem envolver frações.
        double resultado = 0;

        switch (op) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "x":
                resultado = a * b;
                break;
            case "/":
                resultado = a / b;
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        return resultado;
    }


    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int a, b;
        String op;

        System.out.println("Calculadora Básica");
        System.out.println("(+, -, x, /)");

        System.out.print("Digite o primeiro número: ");
        a = leitura.nextInt();

        System.out.print("Digite o segundo número: ");
        b = leitura.nextInt();

        System.out.print("Digite a operação aritmética: ");
        op = leitura.next();

        double resultado = calculadora(a, b, op);
        System.out.println("Resultado: " + resultado);

    }
}