package atv1;

public class Professor {
    private String nome;
    private  int idade;
    public Professor (String nome, int idade){
        this.nome =nome;
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade (){
        return this.idade;
    }
    public void setNome(String nome){
        this.nome =nome;
    }
    public void setIdade (int idade){
        this.idade = idade ;
    }

    @Override
    public String toString() {
        return   "Professor " +this.nome + '\n'+
                 this.idade + " anos.";
    }
}
