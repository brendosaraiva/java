import java.util.Scanner;
import java.util.Arrays;



public class Vetores {

    public static void alteraNota(int notas[], int n){
        for (int i = 0; i < n; i++){
            notas[i] += 10; // Alterando as notas, adicionando 10 a cada nota
        }
    }

    public static void main(String[] args) {
        // Vetores são estruturas de dados que armazenam múltiplos valores do mesmo tipo em uma única variável. Eles são úteis para organizar e manipular conjuntos de dados relacionados.
        // Em Java, os vetores são implementados como arrays, que possuem tamanho fixo e podem ser acessados por índices.
        // A declaração de um vetor envolve especificar o tipo de dado, seguido pelo nome do vetor e o tamanho entre colchetes.
        // A inicialização do vetor pode ser feita atribuindo valores diretamente ou utilizando um loop para preencher os elementos.

        // Declaração e inicialização de um vetor de inteiros com 5 elementos
        Scanner leitura = new Scanner(System.in);
        int[] numeros = new int[5];
        int n = 5;
        int notas[] = new int[n];
        double media = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite a nota " + (i + 1) + "ª: ");
            notas[i] = leitura.nextInt();
        }

        //Imprimindo as notas digitadas (antes)
        for (int i = 0; i < n; i++){
            System.out.println("Nota " + (i + 1) + "ª: " + notas[i]);
        }

        // Imprimindo a média das notas
        for (int i = 0; i < n; i++){
            media += notas[i];
        }

        // Média antes de chamar a função alteraNota
        media /= n;
        System.out.println("Média das notas: " + media);

        // OBS: Em Java, os vetores são passados por referência para funções, o que significa que qualquer alteração feita no vetor dentro da função afetará o vetor original fora da função.
        // Isso permite que funções modifiquem diretamente os elementos do vetor sem a necessidade de retornar um novo vetor.

        // Chamando a função para alterar as notas
        alteraNota(notas, n);

        //Imprimindo as notas digitadas (depois)
        for (int i = 0; i < n; i++){
            System.out.println("Nota " + (i + 1) + "ª: " + notas[i]);
        }

        // Imprimindo a média das notas
        media = 0;
        for (int i = 0; i < n; i++){
            media += notas[i];
        }
        media /= n;
        System.out.println("Média das notas depois: " + media);


        // Preenchendo o vetor com valores
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; // Atribuindo valores de 1 a 5
        }

        // Exibindo os valores do vetor
        System.out.println("Valores do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }

        // Podemos iterar os vetores, utilizando for each loops, que simplificam a iteração sobre os elementos do vetor sem a necessidade de gerenciar índices manualmente.
        System.out.println("Iterando com for each:");
        for (int numero : numeros) {
            System.out.println(numero);
        }


    }
    
}
