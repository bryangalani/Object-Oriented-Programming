public interface MecanicaDoJogo {
		
	public abstract String embaralhar(String arquivoPalavras);
	public abstract boolean jogar(String respostaUsuario, String palavraCorreta);
	
	public abstract int getPontos();
	public abstract boolean getVenceu();
	public abstract String getJargao();
	public abstract int getVidas();
	public abstract int getNumeroPalavras();
	
}
