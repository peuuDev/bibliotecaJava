package Dev1.POO.biblioteca;
import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
}
