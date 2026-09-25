public class Variaveis {
    public static void main(String[] args) {
        // Declaração de variáveis
        int idade = 25; // Variável do tipo inteiro
        float peso = 69.5f; // Variável do tipo float
        double altura = 1.75; // Variável do tipo double
        char genero = 'M'; // Variável do tipo char
        boolean estudante = true; // Variável do tipo boolean

        //OBS: float e double são tipos de dados para números
        //decimais, mas double tem maior precisão que float.
        //porquê o float tem menor precisão? Porque o float ocupa 4 bytes
        //de memória, enquanto o double ocupa 8 bytes, permitindo armazenar números com mais casas decimais.

    // Exibindo os valores das variáveis
    System.out.println("Olá mundo!");
    System.out.println("Idade: " + idade);
    System.out.println("Peso: " + peso);
    System.out.println("Altura: " + altura);
    System.out.println("Gênero: " + genero);
    System.out.println("Estudante: " + estudante);
    }
}