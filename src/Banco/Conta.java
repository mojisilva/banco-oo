package Banco;

public class Conta {
    char tipo;
    int agencia;
    int numero;
    double saldo;

    public Conta(char tipo, int agencia, int numero, double saldo) {
        this.tipo = tipo;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta() {
    }

    void sacar(){

    }
    void depositar(double deposito ){

    }
    void transferir(double valorTransferencia, Conta agencia, Conta numero){

    }
    void transferir(double valorTransferencia, Cliente cpf){

    }
}
