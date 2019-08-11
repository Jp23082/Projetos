
public class Pessoa1 extends Pessoa {
	public Pessoa1(String Nome) {
		super(Nome);
	}

	@Override
	protected void Apresentacao() {
		System.out.println(GetNome().substring(0, 1).toUpperCase()+": Meu nome " + GetNome() + ". E o seu?");
		
	}

	@Override
	protected void Sentimento() {
		System.out.println(GetNome().substring(0, 1).toUpperCase()+": Eu estou bem. E você?");
		
	}

	@Override
	protected void Saudacao() {
		System.out.println(GetNome().substring(0, 1).toUpperCase()+": Olá");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return GetNome().substring(0,1).toUpperCase()+": Até!";
	}
}
