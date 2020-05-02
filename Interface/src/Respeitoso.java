
public class Respeitoso  implements FormatadorNome{
	private String genero;
	
	
	public Respeitoso(String genero) {
		super();
		this.genero = genero;
	}


	@Override
	public String formatarNome(String nome, String sobrenome) {

		if(genero == "F" || genero == "Feminino") {
			return "Sra. " + sobrenome;
		}else if(genero == "M" || genero == "Masculino"){
			return "Sr. "+ sobrenome;
		}else {
			return null;
		}
		
	}

}
