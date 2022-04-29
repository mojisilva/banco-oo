package Banco;

public abstract class Conta implements iConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected String tipo;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }
    public void sacar(double valorSaque){
        if(valorSaque > this.saldo || this.saldo <=0){
            System.out.println(String.format("Você não tem saldo suficiente, seu saldo é %.2f R$.",this.saldo));
        }else {
            this.saldo = this.saldo - valorSaque;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void depositar(double deposito){
        this.saldo = this.saldo + deposito;
        this.verificarSaldo();
        System.out.printf("Seu saldo agora é de %.2f R$ %n", this.saldo);
    }

    public void transferir(double valorTransferencia, Conta contaTransferencia){
        this.sacar(valorTransferencia);
        contaTransferencia.depositar(valorTransferencia);
    }

    public void verificarSaldo(){
        System.out.println(String.format("O seu saldo é %.2f R$", this.saldo));
    }
    public void imprimirExtrato(){
        System.out.println(String.format("===========Extrato %s===========", this.tipo));
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f R$", this.saldo));

    }
}
