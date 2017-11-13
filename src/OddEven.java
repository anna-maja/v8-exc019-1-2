/*skapa ett program som mha remainder avgör om ett tal rä udda eller jämnt.*/
import java.util.Random; 
public class OddEven {
	public static void main(String[]args) {
		
		Random random = new Random();
		int tal = random.nextInt(10);
		System.out.println(tal);
		System.out.println("\nKoden är slut.");
		
		if (tal%2==0) {			//"Om resten efter division med 2 är 0"
			System.out.println("Talet är jämnt.");
		}
		else {
			System.out.println("Talet är udda.");
		}
	}

}
