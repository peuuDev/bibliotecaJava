package Dev1.POO.biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void devolverLivro(){
        int i = 1;
        if (livrosEmprestados.isEmpty()) {
            System.out.println("\nVocê não tem nenhum livro emprestado para devolver!");
        }else{
            System.out.println("Lista de livros que foram emprestados para você:\n");
            for(Livro livro : livrosEmprestados){
                System.out.println(i + "º Livro emprestado: ");
                livro.infoLivro();
                i++;
            }
            System.out.println();
            if (livrosEmprestados.size() > 1) {
                System.out.println("Digite o número do livro que deseja devolver");
                int dev = sc.nextInt() - 1;
                try{
                    (livrosEmprestados.get(dev)).devolver();
                    System.out.println("'" + livrosEmprestados.get(dev).getTitulo() + "' foi devolvido!");
                    livrosEmprestados.remove(livrosEmprestados.get(dev));
                }catch(java.lang.IndexOutOfBoundsException e){
                    System.out.println("\nNúmero de livro inexistente!");
                }
            }else if (livrosEmprestados.size() == 1) {
                try{
                    (livrosEmprestados.get(0)).devolver();
                    System.out.println("'" + livrosEmprestados.get(0).getTitulo() + "' foi devolvido!");
                    livrosEmprestados.remove(livrosEmprestados.get(0));
                }catch(java.lang.IndexOutOfBoundsException e){
                    System.out.println("\nNúmero de livro inexistente!");
                }
            }
        }
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
        try {
            (livros.get(emp)).emprestar();
            livrosEmprestados.add(livros.get(emp));
            System.out.println("'" + (livros.get(emp)).getTitulo() + "' foi emprestado para você!");
        } catch (java.lang.IndexOutOfBoundsException e ) {
            System.out.println("\nNúmero de livro inexistente!");
        }
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
