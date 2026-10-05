import java.util.ArrayList;


public class Listas {
    public static void main(String[] args){
        // java.util.List<String> -> Cria uma lista, que só comporta elementos do tipo String
        // new java.util.ArrayList<String>() -> É especificado novamente, porque estamos criando uma nova instância da lista.
        ArrayList<String> materiais = new ArrayList<>();
    
        // Adicionando elementos à lista

        // O método add() é usado para adicionar elementos à lista.
        materiais.add("Lápis");
        materiais.add("Livro");
        materiais.add("Borracha");

        // O método set() é usado para substituir um elemento na lista.
        materiais.set(1, "E-book");

        // Exibindo os elementos da lista
        System.out.println("Materiais: " + materiais);
        System.out.println("Tamanho: " + materiais.size()); // size() retorna o número de elementos na lista

        // Removendo um elemento da lista
        materiais.remove(2);
        System.out.println("Materiais após remoção: " + materiais);
        System.out.println("Tamanho: " + materiais.size());

    }
    
}
