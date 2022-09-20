package demo.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoList {
	public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.addFirst("Sn");
		 al.offer("sas");
		  System.out.println(al.indexOf("Ajaydss"));
		  if(al.contains("Sn"))
			  System.out.println("true");
		  System.out.println(al.set(2, "nas"));
		  System.out.println(al);
		al.poll();
		 }  
}
