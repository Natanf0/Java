
// Natan da Silveira Ferreira ; 120027447 ;

package br.com.bancoomicron.carteiras;
import br.com.bancoomicron.contas.Conta;
import br.com.bancoomicron.pessoas.Cliente;
import java.util.ArrayList;
public class CarteiraContas implements IAuditoria{
    ArrayList<Conta> contas = new ArrayList<Conta>();
    public CarteiraContas(){
        this.contas.clear();
    }
    public void adicionaConta(Conta c){
        this.contas.add(c);
    }
    public boolean removerConta(int numero){
        if (contas.contains(contas.get(numero))){
            contas.remove(numero);
            return true;
        }else{return false;}
    }
    public int tamanho(){
        return this.contas.size();
    }
    public int quantidadeContas(){
        return this.contas.size();
    }
    @Override
    public double somaSaldo() {
        double soma_saldo = 0;
        for(Conta c : contas){
            double saldo = c.getSaldo();
            soma_saldo+=saldo;
        }
        return soma_saldo;
    }

}
