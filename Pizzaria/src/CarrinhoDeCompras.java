import java.util.ArrayList;


public class CarrinhoDeCompras {

	private int valor = 0;
	ArrayList<Pizza> lista_pedido = new ArrayList<>();
	
	public CarrinhoDeCompras(){
		
	}
	
	public String adicionar(Pizza pizza) {

		if(pizza.ingredientes.size() >0) {
			valor += pizza.getPreco();
			lista_pedido.add(pizza);
			return "Adicionado com Sucesso!!";
		}else {
			return "Falha! Pizza sem ingredientes";
		}
	}
	
	public void getValorTotal() {
		System.out.println("O valor total do carrinho é: " + valor);
	}
	
}
