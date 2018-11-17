import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(
				"Welcome to Dhruv's super dank cipher! Would you like to encrypt or decrypt? \n1. Encrypt \n2. Decrypt ");
		int choice = in.nextInt();
		if (choice == 1) {
			encrypt();
		}
		
		if (choice == 2) {
			decrypt();
		}
	}

	public static void encrypt() {
		Encrypt Encryption = new Encrypt();
		Encryption.Encrypt();
	}
	
	public static void decrypt() {
		Decrypt Decryption = new Decrypt();
		Decryption.Decrypt();
	}
}
