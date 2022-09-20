package demo.fuelconsumption;

public class FuelConsumptionCalcualtor {
public static void main(String[] args) {
	int litres;
	int distance;
	float req;
	System.out.println("Enter no of lit");
	litres=20;
	System.out.println("Enter distance covered");
	distance=150;
	req=(litres/distance)*100;
	float  miles;
	float miledistance,km;
	miledistance=(float) (distance*0.6214);
	km=(float) (litres*0.2642);
	miles=miledistance/km;
	System.out.println(" Liters/100KM "+req+" Miles/gallons "+miles);
	
}
}
