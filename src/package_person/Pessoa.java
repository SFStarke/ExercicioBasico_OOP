package package_person;

/**
 *
 * @author Sérgio Felipe Starke
 */
public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    
    @Override //Método de sobreposição toString.
    public String toString(){
       return ": "+this.nome+". Idade ["+this.idade+"]" ;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
}
