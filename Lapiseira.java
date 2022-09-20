
public class Lapiseira {
	public String marca;
	protected float tamanhoGrafite;
	private String tipoGrafite;
	public String cor;
	public boolean carregada;
	
	
	public void carregar() {
		this.carregada = true;
		System.out.println("Lapiseira carregada.");
	}
	
	public void descarregar() {
		this.carregada = false;
		System.out.println("Lapiseira descarregada.");
	}
	
	public void escrever() {
		if(this.carregada == true) {
			System.out.println("Escrevendo.");
		} else {
			System.out.println("ERRO! Lapiseira sem ponta!");
		}
	}

	
	
	//marca
	public String getMarca(){
		return this.marca;
	}

	public void setMarca(String m) {
		this.marca = m;
	}

	//tamanhoGrafite
	public float gettamanhoGrafite(){
		return this.tamanhoGrafite;
	}

	public void settamanhoGrafite(float t) {
		this.tamanhoGrafite = t;
	}
	
	//tipoGrafite
	public String getTipoGrafite(){
		return this.tipoGrafite;
	}

	public void setTipoGrafite(String t) {
		this.tipoGrafite = t;
	}
	
	/* public void mudarPonta() {
		this.tipoGrafite = "2B";
		System.out.println(this.tipoGrafite);
	} */
	
	//método construtor padrão
	public Lapiseira(){
		
	}

	//construtor passando alguns parâmetros
	public Lapiseira(String marca, float tamanhoGrafite){
		this.marca = marca; //this.setmarca(marca)
		this.tamanhoGrafite = tamanhoGrafite; //this.settamanhoGrafite(tamanhoGrafite)
	}

	//construtor passando todos os parâmetros
	public Lapiseira(String marca, float tamanhoGrafite, String tipoGrafite, String cor, boolean carregada){
		this.marca = marca;
		this.tamanhoGrafite = tamanhoGrafite;
		this.tipoGrafite = tipoGrafite;
		this.cor = cor;
		this.carregada = carregada;
	}


	public static void main(String[] args) {
		
		Lapiseira l1 = new Lapiseira();
		/* l1.marca = "Faber Castell";
		l1.tamanhoGrafite = 0.7f; */
		l1.setTipoGrafite ("1B");
		/* l1.cor = "vermelha";
		l1.carregada = false;
		l1.escrever();
		
		System.out.println(l1.carregada);
		l1.carregar();
		System.out.println(l1.carregada);
		l1.escrever();
		l1.mudarPonta(); */
 
		System.out.println(l1.getTipoGrafite());

	}

}
