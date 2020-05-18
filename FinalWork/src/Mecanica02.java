
public class Mecanica02 implements MecanicaDoJogo {

	private int vidas = 1;
	private int numPalavras =5;
	private int pontos =0;
	private boolean erro = false;

	@Override
	public String embaralhar(String palavra) {
		String palavraEmbaralhada = null;
		FabricaEmbaralhadores fe = new FabricaEmbaralhadores();
		try {
			palavraEmbaralhada = fe.embaralhadorEscolhido().embaralhar(palavra);
		} catch (Exception e) {
			System.err.println("Error \n" + e.getMessage());
			erro = true;
		}
		return palavraEmbaralhada;
	}
	
	public boolean jogar(String respostaUsuario, String palavraCorreta) {
		
		if(respostaUsuario.equals(palavraCorreta)) {
			numPalavras--;
			pontos += 25;
			return true;
		}else {
			vidas = vidas-1;
			numPalavras--;
			return false;
		}
	}


	@Override
	public int getPontos() {
		return pontos;
	}

	@Override
	public boolean getVenceu() {
		if(vidas <= 0 && !erro) {
			return false;
		}else if(vidas >=0 && !erro) {
			return true;
		}
		return false;
	}

	@Override
	public String getJargao() {
		return "\tMorte subita, erre qualquer palavra e seja eliminado!\t";
	}


	@Override
	public int getVidas() {
		return vidas;
	}


	@Override
	public int getNumeroPalavras() {
		return numPalavras;
	}


}
