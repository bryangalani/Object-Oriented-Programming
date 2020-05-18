
public class Embaralhador02 implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		String palavraEmbaralhada = null;
		
		int size = palavra.length();
		//System.out.println(size);
		StringBuilder sb1 = new StringBuilder(); //impares
		StringBuilder sb2 = new StringBuilder(); //pares
		StringBuilder sbFinal = new StringBuilder();

		if(size % 2 == 1) {//impar
			for(int i = 0; i<size ;i++) {
				char letra = palavra.charAt(i);
				if(i % 2 == 1) {
					sb1.append(letra);
				}else {
					sb2.append(letra);
				}
			}
			int sizeMetade = sb1.length();
			for(int i = 0; i <sizeMetade ; i++) {
				sbFinal.append(sb1.charAt(i));
				sbFinal.append(sb2.charAt(i));
			}
			sbFinal.append(sb2.charAt(sb2.length()-1));
			palavraEmbaralhada = sbFinal.toString();
		}else { //par
			for(int i = 0; i<size ;i++) {
				char letra = palavra.charAt(i);
				if(i % 2 == 1) {
					sb1.append(letra);
				}else {
					sb2.append(letra);
				}
			}
			int sizeMetade = sb1.length();
			for(int i = 0; i <sizeMetade ; i++) {
				sbFinal.append(sb1.charAt(i));
				sbFinal.append(sb2.charAt(i));
			}
			palavraEmbaralhada = sbFinal.toString();
		}
		
		return palavraEmbaralhada;
	}

}
