import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	static double valorTotal;
	private Map<Produto, Integer> produtos = new HashMap<>();
	
	CarrinhoDeCompras(){
		
	}

	public void adicionaProduto(Produto newProd, int quantidade) {
		if(produtos.containsKey(newProd)) {
			int newQuantidade = produtos.get(newProd) + quantidade;
			produtos.put(newProd,newQuantidade);
		}else {
			produtos.put(newProd,quantidade);
		}
	}

	public void removeProduto(Produto Prod, int quantidade) {
		if(produtos.containsKey(Prod)) {
			int newQuantidade = produtos.get(Prod) - quantidade;
			
			if(newQuantidade <= 0) {
				produtos.remove(Prod);
			}else {
				produtos.put(Prod,newQuantidade);
			}
		}else {
			System.out.println("Produto inexistente");
		}

	}
	
	private void calculaValorProduto(Produto p, int quantidade) {
	    valorTotal += p.getPreco() *quantidade;
	}

	public double calculaValorTotalDaCompra() {
		
		for(Produto prod : produtos.keySet()) {
			calculaValorProduto(prod,produtos.get(prod));
		}
		System.out.println("Os produtos comprados foram: ");
		
		for(Produto prod : produtos.keySet()) {
			System.out.println( produtos.get(prod) + " " + prod.getNome() + " de preco: " +prod.getPreco());
		}
		
		System.out.println("\nTotalizando um valor total de: " + valorTotal);
		return valorTotal;
	}
}
