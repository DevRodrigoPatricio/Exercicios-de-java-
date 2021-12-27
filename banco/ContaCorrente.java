package atv2;

public class ContaCorrente {
    int numero;
    int digito;
    Agencia agencia;
    double saldo;
    public  ContaCorrente (int numero , int digito  ,double saldo, Agencia agencia){
        this.numero = numero;
        this.digito = digito;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public  int getNumero ()
    {
        return  this.numero;

    }
    public  int getDigito(){

        return this.digito;
    }
    public Agencia getAgencia(){
        return  this.agencia;
    }
    public  double getSaldo(){
        return  this.saldo;
    }
    public void setNumero(int numero){

        this.numero = numero;
    }
    public void  setDigito (int digito){
        this.digito =digito;
    }
    public void setAgencia (Agencia agencia)
    {
        this.agencia = agencia;

    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }
    public void depositar (double valordeposito){
        
        this.saldo += valordeposito;
    }
    public  void  sacar (double valordesaque){
        this.saldo -= valordesaque;
        for (this.saldo = saldo; this.saldo <=0 ; ) {
            System.out.print("não há saldo !!");
            this.saldo = 0;
            break;
            
        }

    }

    public String ConsultarSaldo() {
        return "ContaCorrente :" +
                "\nnumero = " + numero +
                "\ndigito = " + digito +
                "\nagencia =" + agencia.getNumero()+
                "\ndigito = " + agencia.getDigito()+
                "\nsaldo = " + saldo ;
    }
}

