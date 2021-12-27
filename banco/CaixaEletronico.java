package atv2;

public class CaixaEletronico {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(" Ademar Apior","123231518-12");
        Agencia agencia = new Agencia( 7890,5);
        c1.contaCorrente = new ContaCorrente(1234,4,150.00,agencia);

        c1.contaCorrente.sacar(140);
        System.out.println(c1.contaCorrente.ConsultarSaldo());
        c1.contaCorrente.sacar(200);
        System.out.print(c1.contaCorrente.ConsultarSaldo());
        c1.contaCorrente.depositar(25.45);
        System.out.println(c1.contaCorrente.ConsultarSaldo());

    }
}
