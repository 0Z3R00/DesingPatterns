package ex_2_3;

public class logConsole implements MostraLog {
	
	public logConsole(String msg) {
		Mostra(msg);
	}

	@Override
	public void Mostra(String msg) {
		System.out.println(msg);
	}

}
