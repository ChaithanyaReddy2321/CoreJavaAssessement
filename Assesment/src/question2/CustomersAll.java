/**
 * 
 */
package question2;

import java.util.HashMap;

/**
 * @author chaithanya.reddy
 * Aug 16, 2019
 */
public class CustomersAll {
	
	private HashMap<String, String> map = new HashMap<String, String>();
	
	public void addCustomerDetails(Customer cust) {
		if(map.get(cust.getUsername()) == null) {
			map.put(cust.getUsername(), cust.getPassword());
		}
	}
	
	public boolean authentify(Customer cust) {
		String password = map.get(cust.getUsername());
		if(password.equals(cust.getPassword()))
			return true;
		return false;
	}

}
