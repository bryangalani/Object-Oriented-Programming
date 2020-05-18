import java.util.Random;

public class FabricaMecanicaDoJogo {

	
	private MecanicaDoJogo mecanica1 = new Mecanica01();
	private MecanicaDoJogo mecanica2 = new Mecanica02();

	public MecanicaDoJogo mecanicaEscolhida() {
		
		Random rand = new Random();
		int randomNum = rand.nextInt((2 - 1) + 1) + 1; //3
		
		try {
			switch (randomNum) {
			case 1:
				return mecanica1;
			case 2:
				return mecanica2;
			}
		}catch(Exception e) {
			System.out.println("Mecanica nao encontrada: " +e.getMessage());
		}
		
		return mecanica1;
	}
	
	
}
