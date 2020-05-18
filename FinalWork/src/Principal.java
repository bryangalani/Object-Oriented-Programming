
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.println("\t \t Bem vindo ao Jogo Embaralhado!! \t \t");
		
		Scanner ler = new Scanner(System.in);
		Scanner resp = null;
	    System.out.printf("Para começar informe o nome do arquivo de texto com as palavras a serem embaralhadas:\n");
	    String nome = ler.nextLine();
	    
		BancoDePalavras bp = new BancoDePalavras();
		bp.lerArq(nome);
		
		FabricaMecanicaDoJogo fMec = new FabricaMecanicaDoJogo();
		MecanicaDoJogo utilizado;
		utilizado = fMec.mecanicaEscolhida();

		try {
			System.out.println(utilizado.getJargao()); 
			while(utilizado.getVidas() >0 && utilizado.getNumeroPalavras() >0) {
				String palavraCorreta = bp.palavraSorteada();
				System.out.println("A palava é: \n \t"+ utilizado.embaralhar(palavraCorreta));
				resp = new Scanner(System.in);
				System.out.println("Digite a palavra correta:");
				String respostaUsuario = resp.nextLine();
				
				if(utilizado.jogar(respostaUsuario, palavraCorreta)) {
					System.out.println("Parabens! Faltam apenas: "+ utilizado.getNumeroPalavras() +" palavras!");
				}else {
					System.out.println("Tente na proxima! \nVoce tem: "+ utilizado.getVidas() + " vida(s)!");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Sua quantidade total de pontos foram: " + utilizado.getPontos());
		
		if(utilizado.getVenceu()) {
			System.out.println("Voce ganhou!");
		}else {
			System.out.println("Voce perdeu!");
		}
		
		System.out.println("\t \t Obrigado por jogar! \t \t");
		ler.close();
		resp.close();
	}

}
