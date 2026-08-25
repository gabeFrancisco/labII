package labII;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	File file = null;
	
	public FileManager(String path) throws IOException {
		this.file = new File(path);
		
		if(file.createNewFile()) {
			System.out.println("File created!");
		}
	}
	
	public void write(String text) throws IOException {
		try {
			FileWriter writer = new FileWriter(this.file);
			
			writer.write(text);
			writer.close();			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
