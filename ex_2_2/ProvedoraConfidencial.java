package ex_2_2;

public class ProvedoraConfidencial implements Provedora{

	@Override
	public String proverInfo() {
		return lerArquivo("confidencial.txt");
	}

}
