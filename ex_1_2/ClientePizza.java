package ex_1_2;

import java.util.Calendar;

public final class ClientePizza {
	private ClientePizza() {
	}
	
	public static FabricaPizza getFabrica( int dia, int mes, int ano) {
		 Calendar c = Calendar.getInstance();
	        c.set(Calendar.YEAR, ano); 
	        c.set(Calendar.MONTH, mes-1); 
	        c.set(Calendar.DAY_OF_MONTH, dia);
	        return getFabrica(c.get(Calendar.DAY_OF_WEEK));
		
	}
	
	private static FabricaPizza getFabrica(int dia) {
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			return new FabricaPizzaFechada();
		case 2:
			System.out.println("Segunda");
			return new PizzaioloPizzaCalabresa();
		case 3:
			System.out.println("Terça");
			return new PizzaioloPizzaPresunto();
		case 4:
			System.out.println("Quarta");
			return new PizzaioloPizzaCalabresa();
		case 5:
			System.out.println("Quinta");
			return new PizzaioloPizzaPresunto();
		case 6:
			System.out.println("Sexta");
			return new PizzaioloPizzaCalabresa();
		case 7:
			System.out.println("Sabado");
			return new PizzaioloPizzaPresunto();	
		}
		return null;
	}
	

}
