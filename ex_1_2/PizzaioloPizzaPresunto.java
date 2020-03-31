package ex_1_2;

public class PizzaioloPizzaPresunto implements FabricaPizza{
	
	@Override
	public Pizza getInstance(String tipo) {
		switch(tipo) {
		case "PIZZA":
			System.out.println("Pizza Tradicional:");
			return new PizzaPresunto();
		case "CALZONE":
			System.out.println("CALZONE");
			return new PizzaPresunto();	
		}
		return null;
	}


}
