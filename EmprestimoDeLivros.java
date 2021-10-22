
import java.util.ArrayList;

public class EmprestimoDeLivros {
    
    private String titulo;
    private String autor;
    private String genero;
    private Float preco;

    //Contrutores
    public EmprestimoDeLivros() { } //default

    //Sobrecarregados
    public EmprestimoDeLivros(String titulo, String autor, String genero, Float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(){
        this.preco = preco;
    }

    //Metodos da classe
    public String imprimir() {
        return "Título: " + titulo + "\n Autor: " + autor + "\nGênero: " + genero + 
        String.format("\nPreço R$ %.2f \n ", preco);
    }
}
