
public class Principal {

	public static void main(String[] args) {
		FormatadorNome informal = new Informal();
		
		FormatadorNome respeitoso = new Respeitoso("M");
		FormatadorNome respeitosa = new Respeitoso("F");

		FormatadorNome ComTitulo = new ComTitulo("Magnifico");

		
		Autoridade autoridade = new Autoridade("Joao","Marcos", respeitoso);
		Autoridade autoridade2 = new Autoridade("Galileu","Galilei", ComTitulo);
		Autoridade autoridade3 = new Autoridade("Maria","Helena", respeitosa);
		Autoridade autoridade4 = new Autoridade("Jorgin","Tagarela", informal);

		System.out.println(autoridade.getTratamento());
		System.out.println(autoridade2.getTratamento());
		System.out.println(autoridade3.getTratamento());
		System.out.println(autoridade4.getTratamento());


	}

}
