package principal;
public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private  int QntEstoque;
  
public Produto (){
    
}
public Produto (String  nome, String categoria, double preco, int QntEstoque){
    this.QntEstoque = QntEstoque;
    this.categoria = categoria;
    this.nome = nome;
    this.preco = preco;
}
// alt + insert ---> getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0){
            this.preco = 10;
        }else {
        this.preco = preco;}
    }

    public int getQntEstoque() {
        return QntEstoque;
    }

    public void setQntEstoque(int QntEstoque) {
        if (QntEstoque <= 0){
            this.QntEstoque = 1;
        }else {
        this.QntEstoque = QntEstoque;}
    }


    
}
