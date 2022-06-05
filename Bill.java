package shopping;
import java.util.*;

public class Bill {
	public static void main(String[] args) {
		String pname = null;
		int quantity = 0, price= 0, totalprice = 0, finaltotalprice = 0;
		char choice = ' ';
		Scanner sc = new Scanner(System.in);
		List<Product> product = new ArrayList<Product>();
		do {
		System.out.println("Enter Product name:");
		pname = sc.nextLine();
		System.out.println("Enter the product price:");
		price = sc.nextInt();
		System.out.println("Enter the quantity of the product");
		quantity = sc.nextInt();
		
		totalprice = quantity * price;
		finaltotalprice = finaltotalprice + totalprice;
		
		product.add(new Product(pname, quantity, price, totalprice));
		System.out.println("Still want to add items?(y: yes, n: no)");
		choice = sc.next().charAt(0);
	    sc.nextLine();
	    
		}
		while(choice == 'y'|| choice == 'Y');
		Product.displayFormat();
		for(Product p: product) {
			p.display();
		}
		System.out.println("Total price: "+finaltotalprice);
	}

}