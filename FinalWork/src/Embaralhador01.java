
public class Embaralhador01 implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		String palavraEmbaralhada = null;
		
		int size = palavra.length();
		//System.out.println(size);
		StringBuilder sb = new StringBuilder();

		if(size % 2 == 1) { //impar
			for(int i = size-1; i>=(size-((size-1)/3)); i--) {
				char letra = palavra.charAt(i);
				sb.append(letra);	
			}
			for(int i = ((size-1)/2); i< (size-((size-1)/3)) ; i++) {
				char letra = palavra.charAt(i);
				sb.append(letra);
			}
			for(int i = ((size-1)/2)-1 ; i>= 0 ; i--) {
				char letra = palavra.charAt(i);
				sb.append(letra);
			}
	        palavraEmbaralhada = sb.toString();
		}else {//par
	        for(int i = size-1; i>= size/2; i--) {
	        	char letra = palavra.charAt(i);
				sb.append(letra);
			}
	        for(int i = 0; i<size/2 ; i++) {
	        	char letra = palavra.charAt(i);
	        	sb.append(letra);
	        }
	        palavraEmbaralhada = sb.toString();
		}
		
		return palavraEmbaralhada;
	}

}
