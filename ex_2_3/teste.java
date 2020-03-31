package ex_2_3;


public class teste {
	
	public static void main(String[] args) {
	    String  tipo ="";
		int numero = (int)(100000*Math.random());
		numero = numero%2;
		if (numero == 0) {
			tipo = "Console";
		} else {
			tipo = "Arquivo";
		}
		
		FabricaDeLog FL = new FabricaDeLog(tipo);
	}
}
