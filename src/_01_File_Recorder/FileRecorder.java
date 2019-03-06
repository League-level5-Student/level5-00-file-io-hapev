package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Type a message to write");
		try {
			FileWriter fw = new FileWriter("src/_01_File_Recorder/123.txt");
			
			
			
			fw.write(s);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
