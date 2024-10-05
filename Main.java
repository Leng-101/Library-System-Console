package LibrarySystem;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		boolean isTrue = true;
		while(isTrue) {
			
		Scanner scan = new Scanner(System.in);
		Computer com = new Computer();
		English eng = new English();
		Math math = new Math();
		
		System.out.println("[A] Computer Books");	
		System.out.println("[B] English Books");
		System.out.println("[C] Math Books");
		System.out.println("[S] Stop the Program");
			
		System.out.println();
		System.out.print("Select your choice : ");
		String choice = scan.nextLine();
		
		if(!choice.equals("A")) {
			if(!choice.equals("B"))
				if(!choice.equals("C"))
					if(!choice.equals("S"))
					
					System.out.println("Try Again ...");
			
		}
		
		switch(choice) {
		
		case "A":
			System.out.println("[1] Programming Language");
			System.out.println("[2] ICT");
			System.out.println();
			System.out.print("Select your choice : ");
			int choice1 = scan.nextInt();
			scan.nextLine();
		
		if(choice1 == 1) { // PROGRAMMING LANGUAGE
			System.out.println();
			com.computerChoice();
		
		}
		
	    if (choice1 == 2) { // ICT
			System.out.println();
			com.ictChoice();
		}
		
		System.out.println();
		System.out.print("Select your choice : ");
		String choice2 = scan.nextLine();
		
		com.fChoice(choice2); // LETTER F
	    com.pChoice(choice2); // LETTER G
		com.hChoice(choice2); // LETTER H
		com.dChoice(choice2); // LETTER I
		System.out.println();
		break;
		
		case "B":
			System.out.println("[1] Vocabulary");
			System.out.println("[2] Story Telling");
			System.out.println();
			System.out.print("Select your choice : ");
			int choice3 = scan.nextInt();
			scan.nextLine();
	
		if(choice3 == 1) {
			System.out.println();
			eng.vocaChoice();
		}
		
		if (choice3 == 2) {
			System.out.println();
			eng.storyChoice();
		}
		
		System.out.println();
		System.out.print("Select your choice : ");
		String choice4 = scan.nextLine();
		
		eng.jChoice(choice4); // LETTER J
		eng.KChoice(choice4); // LETTER K
		eng.lChoice(choice4); // LETTER L
		eng.mChoice(choice4); // LETTER M	
		break;
		
		case "C" :
			System.out.println("[1] Arithmetic Operations");
			System.out.println("[2] Fractions");
			System.out.println();
			System.out.print("Select your choice : ");
			int choice5 = scan.nextInt();
			scan.nextLine();
	
		if(choice5 == 1) {
			System.out.println();
			math.mathChoice();
		}
		
		if(choice5 == 2) {
			System.out.println();
			math.fractChoice();
		}
		
		System.out.println();
		System.out.print("Select your choice : ");
		String choice6 = scan.nextLine();
		
		math.nChoice(choice6);
		math.oChoice(choice6);
		math.pChoice(choice6);
		math.qChoice(choice6);
		break;
		
		case "S" :
			System.out.println("End of Program ---------");
			isTrue = false;
			if(!isTrue) break;
					
	   }

  }
}
}