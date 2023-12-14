package gr.atc.training.cipher;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Deciphering d = new Deciphering();
		String cipher = "ro dyvn wo s myevn xofob dokmr k vvkwk dy nbsfo";
		String deciphered = d.decipher(cipher);
		System.out.println("deciphered: "+ deciphered);
		
		String cipher_validate = d.cipher(deciphered, 10);
		System.out.println("cipher(again): "+ cipher_validate);
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("\n");
		String line = sc.nextLine();
		System.out.println("cipher text: " + d.cipher(line, 5));
	}

}
