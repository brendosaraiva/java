import java.util.Scanner;


public class Matriz{
    public static void main(String[] args){
        // Matrizes são um conjunto de dois ou mais vetores, na qual são armazenados dados de forma bidimensional/multidimensional
        // comporta valores para linhas e colunas. Para chamar uma matriz, basta passar dois colchetes, um para o eixo x e outro para y. 
        int matriz[][] = new int[3][3];

        Scanner leitura = new Scanner(System.in);

        // Como captar dados para uma matriz
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Informe o valor para a posição "+i+", "+j+": ");
                matriz[i][j] = leitura.nextInt();
            }   
        }

        // Como imprimir os dados da matriz
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
