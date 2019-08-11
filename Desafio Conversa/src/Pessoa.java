
public abstract class Pessoa {
	private String nome;
	
	public Pessoa(String Nome) {
		this.nome = Nome;
	}
	
	public String GetNome(){
		return this.nome;
	}
	
	protected abstract void Apresentacao();
	
	protected abstract void Sentimento();
	
	protected abstract void Saudacao();
	
	
}
