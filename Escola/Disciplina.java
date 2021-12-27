package atv1;

public class Disciplina {
    private String nome;
    private  boolean pratica;
    public  Disciplina (String nome, boolean pratica){
        this.nome = nome;
        this.pratica = pratica;
    }
    public String getNome() {
        return  this.nome;
    }
    public boolean getPratica (){
        return  this.pratica;
    }
    public  void setNome (String nome){
        this.nome = nome;
    }
    public  void setPratica(boolean pratica){
        this.pratica = pratica;
    }

    @Override
    public String toString() {
        return  "Disciplina  " +this.nome + '\n' +
                  "pratica "+ this.pratica ;
    }
}
