
public abstract class CarroDeCorrida {

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;
	
	public CarroDeCorrida(String nome, int velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade =0;
	}

	public void frear() {
		velocidade = velocidade/2;
		
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}
	
	public abstract void acelerar();
	
	public void Porta() {
		System.out.println("Este carro tem 2 portas");
	}
	
	public final void TetoSolar() {
		System.out.println("Nenhum carro tem teto solar!");
		
	}

}
