package labII;

import java.util.Scanner;

public class Exercicios {
	public static void exercicio1a() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int value = sc.nextInt();
		
		System.out.println(value);
		
		int[][] array = new int[3][10];
		
		int i, j; 
		
		for(i=0; i<array.length; i++) {
			for(j=0; j<array[i].length; j++) {
				array[i][j] = j; 
			}
		}
		
		for(i=0; i<array.length; i++) {
			for(j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]); 
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
