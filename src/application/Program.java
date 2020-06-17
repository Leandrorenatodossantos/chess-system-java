package application;

import java.util.Locale;
import java.util.Scanner;

import bordgame.Bord;
import bordgame.Position;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Bord bord = new Bord(8, 8);
		//Position position = new Position(3, 5);
		System.out.println(bord);
				
				
				
		sc.close();
	}

}
