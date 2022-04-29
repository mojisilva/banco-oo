package Banco;

public class Main {
    public static void main(String[] args) {
        Banco a = new Banco("Banco Eliene");
        Cliente eliene = new Cliente("Eliene Silva", "54895675101");
        Conta cc = new ContaCorrente(eliene);

        a.abrirConta(cc);
        cc.depositar(1000);
        cc.verificarSaldo();
        cc.imprimirExtrato();
        cc.sacar(50);
        cc.verificarSaldo();






    }
}
