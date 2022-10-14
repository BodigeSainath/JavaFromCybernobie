////package wipro_pjp.oops_inheritance.polymorphism.solution1;
////
////public class Orange extends Fruit {
////	
////	@Override
////	public void eat() {
////	System.out.println(" Name is "+name +" taste like "+taste+" size is "+size);	
////	}
////
////}
//class Fruit {
//	String name, taste, size;
//	
//	void eat() {
//		System.out.println("Eating Fruits...");
//	}
//}
//
//class Apple extends Fruit {
//	
//	Apple() {
//		name = "Apple";
//		taste = "sweet and caramelized";
//	}
//	
//	@Override
//	void eat() {
//		System.out.println(name + " is "+ taste + " in taste.");
//	}
//}
//
//class Orange extends Fruit {
//	
//	Orange() {
//		name = "Orange";
//		taste = "sweet-tert";
//	}
//	
//	@Override
//	void eat() {
//		System.out.println(name + " is "+ taste + " in taste.");
//	}	
//}
//
//public class Solution {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Fruit fruit = new Fruit();
//		Apple apple = new Apple();
//		Orange orange = new Orange();
//		fruit.eat();
//		apple.eat();
//		orange.eat();
//		
//	}
//
//}