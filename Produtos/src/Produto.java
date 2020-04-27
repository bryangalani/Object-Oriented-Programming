
public class Produto {
	
	private String nome;
	private String codigo;
	private double preco;
	
	//constructor
	public Produto(String nome, String codigo, double preco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public double getPreco() {
		return preco;
	} 

	public boolean equals(Object obj) {
		if(obj instanceof Produto) {
			Produto aleatorio = (Produto) obj;
			return this.codigo.equals(aleatorio.getCodigo());			
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return getCodigo().length() * 8;
	}
}
