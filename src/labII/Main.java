package labII;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		System.out.println("God bless you!");
		
		Exercicios.exercicio1a();
		try {			
			FileManager manager = new FileManager("data.txt");
			manager.write("God bless you!");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
