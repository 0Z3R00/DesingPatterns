package ex_2_3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LogArquivo implements MostraLog{
	public LogArquivo(String msg) {
		Mostra(msg);
	}
	
	@Override
	public void  Mostra(String msg) {
		try {
			PrintWriter writer = new PrintWriter("log.txt");
			writer.write(msg);
			writer.close();
			System.out.println("Arquivo log.txt foi criado");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
