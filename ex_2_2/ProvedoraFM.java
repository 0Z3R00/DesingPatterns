package ex_2_2;

public class ProvedoraFM {
	
	public ProvedoraFM(String senha) {
		Provedora p;
		
		if(senha.equals("desi gnpatt er ns")) {
			p = new ProvedoraConfidencial();
		}else {
			p = new ProvedoraPublica();
		}
		System.out.println(p.proverInfo());
	}

}
