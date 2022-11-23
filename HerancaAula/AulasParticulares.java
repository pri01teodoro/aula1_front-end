public class AulasParticulares {
    private Professor professor;
    private Aluno aluno;

    public AulasParticulares(Professor professor, Aluno aluno){
        this.professor = professor;
        this.aluno = aluno;
    }

    public Professor getProfessor(){
        return professor;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public Aluno getAluno(){
        return aluno;
    }

    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }

    public void marcarAula(Professor p, Aluno a){
        System.out.println("Aula com o professor " + p.getNome() + " marcada.");
    }
}
