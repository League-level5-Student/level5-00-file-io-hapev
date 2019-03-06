package _02_File_Encrypt_Decrypt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
public static void main(String[] args) {
		
		//Read from a file one character at a time
		try {
			FileReader fr = new FileReader("src/_02_File_Encrypt_Decrypt/encryptedFile.txt");
			int c = fr.read();
			String s = "";
			while(c != -1){
				s+=(Character.toString((char) (c-2)));
				c =	fr.read();
			}
			fr.close();
			JOptionPane.showMessageDialog(null, s);
			} catch (IOException e) {
			e.printStackTrace();
		}
}
}
