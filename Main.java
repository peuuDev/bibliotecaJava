package Dev1.POO.biblioteca;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); Biblioteca biblioteca = new Biblioteca();
        Livro default1 = new Livro("O livro de Ouro do Universo", "Ronaldo Mourão" ); biblioteca.adicionarLivro(default1); Livro default2 = new Livro("Origens", "Neil DeGreese Tyson"); biblioteca.adicionarLivro(default2); Livro default3 = new Livro("Cosmos", "Carl Sagan"); biblioteca.adicionarLivro(default3); 
        System.out.println("Bem-vindo à Bilbioteca Java!");
        int op;
        do {
            System.out.println("\nMenu principal - Biblioteca Java");
            System.out.println("\n1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Livro livro = new Livro(biblioteca.nomeLivro(), biblioteca.autorLivro());
                    biblioteca.adicionarLivro(livro);
                    break;
                case 2:
                    biblioteca.listarLivros();
                default:
                    break;
            }
        } while (op != 0);
    }
}
