import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.List;
import java.util.Collections;

public class Encrypt {

	// Empty Constructor
	public Encrypt() {
	}

	public String Encrypt() {
		Encrypt Encryption = new Encrypt();
		PrintWriter p = new PrintWriter(System.out, true);
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the message you would like to Encrypt: ");
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
		
		
		System.out.println("\nEncrypted Array: ");
		//Switches the first 2 rows 
		Collections.reverse(textList);
		Collections.swap(textList, 0, 1);

		//Reverses the rows
		for (int i = 0; i <= r; i++) {
			p.println(textList.get(i));
		}

		//Prints out the encrypted text
		String textString = "";
		o = 0;
		for (int i = 0; i < r; i++) {
			for (int z = 0; z < c; z++, o++) {
				textString += textList.get(z).get(i);

			}
		}

		p.println(textString);

		return (toString());

	}
}

/*
 * import java.util.ArrayList; import java.util.Arrays; import
 * java.util.Collections; import java.util.List; import java.util.Scanner;
 * import java.io.PrintWriter;
 * 
 * public class Encrypt { // Instance variable private String key;
 * 
 * // Constructor for objects of class Encrypt public Encrypt(String theKey) {
 * key = theKey; }
 * 
 * // Empty constructor public Encrypt() { }
 * 
 * // Getters and setters for the object public void setKey(String theKey) { key
 * = theKey; }
 * 
 * public String getKey() { return key; }
 * 
 * public void encrypt() { Scanner in = new Scanner(System.in); Encrypt
 * Encryption = new Encrypt();
 * System.out.println("Please enter the key you would like to use: "); key =
 * in.nextLine(); System.out.println("The key is: " + key); int c =
 * key.length(); String alphabet = "abcdefghijklmnopqrstuvwxyz"; ArrayList array
 * = new ArrayList(); for (int i = 0; i < key.length(); i++) {
 * array.add(alphabet.indexOf(key.charAt(i))); }
 * 
 * System.out.println(array);
 * 
 * Collections.sort(array); System.out.println("After Sorting:"); for (int i =
 * 0; i < 1; i++) { System.out.println(array); } System.out.println("There are "
 * + c + " columns. Please input the number of rows you wish to have \nRows: ");
 * int r = in.nextInt();
 * System.out.println("Please type the letters you wish to encrypt into a " + r
 * + "x" + c + " grid: "); char[][] wordsArray = new char[100][100]; int j; for
 * (int i = 0; i < r; i++) { for (j = 0; j < c; j++) { wordsArray[i][j] =
 * in.next().charAt(0); } } System.out.println("output"); for (int i = 0; i < r;
 * i++) { for (j = 0; j < c; j++) { System.out.print(wordsArray[i][j] + " "); }
 * System.out.println(); } }
 * 
 * void Swap(int c1, int c2, int[][] arry) { for (int i = 0; i < arry.length;
 * i++) { int temp = arry[i][c1]; arry[i][c1] = arry[i][c2]; arry[i][c2] = temp;
 * }
 * 
 * } }
 * 
 * /* public String encrypt() { Scanner in = new Scanner(System.in); Encrypt
 * Encryption = new Encrypt(); System.out.println("Please type a key: ");
 * Encryption.setKey(in.nextLine()); String alphabet =
 * "abcdefghijklmnopqrstuvwxyz"; ArrayList array = new ArrayList(); for (int i =
 * 0; i < (Encryption.key).length(); i++) {
 * array.add(alphabet.indexOf((Encryption.key).charAt(i))); }
 * System.out.println(array);
 * 
 * System.out.println("Please input the message you wish to encrypt: "); String
 * message = in.nextLine(); int x = (Encryption.key).length(); for (int i = 0;
 * (i * i) < message.length(); i++) { i = 0; x = i++; } List<List<Character>>
 * column = new ArrayList<>(); for (int i = 0; i < (Encryption.key).length();
 * i++) { column.add((new ArrayList<>())); }
 * 
 * for (int i = 0; i < 0; i++) { for (int r = 0; r < (Encryption.key).length();
 * r++) { if (0 < message.length()) { column.get(r).add(message.charAt(0)); }
 * else { column.get(r).add('x'); } } }
 * 
 * PrintWriter p = new PrintWriter(System.out, true); p.println(column); return
 * (null);
 * 
 * } }
 */
//System.out.println("Encrypted Text: ");
//String result = textList.toString().replaceAll(", |\\[|\\]", "");
//System.out.print(result);
