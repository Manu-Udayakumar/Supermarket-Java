package supermarket.products;

import java.util.ArrayList;

public class groceryproducts {
private String name;
private double price;
private double discount;

public groceryproducts(String name,double price,double discount) {
	this.name=name;
	this.price=price;
	this.discount=discount;
}
public double getActualPrice() {
	return price - (price *discount/100);
}
public String display() {
	return(
			"name :" + name+ "\n"+
			"price :" +price + "\n"+
			"discount :"+ discount+ "\n");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}

public static void main(String [] args) {
	ArrayList<groceryproducts> cart=new ArrayList<groceryproducts>();
	groceryproducts toast=new groceryproducts("toast",2.5,10);
	cart.add(toast);
	
	Beverages coke=new Beverages("coke",1.5,0,SugarLevels.ZERO);
	cart.add(coke);
	
	DairyProducts milk=new DairyProducts("milk",4,0,fat.FULLCREAM);
	cart.add(milk);
	
	double total=0;
	for(int i=0;i<cart.size();i++) {
		total+=cart.get(i).getActualPrice();
	}
	System.out.println("the total cost" + total);
	
	
	
}
}
