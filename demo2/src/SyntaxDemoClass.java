
public class SyntaxDemoClass {

	public static void main(String[] args) {
		printMethod();
	}
	
	/**
	 * This method helps me to print different statements
	 */
	public static void printMethod() {
		System.out.println(6 + 10 / 2);
		
		{
			/* a is a variable for one operand operation */
			int a = 0;
			//expected result 0 because it is a++ operator
			System.out.println(a++);
			//expected result 2 because the previous row will increase 0 with 1
			System.out.println(++a);
		}
		
		System.out.println("2 > 5 : " + (2 > 5));
		System.out.println("2 < 5 : " + (2 < 5));
		
		System.out.println("2 < 5 : " + ((2 < 5) ? "yes" : "no"));
		System.out.println("2 > 5 : " + ((2 > 5) ? "yes" : "no"));

		System.out.println(5 >> 2);
		System.out.println(5 << 2);
		
		System.out.println(56 / 10);
	}

}
