package Banco;

public interface iConta {
    void sacar(double valorSaque);
    void depositar(double deposito);
    void transferir(double valorTransferencia, Conta contaTransferencia);
    void verificarSaldo();

    void imprimirExtrato();
}
