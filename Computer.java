package LibrarySystem;

public class Computer extends computerLib {
	
	String null1 = "";
	
	public void computerChoice() {
		System.out.println("[F] Java Programming");
		System.out.println("[G] Phyton Programming");
		
	}
	
	  String fChoice(String fchoice) {	
		if(fchoice.equalsIgnoreCase("F")) {
			System.out.println("What is Java programming used "
					+ "\nnOne of the most widely used programming languages,"
					+ "\nJava is used as the server-side language for most "
					+ "\nback-end development projects, including those involving "
					+ "\nbig data and Android development. Java is also commonly used for"
					+ "\ndesktop computing, other mobile computing, games, and numerical computing.");
		}
		
		return null1;
		
		
	}

	@Override
	String pChoice(String pychoice) {
		if(pychoice.equalsIgnoreCase("G")) {
			System.out.println("Python is an interpreted high-level general-purpose programming language."
					+ "\n Its design philosophy emphasizes code readability with its use of significant indentation. "
					+ "\nIts language constructs as well as its object-oriented approach aim to help programmers"
					+ "\n write clear, logical code for small and large-scale");
		}
		
		return null1;
	}

	@Override
	void ictChoice() {
		System.out.println("[H] Hardware");
		System.out.println("[I] Digital World");
	
		
	}

	@Override
	String hChoice(String hchoice) {
		if(hchoice.equalsIgnoreCase("H")) {
			System.out.println("Hardware is a generic term for any physical part of the computer "
					+ "\nsystem which you can physically touch, pick up or move. The physical parts of"
					+ "\na computer system are often referred to as 'hardware devices'. Software applications"
					+ "\nare the instructions that computers carry out for a specific task.");
		}

		return null1;
	}

	@Override
	String dChoice(String ichoice) {
		if(ichoice.equalsIgnoreCase("I")) {
			System.out.println(" Digital World is a global platform for accelerating ICT innovations. "
					+ "\nIt aims to deliver economic development and social good faster through its exhibition "
					+ "\nfor digital solutions, forum for sharing knowledge, and networking hub connecting nations, "
					+ "\norganisations and individuals.");
			
			
		}
		return null1;
	}


	
	
	
	
	
}


	

	
	
	
	
	
	
	


