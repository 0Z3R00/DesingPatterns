package ex_1_2;

public class PizzaioloPizzaCalabresa implements FabricaPizza {
	
	@Override
	public Pizza getInstance(String tipo) {
		switch(tipo) {
		case "PIZZA":
			System.out.println("Pizza Tradicional:");
			return new PizzaCalabresa();
		case "CALZONE":
			System.out.println("CALZONE");
			return new PizzaCalabresa();
		}
		return null;
	}
	

}
