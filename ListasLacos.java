import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class ListasLacos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println();
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Lápis");
        lista.add("Caderno");
        lista.add("Livro");
        lista.add("Borracha");

        
        // Iterar sobre a lista usando for tradicional
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        System.out.println();
        Collections.sort(lista);
        System.out.println();

        // Ou iterar sobre a lista usando for each
        for (String item : lista) {
            System.out.println(item);
        }

        System.out.println();
        System.out.println("Lista de itens: " + lista);

        // OBS: O escopo do for não precisa de ponto e vírgula, porquê ele já delimita o bloco de código a ser executado.
        // Já os comandos que ficam dentro dele não, então precisamos usar ponto e vírgula ao final de cada comando.

        leitura.close();
    }
}
