package principal;
public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto ();
        p1.setCategoria("alimentos");
        p1.setNome("arroz");
        p1.setQntEstoque(-1);
        p1.setPreco(30.00);
        System.out.println("Categoria: " + p1.getCategoria() + "| Nome: " + p1.getNome() + "| Quantidade em estoque: " + p1.getQntEstoque() + "| Preço: R$ " + p1.getPreco());
        
        Produto p2 = new Produto ();
        p2.setCategoria("Eletronicos");
        p2.setNome("Computador");
        p2.setQntEstoque(12);
        p2.setPreco(-123);
        System.out.println("Categoria: " + p2.getCategoria() + "| Nome: " + p2.getNome() + "| Quantidade em estoque: " + p2.getQntEstoque() + "| Preço: R$ " + p2.getPreco());
        
        Produto p3 = new Produto ();
        p3.setCategoria("Comestico");
        p3.setNome("Lixeira");
        p3.setQntEstoque(-12);
        p3.setPreco(-123);
        System.out.println("Categoria: " + p3.getCategoria() + "| Nome: " + p3.getNome() + "| Quantidade em estoque: " + p3.getQntEstoque() + "| Preço: R$ " + p3.getPreco()); 
       
    }
    
}
