
public class ProdutoComTamanho extends Produto{
	private String tamanho;

	//constructor
	public ProdutoComTamanho(String nome, String codigo, double preco, String tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	//test code and size
	public boolean equals(Object obj) {
		if(obj instanceof ProdutoComTamanho) {
			ProdutoComTamanho aleatorio = (ProdutoComTamanho) obj;
			if(this.getCodigo().equals(aleatorio.getCodigo()) && this.tamanho.equals(aleatorio.getTamanho())) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		return getCodigo().length() * 8;
	}



}
