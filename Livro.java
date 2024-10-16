package principal;
public class Livro {
    
    private String titulo;
    private String autor;
    private String genero;
    private double preco;

    public Livro (){
        // construtor vazio 
    }
    
    public Livro (String titulo, String autor, String genero, double preco) {
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
        this.titulo = titulo;
    }
    // alt + insert ---> getter e setter

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
     
}
