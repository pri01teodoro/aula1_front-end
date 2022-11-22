/**
 * Funcionario1
 */
public class Pessoa1 extends Funcionario{
    
    private boolean filhos;

    public Pessoa1(String nome, String cargo, float salario, boolean filhos){
    super(nome, cargo, salario);
        this.filhos = filhos;
    }

    public boolean isFilhos() {
        return filhos;
    }

    public void setFilhos(boolean filhos) {
        this.filhos = filhos;
    }

    public void auxilioFamilia(){
        if(filhos ==true){
            this.setSalario(getSalario() + 300);
        }
    }

}