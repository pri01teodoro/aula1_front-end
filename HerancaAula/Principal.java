public class Principal {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Maria", 15, "Feminino", 2021, "T.I");

        Professor p1 = new Professor("Marcos", 38, "Masculino", "Engenheiro de Software", 3000);

        AulasParticulares aula1 = new AulasParticulares(p1, a1);

        aula1.marcarAula(p1, a1);
    }
}
