import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RestaurantMenuApp {

	public static void main(String[] args) {
		Map<String, Double> menuItems = new HashMap<>();
		menuItems.put("Spaghetti", 8.97);
		menuItems.put("Lasagna", 10.98);
		menuItems.put("Pizza", 15.50);
		menuItems.put("Caesar Salad", 7.00);
		menuItems.put("Kale Salad", 7.00);

		System.out.println("The menu price for spaghetti is " + menuItems.get("Spaghetti"));
		System.out.println("The number of menu items is " + menuItems.size());

		menuItems.put("Bottle of Champagne", 200.00);
		System.out.println("The menu price for a bottle of champagne  is " + menuItems.get("Bottle of Champagne"));
		menuItems.put("Bottle of Vintage Wine", 175.00);
		System.out.println("The menu price for a bottle of vintage wine is " + menuItems.get("Bottle of Vintage Wine"));

		if (menuItems.containsKey("Bottle of Champagne")) {
			System.out.println("We have champagne for your fancy party");
		}
		
		if (menuItems.containsValue(13.50)) {
			System.out.println("$13.50 is a price on the menu");
		} else {
			System.out.println("$13.50 is not a price on the menu");
		}
		
		menuItems.remove("Kale Salad");
		if (!menuItems.containsKey("Kale Salad")) {
			System.out.println("Kale sald is no longer on the menu because listeria");
		}
		
		menuItems.clear();
		
		if(menuItems.isEmpty()) {
			System.out.println("There are no items on this menu!");
		}
	}

}
