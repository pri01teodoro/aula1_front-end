
public class Funcionario {

    private String nome;
    public String cargo;
    private float salario;

    public Funcionario(String nome,  String cargo, float salario){ //construtor
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void getNome(String nome){
        this.nome = nome;
    }

    public String setNome(){
        return nome;
    } 

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void comissao(float valor){
        this.setSalario(this.getSalario() + valor);
    }

    public void auxilioFamilia() {
    }

    public void auxilioTransporte() {
    }
}