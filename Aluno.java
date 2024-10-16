package principal;
public class Aluno {
    private String nome;
    private String matricula;
    private double nota;
    private int idade;

 public Aluno () {
    
}
 public Aluno ( int idade, double nota){
     
       if (idade >= 18 && idade <= 90 ){
            this.idade = idade;
        }else {
           
        this.idade = 0;}
       
     this.nota = nota;
      if (nota >= 0 && nota < 11){
            this.nota = nota;
        }else {
        this.nota = 0;}
 }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota > 0 && nota < 11){
            this.nota = nota;
        }else {
        this.nota = 0;}
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 18 && idade <= 90){
            this.idade = idade;
        }else {
        this.idade = 0;}
    }
}
