package demo.billgeneration;

public class SnackDetail {
private int pizza,puffs,coolDrink;

public void setPizza(int pizza) {
	this.pizza = pizza;
}

public void setPuffs(int puffs) {
	this.puffs = puffs;
}
public void setCoolDrink(int coolDrink) {
	this.coolDrink = coolDrink;
}

public int getPizza() {
	return pizza;
}

public int getPuffs() {
	return puffs;
}

public int getCoolDrink() {
	return coolDrink;
}

public static void main(String[] args) {
	SnackDetail snackDetail=new SnackDetail();
	System.out.print("Enter pizza buyed ");snackDetail.setPizza(10);
	System.out.println("Enter puffs buyed");snackDetail.setPuffs(20);
	System.out.println("total bill "+(snackDetail.getPizza()*100+snackDetail.getPuffs()*20));
	
	
}

}
