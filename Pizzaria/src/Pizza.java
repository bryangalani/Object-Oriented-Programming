import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {

	public Pizza() {
		
	}
	
	static Map<String,Integer> ingredienteTotal = new HashMap<String,Integer>();
	ArrayList<String> ingredientes = new ArrayList();
	
	void adicionaIngrediente(String ingrediente){
		ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}
	
	public int getPreco() {
		int numIngrediente;
		numIngrediente = ingredientes.size();
		if(numIngrediente < 3) {
			return 15;
		}else if(numIngrediente >=3 && numIngrediente <=5) {
			return 20;
		}else {
			return 23;
		}
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
		if(ingredienteTotal.containsKey(ingrediente)){
			int number = ingredienteTotal.get(ingrediente);
			ingredienteTotal.put(ingrediente, number+1);
		}else {
			ingredienteTotal.put(ingrediente, 1);
		}
	}
}
