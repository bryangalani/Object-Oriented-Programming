import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BancoDePalavras {

	private ArrayList<String> bancoPalavras = new ArrayList<String>();

	public void lerArq(String arquivo) {
		try {
			FileReader arq = new FileReader(arquivo);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine(); // l� a primeira linha. A vari�vel "linha" recebe o valor "null" quando o processo  de repeti��o atingir o final do arquivo texto
			while (linha != null) {
				bancoPalavras.add(linha);
				linha = lerArq.readLine(); // l� da segunda at� a �ltima linha
			}
			//System.out.printf("%s\n", bancoPalavras);
			arq.close();
		} catch (IOException e) {
			System.err.println("Erro na abertura do arquivo: " + e.getMessage() + "\n");
		}
	}

	public String palavraSorteada() throws Exception {

		int size = bancoPalavras.size(); //0 .... max-1
		//System.out.println(size);
		if(size ==0){
			throw new Exception("Nenhuma palavra restante no arquivo.");
		}
		Random rand = new Random();
		int randomNum = rand.nextInt((size -1 - 0) + 1) + 0;

		String palavraEscolhida = bancoPalavras.get(randomNum);
		bancoPalavras.remove(randomNum);
		//System.out.println(palavraEscolhida);	

		return palavraEscolhida;
	}


}
