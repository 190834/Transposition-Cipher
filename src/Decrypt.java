import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.List;
import java.util.Collections;
import java.util.*;

public class Decrypt {

	public Decrypt() {
	}

	public String Decrypt() {
		Decrypt Decryption = new Decrypt();
		PrintWriter p = new PrintWriter(System.out, true);
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the message you would like to decrypt: ");
		String text = in.nextLine();
		
		// Initialize variables for rows and columns
		int r = 0;
		int c = 0;

		// Create rows and columns for grid
		for (int i = 0; (i * i) < text.length(); i++) {
			r = i;
			c = i + 1;
		}

		// Array List
		List<List<Character>> textList = new ArrayList<>();

		for (int i = 0; i < c; i++) {
			textList.add(new ArrayList<Character>());
		}
		
		//Put text into a list
		int o = 0;
		for (int i = 0; i < r; i++) {
			for (int z = 0; z < c; z++, o++) {
				if (o < text.length()) {
					textList.get(z).add(text.charAt(o));
				} else {
					textList.get(z).add('x'); //fills empty space with x

				}
			}

		}
		
		//prints out the text in a grid
		System.out.print("Initial Array:\n");
		for (int i = 0; i <= r; i++) {
			p.println(textList.get(i));

		}
		System.out.println("\nDecrypted Array: ");
		
		//Switches the first 2 rows 
		Collections.swap(textList, 0, 1);
		//Reverses the rows
		Collections.reverse(textList);

		//Prints out the decrypted text
		for (int i = 0; i <= r; i++) {
			p.println(textList.get(i));
		}

		String textString = "";
		for (int i = 0; i < r; i++) {
			for (int z = 0; z < c; z++, o++) {
				textString += textList.get(z).get(i);

			}
		}

		p.println(textString);

		return (textString);

	}
}
