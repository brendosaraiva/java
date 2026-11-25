import java.util.Scanner;


public class Matriz{
    public static void main(String[] args){
        int matriz[][] = new int[3][3];

        Scanner leitura = new Scanner(System.in);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Informe o valor para a posição"+i+","+j+":");
                matriz[i][j] = leitura.nextInt();
            }   
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
