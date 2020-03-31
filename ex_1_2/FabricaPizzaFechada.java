package ex_1_2;

public class FabricaPizzaFechada implements FabricaPizza {

	@Override
	public Pizza getInstance(String tipo) {
		switch(tipo) {
		case "PIZZA":
			return new PizzaFecha();

		case "CALZONE":
			return new PizzaFecha();
		}
		return null;
	}


}