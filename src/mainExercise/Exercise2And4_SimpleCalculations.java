/**
 * 
 */
package mainExercise;

/**
 * @author AllstateUser(jana)
 *
 */
public class Exercise2And4_SimpleCalculations {
	// Task 2:
	private static int InputValue = 5;
	private static String plus = "+";
	private static String subtract = "-";
	private static  String divide = "/";
	private static String multiply = "*";
	private static Boolean firstTime=false;
	private static String[] calcsymble = {"*", "/", "+","-","*"};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Task 2 
		// computes the results of 5 simple calculations 
		for (int math_operator = 0; math_operator < calcsymble.length; math_operator++  ){
			calculations(InputValue,calcsymble[math_operator].toString());
		}
		System.out.println("----------------------------------------------- ");
		// Task 4
		//Modify the application in exercise 2 to concurrently perform the calculations required for each t value 
		//in exercise 3.
		for (float t = 0;  t <= 1.0f; t += 0.05f)
		{
			for (int math_operator = 0; math_operator < calcsymble.length; math_operator++  ){
				// pass input as for each t value 
				InputValue=Math.round(t);
				calculations(InputValue,calcsymble[math_operator].toString());
			}

		}

	}
	//Write an application in Java that concurrently computes the results of 5 simple calculations and displays each result. The calculations required are:
	//Result1 = InputValue * 5 Result2 = InputValue / 5 Result3 = InputValue + 5 Result4 = InputValue - 5 Result5 = InputValue * 2 The input value is 5.
	private static 	void calculations(int InputValue, String operator) {	

		if (operator.equals(multiply)) {		
			if(!firstTime){
				int Result1 = InputValue * 5 ;
				System.out.println("Result1: "+ Result1);	
				firstTime=true;

			}else{
				int Result5 = InputValue * 2 ;
				System.out.println("Result5: "+ Result5);
			}
		}

		if (operator.toString().equals(divide)) {

			int Result2 = InputValue/5 ;
			System.out.println("Result2: "+ Result2);


		}
		if (operator.toString().equals(plus)) {

			int Result3 = InputValue +5 ;
			System.out.println("Result3: "+Result3);

		}
		if (operator.equals(subtract)) {

			int Result4 = InputValue-5 ;
			System.out.println("Result4: "+Result4);

		}

	}
}
