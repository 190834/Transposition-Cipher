/*import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.List;

public class StringtoArray {
	public StringtoArray() {}
	public String encrypt(String message) {

		PrintWriter p = new PrintWriter(System.out, true);
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the key you would like to use: ");
		String key = in.nextLine();
		System.out.println("Please enter the message you would like to encrpy: ");
		String message = in.nextLine();
		
		

		int x = 0;
		int y = 0;

		for (int i = 0; (i * i) < message.length(); i++) {
			y = i;
			x = i + 1;
		}

		List<List<Character>> betterthanarrays = new ArrayList<>();

		for (int i = 0; i < x; i++) {
			betterthanarrays.add(new ArrayList<Character>());
		}

		int o = 0;
		for (int i = 0; i < y; i++) {
			for (int z = 0; z < x; z++, o++) {
				if (o < message.length()) {
					betterthanarrays.get(z).add(message.charAt(o));
				} else {
					betterthanarrays.get(z).add('x');

				}
			}

		}
		for (int i = 0; i <= y; i++) {
			p.println(betterthanarrays.get(i));
		}
	}

}
*/