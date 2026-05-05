package Dev1.POO.biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void devolverLivro(){
        
    }

    public void emprestarLivro(){
        int i = 1;
        System.out.println("Livros disponíveis para empréstimo:\n");
        for(Livro livro : livros){
            if (livro.getEmprestado() == false) {
                System.out.println(i + "º Livro: ");
                livro.infoLivro();
                i++;
            }
            System.out.println();
        }
        System.out.println("Selecione o número do livro que deseja pegar emprestado: ");
        int emp = sc.nextInt() - 1;
        (livros.get(emp)).emprestar();
        System.out.println("'" + (livros.get(emp)).getTitulo() + "' foi emprestado para você!");
    }

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
