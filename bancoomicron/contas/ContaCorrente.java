
// Natan da Silveira Ferreira ; 120027447 ;

package br.com.bancoomicron.contas;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, int matricula_cliente){
        super(numero, matricula_cliente);
    }

    //@Override
    public boolean sacar(double valor) {
        if (valor<=super.getSaldo()){
            this.saldo=this.saldo-valor;
            return true;
        }else{
            return false;}
    }
}
