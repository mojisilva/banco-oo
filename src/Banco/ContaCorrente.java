package Banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        tipo = "Conta Corrente";

    }
}
