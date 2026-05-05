package Dev1.POO.biblioteca;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); Biblioteca biblioteca = new Biblioteca();
        Livro default1 = new Livro("O livro de Ouro do Universo", "Ronaldo Mourão" ); biblioteca.adicionarLivro(default1); Livro default2 = new Livro("Origens", "Neil DeGreese Tyson"); biblioteca.adicionarLivro(default2); Livro default3 = new Livro("Cosmos", "Carl Sagan"); biblioteca.adicionarLivro(default3); Livro default4 = new Livro("Uma breve história do tempo", "Stephen Hawking"); biblioteca.adicionarLivro(default4); Livro default5 = new Livro("Teoria da Relatividade: Sobre a Teoria da Relatividade Especial e Geral", "Albert Einstein"); biblioteca.adicionarLivro(default5);
        System.out.println("Bem-vindo à Bilbioteca Java!");
        int op;
        do {
            System.out.println("\nMenu principal - Biblioteca Java");
            System.out.println("\n1 - Adicionar livro" +
                "\n2 - Listar livros" +
                "\n3 - Emprestar livro" +
                "\n4 - Devolver livro" +
                "\n0 - Sair"
            );
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Livro livro = new Livro(biblioteca.nomeLivro(), biblioteca.autorLivro());
                    biblioteca.adicionarLivro(livro);
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    biblioteca.emprestarLivro();
                    break;
                case 4:
                    biblioteca.devolverLivro();
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }
}
