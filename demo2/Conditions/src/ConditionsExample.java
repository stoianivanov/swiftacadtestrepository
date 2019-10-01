
public class ConditionsExample {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println((a > b) && (b < c)? "b is in the middle" : "I do not know any condition");
		System.out.println((a > b) || (b < c)? "b is anywhere" : "I do not know any condition");

		byte personAge = 68;
		String personSex = "male";
		
		personAge = 54;
		
		System.out.println((personAge >= 18) && (personAge <= 65) && personSex.equals("male") ? "working age" : "retired");
		
	}

}