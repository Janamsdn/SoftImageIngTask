/**
 * 
 */
package mainExercise;

/**
 * @author AllstateUser(jana)
 *
 */
public class Exercise1_ReverseString {
	// Task 1: 
	private static String reverseString="Software Emageing";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// task 1:
		// c++ code -Reverse String 
		// Please copy commented code into C++ IDE/ OR Project then run it should work  (its available bottom of this class )
		//or 
		//Java code -Reverse string
		System.out.println("Reverse string :"+reverseIt(reverseString));

	}
	// in Java reverse string
	public static String reverseIt(String source) {
		int i, len = source.length();
		StringBuffer dest = new StringBuffer(len);

		for (i = (len - 1); i >= 0; i--)
			dest.append(source.charAt(i));
		return dest.toString();
	}

	//Task 1
	//	// c++ program there are many ways to reverse string
	//__________________________________________________________
	// **** one of the way****
	//__________________________________________________________
	//	void Reverse()
	//	{   // Reverse the string contained in theWord.
	//		char theWord="Software Emageing";
	//		int i;
	//		char temp;
	//
	//		for (i=0; i<theWord.length()/2; i++)
	//		{
	//			temp = theWord[i];
	//			theWord[i] = theWord[theWord.length()-i-1];
	//			theWord[theWord.length()-i-1] = temp;
	//		}
	//	}
	//_______________________________________________________________
	//*** one more way  ****
	//-------------------------------------------------------------------

	////Best if a solution is pass by pointers-Recursive function to reverse an array
	//void reverse( char* first, char* last )
	//{
	//    if( first < last )
	//    {
	//        std::swap( *first, *last ) ;
	//        reverse( first+1, last-1 ) ;
	//    }
	//}
	//int main()
	//{
	//    char cstr[] = "Software Emageing!" ;
	//    //Note that the beauty of std::reverse is that it works with char * strings and std::wstrings just as well as std::strings
	//    reverse( cstr, cstr + sizeof(cstr) - 2 ) ;
	//}

}
