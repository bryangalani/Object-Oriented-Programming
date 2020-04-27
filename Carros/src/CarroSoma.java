
public class CarroSoma extends CarroDeCorrida{
	private int potencia;
	
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}

	//definindo metodo abstrato
	public void acelerar() {
		velocidade += potencia;
		if(velocidade > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
		}
	}
	//Overriding a method
	public void Porta() {
		System.out.println("Este carro tem 3 portas");
	}
	
	//Acessing the overriden method
	public void portaPai() {
		super.Porta();
	}
	
	//Trying to override final method
	//public void TetoSolar() {System.out.println("Esse tem teto solar");}

}
