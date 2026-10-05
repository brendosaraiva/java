import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        int inicio;
        int fim;
        int passo;
        String operacao;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        inicio = leitura.nextInt();

        System.out.print("Digite o valor final: ");
        fim = leitura.nextInt();

        System.out.print("Digite o passo: ");
        passo = leitura.nextInt();

        System.out.print("Digite a operação (+/-): ");
        operacao = leitura.next();
        
        if (operacao.equals("+")){
            for (int i = inicio; i <= fim; i += passo){
                System.out.println(i);
            }
        }else if (operacao.equals("-")){
            for (int i = inicio; i >= fim; i -= passo){
                System.out.println(i);
            }
        }

        leitura.close();

    }
}
