
public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroA",10,110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroB",8,140));
		corridaDaAmizade.adicionaCarro(new CarroMult("CarroC",1.7,100));
		corridaDaAmizade.adicionaCarro(new CarroMult("CarroD",1.4,120));
		
		corridaDaAmizade.umDoisTresEJa();
		
		
		CarroSoma carroTest = new CarroSoma("Test", 10,150);
		
		carroTest.Porta();
		carroTest.portaPai();
	}

}
