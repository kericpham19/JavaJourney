public class Pizzqa {
  		public static void main(String[] args) {
  			double pizzaPrice = 5.00;
			int numToppings = 3;
			String name = "John";

  			double price = calculatePrice(pizzaPrice, numToppings);
			System.out.print("Order is: small pizza with ");
			System.out.println(numToppings + " toppings");
			System.out.println(name + " owes $" + price);
  		}
			
		public static double calculatePrice(double base, int n) {
			double toppingsCost = 0.5;
			double cost = base + n * toppingsCost; 	
			return cost;
		}
	}
