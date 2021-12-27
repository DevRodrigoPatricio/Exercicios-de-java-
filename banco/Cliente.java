package atv2;

public class Cliente {
    String nome ;
    String cpf ;
    ContaCorrente contaCorrente;
    public  Cliente  (String nome, String cpf ){
        this.nome =  nome;
        this.cpf = cpf;

    }
    public  String getNome (){
        return  this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome (){
        this.nome =nome;
    }
    public void setCpf(){
        this.cpf =cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
