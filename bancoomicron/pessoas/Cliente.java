// Natan da Silveira Ferreira ; 120027447 ;

package br.com.bancoomicron.pessoas;

import br.com.bancoomicron.carteiras.CarteiraContas;
import br.com.bancoomicron.contas.Conta;

public class Cliente extends Pessoa {
    private CarteiraContas contas;
    private int matricula;
    public static int gerador_matricula;

    public Cliente(String cpf,String nome){
        super(cpf, nome);
        this.matricula= geraMatricula();
        contas = new CarteiraContas();
    }
    public Cliente(String cpf,String nome, Conta conta){
        super(cpf, nome);
        adicionarConta(conta);
        this.matricula= geraMatricula();
        contas = new CarteiraContas();
    }
    public static int geraMatricula(){
        gerador_matricula=gerador_matricula+1;
        return gerador_matricula;
    }
    public double somaSaldos(){return contas.somaSaldo();}
    public int numContas(){
        return contas.quantidadeContas();
    }
    public int getMatricula() {
        return this.matricula;
    }
    public void adicionarConta(Conta c){
        contas.adicionaConta(c); }
    public boolean removerConta(int numero_conta) {
    if(contas.removerConta(numero_conta)){return true;}else{return false;}
    }}
