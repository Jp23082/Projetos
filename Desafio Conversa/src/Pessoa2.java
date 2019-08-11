
public class Pessoa2 extends Pessoa {
	public Pessoa2(String Nome) {
		super(Nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void Apresentacao() {
		System.out.println(GetNome().substring(0, 1).toUpperCase()+ ": Meu nome é " + GetNome() + ". Como vai você?");
		
	}

	@Override
	protected void Sentimento() {
		System.out.println(GetNome().substring(0, 1).toUpperCase()+": Estou bem também.");
		
	}

	@Override
	protected void Saudacao() {
		System.out.println(GetNome().substring(0, 1).toUpperCase()+": Eae");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return GetNome().substring(0, 1).toUpperCase()+": Até Mais!";
	}
}
