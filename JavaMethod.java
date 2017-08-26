import java.security.SecureRandom;
import java.util.Random;

public class JavaMethod {

	public static void main(String[] args) {
	final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
	    final int N = alphabet.length();
        SecureRandom s = new SecureRandom();
	    Random r = new Random();

          for (int i = 0; i < 50; i++) {
	        System.out.print(alphabet.charAt(s.nextInt(N))+" ");
	    }
		
		
	}

	
	
}
