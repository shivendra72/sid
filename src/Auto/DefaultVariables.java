package Auto;

public class DefaultVariables {

	public static void main(String[] args) {
		/*
		 * Byte
		 * Min: -128
		 * Max: 127
		 * Default: 0
		 */
		byte byteVariable = 0;
		System.out.println("Byte Value: " + byteVariable);
		/*
		 * Short
		 * Min: -32,768
		 * Max: 32,767
		 * Default: 0
		 */
		Short ShortVariable = 0;
		System.out.println("Short Value: " + ShortVariable);
		
		/*
		 * int
		 * Min: -2,147,483,648
		 * Max: 2,147,483,647
		 * Default: 0
		 */
		int intVariable = 0;
		System.out.println("int Value " + intVariable);
		
		/*
		 * long
		 * Min: -2^63
		 * Max: 2^63 - 1
		 * Default: 0
		 */
		long longVariable = 0l;
		System.out.println("long Value " + longVariable);

		
		/*
		 * float
		 * Default: 0.0f
		 */
		float floatVariable = 0.0f;
		System.out.println("float Value " + floatVariable);
		
		
		/*
		 * double
		 * Default: 0.0d
		 */
		double doubleVariable = 0.0d;
		System.out.println("double Value " + doubleVariable);
		
		/*
		 * boolean
		 * false and true
		 * Default: false
		 */
		boolean booleanVariable = false;
		System.out.println("b-Value: " + booleanVariable);
		
		/*
		 * char
		 * Min: 0
		 * Max: 65,535
		 */
		String ch = "N";
		System.out.println("char value: " + ch);
		
	}
}


