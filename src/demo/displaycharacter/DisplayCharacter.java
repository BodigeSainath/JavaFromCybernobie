package demo.displaycharacter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class DisplayCharacter {
public static void main(String[] args) {
	int a=65;
char i=(char)a;
	//String i=String.valueOf(a);
System.out.println(i);
	StringBuffer sb=new StringBuffer();
	sb.append("Asfdda");
	sb.insert(2, "false");
	System.out.println(sb);
	System.out.println(sb.capacity());
List<String> list=new ArrayList<>();
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.next() != null){  
System.out.println(itr.next());  
}  


PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit Sharma");  
queue.add("Vijay Raj");  
queue.add("JaiShankar");  
queue.add("Raj");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator<String> itr1=queue.iterator();  
while(itr1.hasNext()){  
System.out.println(itr1.next());  
}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  

}
