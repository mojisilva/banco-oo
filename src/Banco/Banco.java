package Banco;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Banco {
     private String nome;
     private List<Conta> contas;
     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public Banco(String nome) {
          this.nome = nome;
     }

     void abrirConta(Conta conta){
          System.out.println("Conta criada para cliente: " + conta.cliente.getNome());
          System.out.println("Agencia: " +  conta.agencia + " Numero: " + conta.numero );
     }
     void fecharConta(Conta conta){
          conta.sacar(conta.saldo);
          System.out.println("Conta finalizada!");

     }
}
