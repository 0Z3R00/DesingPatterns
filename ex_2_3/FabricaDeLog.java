package ex_2_3;


public class FabricaDeLog {

	public FabricaDeLog(String tipo) {
		MostraLog ml;
		int num = 0;
		String msg = "";
		for(int i = 0; i <= 10; i++) {
			msg = msg + num+"\n";
			num++;
		}
		if(tipo.equals("Console")) {
			ml = new logConsole(msg);

		}else if(tipo.equals("Arquivo")){
			ml = new LogArquivo(msg);

		}
	}
}
