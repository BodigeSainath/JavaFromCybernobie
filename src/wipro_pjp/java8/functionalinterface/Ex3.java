package wipro_pjp.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Ex3 {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>(Arrays.asList("sai","nath","bo","sos"));
//GFG		Predicate take 1 argumt and returns nly boolean as result
//		isEqual(Object targetRef) : Returns a predicate that tests if two arguments are equal according to Objects.equals(Object, Object).
//		and(Predicate other) : Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.
//		negate() : Returns a predicate that represents the logical negation of this predicate.
//		or(Predicate other) : Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another.
//		test(T t) : Evaluates this predicate on the given argument.boolean test(T t)
		Predicate<ArrayList<String>> list=t -> {
			for(String str : t) {
				if(t.contains("bod")) {
					return true;
				}
			}
			return false;
		};
	//  arrayList.stream().filter(null)
		System.out.println(list.test(arrayList));
		
	}

}

//public class Assignment03 {
//
//	static boolean isPalindromeString(String input1) {
//		input1 = input1.toLowerCase();
//		int digitCount = input1.length();
//		boolean isPalindrome = true;
//		
//		int range = digitCount / 2;
//		if (digitCount % 2 == 0)
//			range--;
//		
//		for (int i = 0; i <= range; i++) {
//			if (input1.charAt(i) != input1.charAt(digitCount - i - 1))
//				isPalindrome = false;
//			}
//		return isPalindrome;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<String> words = new ArrayList<>(
//                Arrays.asList("Malayalam", "valid", "Dial", "Tears", "Hard", "Racecar", "Level", "Crazy", "Madam", "Sir"));
//		Predicate<String> isPal = str -> isPalindromeString(str);
//		words.stream().filter(isPal).forEach(System.out :: println);
//	}
//
//}
