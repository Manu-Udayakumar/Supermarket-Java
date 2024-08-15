package supermarket.products;

public class Beverages extends groceryproducts {
private SugarLevels sugar;

public Beverages(String name,double price,double discount,SugarLevels sugar) {
	super(name,price,discount);
	this.sugar=sugar;
}
public String display() {
	return(super.display()+"sugar :"+sugar);
	
}
public SugarLevels getSugar() {
	return sugar;
}
public void setSugar(SugarLevels sugar) {
	this.sugar = sugar;
}
}
