package Dev1.POO.biblioteca;
import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

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
