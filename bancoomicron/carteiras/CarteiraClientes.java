// Natan da Silveira Ferreira ; 120027447 ;

package br.com.bancoomicron.carteiras;
import br.com.bancoomicron.pessoas.Cliente;
import br.com.bancoomicron.pessoas.Pessoa;
import java.util.ArrayList;

public class CarteiraClientes implements IAuditoria{
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public CarteiraClientes(){
        this.clientes.clear();
    }
    public int quantidadeContas() {
        return this.clientes.size();
    }
    public double somaSaldo() {return 1;}
    public void adicionaCliente(Cliente c){
        this.clientes.add(c);
    }
    public boolean removerCliente(String cpf){
        if(getIndicePorCPF(cpf)!=-1){
            clientes.remove(getIndicePorCPF(cpf));
            return true;
        }else{return false;}
    }
    public int removerCliente(String[] cpfs){
        for (String cpf : cpfs){
            if(getIndicePorCPF(cpf)!=-1){
                clientes.remove(getIndicePorCPF(cpf));
            }
        }
        return 0;
    }
    private int getIndicePorCPF(String cpf) {
        ArrayList<String> osCPFs = new ArrayList<>();
        osCPFs.clear();
        for (Cliente c : clientes) {
            String variavel = c.getCpf();
            osCPFs.add(variavel);
        }
        if(osCPFs.contains(cpf)){
            return osCPFs.indexOf(cpf);
        }else{return -1;}
    }
    public Cliente buscaCPF(String cpf) {
        if(getIndicePorCPF(cpf)!=-1){
            return clientes.get(getIndicePorCPF(cpf));
        }else{return null;}
    }
}