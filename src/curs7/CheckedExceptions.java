package curs7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptions {

	public static void main(String[] args) {
		
		
		try {
			Scanner scan = new Scanner(new File("test.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
		
		System.out.println("Test");
		
		try {
			Thread.sleep(4000); //opreste thread ul de executie pentru x milisecunde
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		//checked exception -- te anunta compilatorul --> compilatorul stie pentru ca in clasa pe care o chemi 
		//se arunca o exceptie

	}

}
