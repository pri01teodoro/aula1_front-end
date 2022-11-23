public class Professor extends Pessoa {
    
    private String especializacao;
    private float salario;
    
    public Professor(String nome, int idade, String sexo, String especializacao, float salario){
        super(nome, idade, sexo);
        this.especializacao = especializacao;
        this.salario = salario;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println("O professor está em exercício");
    }
}
