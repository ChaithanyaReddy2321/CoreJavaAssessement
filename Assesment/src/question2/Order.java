/**
 * 
 */
package question2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chaithanya.reddy
 * Aug 16, 2019
 */
public class Order {

	
	private List<Product> orderList = new ArrayList<Product>();
	private double orderTotal;
	
	public List<Product> getOrderList() {
		return orderList;
	}

	public double getCartTotal() {
		orderTotal = 0;
		for(int i = 0; i < orderList.size(); i++) {
			orderTotal = orderList.get(i).getCost();
		}
		return orderTotal;
	}
	public void addProductToOrder(Product prod) {
		orderList.add(prod);
	}
}
