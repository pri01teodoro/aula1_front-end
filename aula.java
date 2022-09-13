package atividade;


public class Aula{
    public String data;
    public String horario;
    public String turma;
    public String curso;
    public String bloco;
    public String sala;
    private boolean ativa = false;
    
    //data
    public String getData(){
		return this.data;
	}

	public void setData(String d) {
		this.data = d;
	}

    //horario
    public String getHorario(){
		return this.horario;
	}

	public void setHorario(String h) {
		this.horario = h;
	}

    //turma
    public String getTurma(){
		return this.turma;
	}

	public void setTurma(String t) {
		this.turma = t;
	}

    //curso
    public String getCurso(){
		return this.curso;
	}

	public void setCurso(String c) {
		this.curso = c;
	}

    //bloco
    public String getBloco(){
		return this.bloco;
	}

	public void setBloco(String b) {
		this.bloco = b;
	}

    //sala
    public String getSala(){
		return this.sala;
	}

	public void setSala(String s) {
		this.sala = s;
	}

    //ativa
    public boolean getAtiva(){
		return this.ativa;
	}

	public void setAtiva(boolean at) {
		this.ativa = at;
	}

    /* public void desativarAula() {
        this.ativa = false;
        System.out.println("Não é possível assistir a aula, pois está inativa.");
        
    }

    public void ativarAula() {
        this.ativa = true;
        System.out.println("A aula está ativa.");
        
    }

    public void mostrarStatus() {
        if(this.ativa == true){ 
            System.out.println("A aula será no dia " + data + ", às " + horario + ", para a turma " + turma + " do cuso de " + curso + ", no bloco " + bloco + ", sala " + sala);
        } else {
            System.out.println("Aula inativa, por favor escolha outra.");
        }
        
    } */

    /* public void mudarStatus() {
        this.ativa = !ativa;
        System.out.println(this.ativa);
        } */

    public static void main(String[] args) {
        
        Aula a = new Aula();
        a.setData("06/09/2022");
        a.setHorario("19h");
        a.setTurma("2021");
        a.setCurso("ADS");
        a.setBloco("A");
        a.setSala ("3");
        a.setAtiva(true);
        /* a.mudarStatus();
        a.mostrarStatus();
         */
        System.out.println(a.getData());
        System.out.println(a.getHorario());
        System.out.println(a.getTurma());
        System.out.println(a.getCurso());
        System.out.println(a.getBloco());
        System.out.println(a.getSala());
        System.out.println(a.getAtiva());

    

    }
}
