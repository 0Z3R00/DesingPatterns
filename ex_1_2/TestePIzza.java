package ex_1_2;


 
public class TestePIzza{
	
	public static void main(String[] args) {
		FabricaPizza pizza = ClientePizza.getFabrica(19, 4, 2020);
		Pizza msg = pizza.getInstance("CALZONE");
		//Pizza msg = pizza.getInstance("PIZZA");
		msg.mostraPizza();
	}
}