package principal;
public class Principal {

    public static void main(String[] args) {
        Livro livro1 = new Livro ();
        livro1.setTitulo("Harry Potter");
        livro1.setAutor("JK");
        livro1.setGenero("Fantasia");
        livro1.setPreco(40.00);
        System.out.println("Título: " + livro1.getTitulo()+ " Autor: " + livro1.getAutor() + " Genero: " + livro1.getGenero() + " Preço: R$ "+ livro1.getPreco());
 
        Livro livro2 = new Livro ();
        livro2.setTitulo("Codigo da Vinci");
        livro2.setAutor("Dan Brown");
        livro2.setGenero("Suspense");
        livro2.setPreco(50.00);
        System.out.println("Título: " + livro2.getTitulo()+ " Autor: " + livro2.getAutor() + " Genero: " + livro2.getGenero() + " Preço: R$ "+ livro2.getPreco());
 
}
    
}
