import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        boolean roupas = false;
        Scanner leitura = new Scanner(System.in);

        do {
            System.out.print("Já arrumou as roupas? (sim/não) ");
            String resposta = leitura.nextLine();

            if (resposta.equals("sim")) {
                System.out.println("Obrigado por arrumar as roupas!");
                roupas = true;
            } else {
                System.out.println("Por favor, arrume as roupas.");
            }
        } while (roupas == false);
    }
}
