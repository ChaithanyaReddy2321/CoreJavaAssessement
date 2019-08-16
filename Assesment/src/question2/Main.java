
package question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author chaithanya.reddy
 * Aug 16, 2019
 */
public class Main {

	 static Scanner in;
	 CustomersAll custDetails = new CustomersAll();
	 ProductsAll prodDetails = new ProductsAll();
	 Order order = new Order();
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int d;
		Main main = new Main();
		HashMap<String, String> map = new HashMap<String, String>();
		do{
			System.out.println(" 1: REGISTER \n 2: ORDER \n");
			int i = in.nextInt();
			switch(i) {
				case 1 : {
					main.registerUser();
					break;
				}
				case 2: main.orderItemsMethod();
			}
			System.out.println("Enter 0 to stop");
			d = in.nextInt();
		}while(d != 0);
	}
	
	public void registerUser() {
		Customer cust = new Customer();
		System.out.println("Enter username");
		cust.setUsername(in.next());
		
		System.out.println("Enter password");
		cust.setPassword(in.next());
		
		custDetails.addCustomerDetails(cust);
	}
	
	public boolean authentifyUser() {
		Customer cust = new Customer();
		System.out.println("Enter username to authentify");
		cust.setUsername(in.next());
		
		System.out.println("Enter password to authentify");
		cust.setPassword(in.next());
		
		return custDetails.authentify(cust);
	}
	
	public void printOrderList() {
		
		Product p1 = new Product();
		p1.setNameOfProd("Benelli");
		p1.setCost(623455);
		
		Product p2 = new Product();
		p2.setNameOfProd("Fat Boy");
		p2.setCost(12345467);
		
		prodDetails.prodList.add(p1);
		prodDetails.prodList.add(p2);
		for(int i = 0; i < prodDetails.prodList.size(); i++) {
			System.out.println("Name of the Product: "+prodDetails.prodList.get(i).getNameOfProd());
			System.out.println("Cost: "+prodDetails.prodList.get(i).getCost());
			System.out.println();
		}
		
	}
	
	public void orderItems() {
		
		int i ;
		do {
			System.out.println("Enter which item to be ordered");
			int index = in.nextInt();
			order.addProductToOrder(prodDetails.prodList.get(index));
			
			System.out.println("Enter 1 to add more products to cart");
			i = in.nextInt();
		}while(i != 0);
		
	}
	
	public void orderItemsMethod() {
		if(authentifyUser()) {
			printOrderList();
			
			orderItems();
			System.out.println("Cart total for the order: "+order.getCartTotal());
		}
		else {
			System.out.println("You have Entered wrong details");
		}
	}
}
