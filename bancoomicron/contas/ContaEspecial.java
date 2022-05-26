// Natan da Silveira Ferreira ; 120027447 ;

package br.com.bancoomicron.contas;

public class ContaEspecial extends ContaCorrente {
    private double cheque_especial;
    private double taxa_iof = 0.03;

    public ContaEspecial(int numero, int matricula_cliente, double cheque_especial) {
        super(numero, matricula_cliente);
        this.cheque_especial=cheque_especial;
    }
    @Override
    public boolean sacar(double valor) {
        if(valor<=super.getSaldo()){
            super.sacar(valor);
            return true;
        }else if((valor-super.getSaldo())*1.03<=this.cheque_especial){
            double descontado = (valor-super.getSaldo())*1.03;
            this.saldo=-descontado;
            return true;
        }else{return false;}
        }
    }

