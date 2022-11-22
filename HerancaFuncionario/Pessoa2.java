public class Pessoa2 extends Funcionario{

    private boolean transporte;

    public Pessoa2(String nome, String cargo, float salario, boolean transporte){
        super(nome, cargo, salario);
        this.transporte = transporte;
    }

    public void setTransporte(boolean transporte){
        this.transporte = transporte;
    }

    public boolean isTransporte(){
        return transporte;
    }

    public void auxilioTransporte(){
        if (transporte == true) {
            setSalario(getSalario() + 200);
        }
    }
}
