
// Natan da Silveira Ferreira ; 120027447 ;

package br.com.bancoomicron.contas;

public abstract class Conta {
    protected double saldo;
    protected int numero, matricula_cliente;

    Conta(int numero, int matricula_cliente){
        this.numero=numero;
        this.matricula_cliente=matricula_cliente;
        this.saldo=0;
    }
    public void depositar(double valor){
        saldo=saldo+valor;

    }
    public abstract boolean sacar(double valor);

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }
}
