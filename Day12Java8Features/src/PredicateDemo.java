import java.util.function.Predicate;

public class PredicateDemo {

	static Boolean checkAge(int age) {
		if(age > 18)
			return true;
		else return false;
	}
	public static void main(String[] args) {
		Predicate<Integer> predicate = PredicateDemo::checkAge;
		
		boolean result = predicate.test(25);
		System.out.println(result);
		
		Predicate<Integer> greaterThanTen = (i) -> i>10;
		Predicate<Integer> lowerThanTwenty = (i) -> i<20;
		
		result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);
		
		boolean result2 = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result2);
		
		Predicate<String> hasLength = (String t) -> t.length() > 10;
		Predicate<String> containsLetterA = p -> p.contains("A");
		String word = "And";
		result = hasLength.or(containsLetterA).test(word);
		System.out.println(result);
		
		Predicate<String> sPredicate = password -> {
			return password.length()>=4 && password.length()<=8;};
		System.out.println(sPredicate.test("Xoriant123"));
	}
}
