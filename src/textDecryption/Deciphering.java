package textDecryption;

public class Deciphering {

	public String decipher(String cipher_text) {
		String decipher_text = null;
		int offset = 10;
		char cipher_text_char_array[] = cipher_text.toCharArray();
		
		for(int i=0; i<cipher_text_char_array.length; i++) {
			char current_char = cipher_text_char_array[i];
			if (current_char == ' ') 
				continue;
			
			int originalAlphabetPosition = current_char - 'a';
			
			int newAlphabetPosition = (originalAlphabetPosition - offset + 26) % 26;
			
			char newCharacter = (char) ('a' + newAlphabetPosition);
			
			cipher_text_char_array[i] = newCharacter;	
		}
		
		decipher_text = String.valueOf(cipher_text_char_array);
		return decipher_text;
	}

	public String cipher(String normal_text, int offset) {
		String cipher_text = null;
		char normal_text_array[] = normal_text.toCharArray();
		
		for(int i=0; i<normal_text_array.length; i++) {
			char current_char = normal_text_array[i];
			if (current_char == ' ') continue;
			
			int originalAlphabetPosition = current_char - 'a';
			int newAlphabetPosition = (originalAlphabetPosition + offset)%26;
			char newCharacter = (char) ('a' + newAlphabetPosition);
			
			normal_text_array[i] = newCharacter;	
		}
		cipher_text = String.valueOf(normal_text_array);
		return cipher_text;
	}
}