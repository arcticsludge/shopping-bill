package shopping;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Product {
	private String pname;
	private int quantity;
	private double price;
	private double totalcost;
	
	Product(String pname, int quantity, int price, int totalcost) {
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
		this.totalcost = totalcost;
	}

	public String getPname() {
		return pname;	
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getTotalCost() {
		return totalcost;
	}
	
	public static void displayFormat() {
		System.out.println("Name\t\tQuantity\t\tPrice\t\tTotal Cost");
	}
	
	public void display() {
		System.out.format("%-9s %8d %10.2f %10.2f\n", 
		         pname, quantity, price, totalcost);
	}

	

	

}
