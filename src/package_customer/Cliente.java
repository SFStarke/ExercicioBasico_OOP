package package_customer;

import package_person.Pessoa;

/**
 *
 * @author Sérgio Felipe Starke
 */
public class Cliente extends Pessoa {

    private int cpf, fone;
    
    public Cliente(String nome, int idade, int cpf, int fone){
        super.nome = nome;
        super.idade = idade;
        this.cpf = cpf;
        this.fone = fone;
    }
    
    @Override //Método de sobreposição toString.
    public String toString(){
return "\n[ Cliente ] "+super.toString()+".\nComplementos: cpf "+this.cpf+", fone "+this.fone+".";
}

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

}
