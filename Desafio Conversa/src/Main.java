
public class Main {

	public static void main(String[] args) {
		Pessoa1 p1 = new Pessoa1("Silvio Santos");
		Pessoa2 p2 = new Pessoa2("Ana Maria");
		
		p1.Saudacao();
		p2.Saudacao();
		p1.Apresentacao();
		p2.Apresentacao();
		p1.Sentimento();
		p2.Sentimento();
		
		System.out.println(p2);
		System.out.println(p1);

	}

}
