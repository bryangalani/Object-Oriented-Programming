import java.util.Random;

public class FabricaEmbaralhadores {

	private Embaralhador e1 = new Embaralhador01();
	private Embaralhador e2 = new Embaralhador02();


	public Embaralhador embaralhadorEscolhido() {

		Random rand = new Random();
		int randomNum = rand.nextInt((2 - 1) + 1) + 1; //3

		try {
			switch (randomNum) {
			case 1:
				return e1;
			case 2:
				return e2;
			}
		}catch(Exception e) {
			System.out.println("Embaralhador nao encontrado: " +e.getMessage());
		}

		return e1;
	}


}
