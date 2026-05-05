package Dev1.POO.biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>(); private Scanner sc = new Scanner(System.in); 

    public String nomeLivro(){
        System.out.println("Nome do livro: ");
        String t = sc.nextLine(); 
        return t;
    } 

    public String autorLivro(){
        System.out.println("Autor do livro: ");
        String a = sc.nextLine();
        return a;
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivros(){
        int i = 1;
        for(Livro livro : livros){
            System.out.println("\n" + i + "º Livro: ");
            livro.infoLivro();
            i++;
        }
    } 
}
