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
                    sc.nextLine(); // Limpa o buffer do teclado (consome o \n do nextInt)
                    System.out.println("Nome do livro: ");
                    String t = sc.nextLine(); 
                    System.out.println("Autor do livro: ");
                    String a = sc.nextLine();
                    Livro livro = new Livro(t, a);
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
