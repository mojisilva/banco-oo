package Banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        tipo = "Conta Poupanca";
    }
}
