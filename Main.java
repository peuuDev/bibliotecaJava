package Dev1.POO.biblioteca;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); Biblioteca biblioteca = new Biblioteca();
        int op;
        System.out.println("Bem-vindo à Bilbioteca Java!");

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
                    System.out.println("Nome do livro: ");
                    String titulo = sc.nextLine(); 
                    System.out.println("Autor do livro");
                    String autor = sc.nextLine();
                    Livro livro = new Livro(titulo, autor);
                    biblioteca.adicionarLivro(livro);
                    break;
            
                default:
                    break;
            }
        } while (op != 0);
    }
}
