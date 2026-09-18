package Sample;

import java.lang.classfile.ClassFile.Option;
import java.util.Scanner;

public class LoopingStmt1 {

	public static void main(String[] args) {
		
		Scanner option = new Scanner(System.in);
		String choice ="No";
		
		while(choice.equals("No")) {
			System.out.print("Do u want to exit?");
			choice = option.next();
		}
		System.out.println("Exit of Loop");
		option.close();
		
		do {
			System.out.print("DO u want to exit");
			choice = option.next();
		}while(choice.equalsIgnoreCase("No"));
		
		System.out.println("Exit of loop");
		option.close();
		
	
			
		}
		

	}

	




