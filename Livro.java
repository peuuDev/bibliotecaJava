package Dev1.POO.biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public void infoLivro(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Status: " + (this.emprestado ? "Livro emprestado" : "Livro disponível"));
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public boolean getEmprestado(){
        return emprestado;
    }
    public boolean emprestar(){
        return emprestado = true;
    }
    public boolean devolver(){
        return emprestado = false;
    }
}
