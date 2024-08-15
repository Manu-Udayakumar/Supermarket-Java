package supermarket.products;

public class DairyProducts extends groceryproducts{
private fat fat;
public DairyProducts(String name,double price,double discount,fat fat) {
	super(name,price,discount);
	this.fat=fat;
}
public String display() {
	return(super.display()+"fat :"+fat);
}
public fat getFat() {
	return fat;
}
public void setFat(fat fat) {
	this.fat = fat;
}
}
