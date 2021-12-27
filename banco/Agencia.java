package atv2;

public class Agencia {
    int numero;
    int digito;
    public  Agencia(){

    }
    public Agencia( int numero1, int digito1){
        this.numero = numero1;
        this.digito= digito1;
    }

    public  int getNumero (){
        return  this.numero;
    }
    public  int getDigito(){
        return  this.digito;
    }
    public void setNumero (int numero){
        this.numero = numero;
    }
    public void setDigito (int digito){
        this.digito = digito;
    }

}
