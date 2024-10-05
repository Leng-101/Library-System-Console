package LibrarySystem;

public class Math extends mathLib {
	
	String null1 = "";

	@Override
	void mathChoice() {
		System.out.println("[N] Arithmetic Fresher");
		System.out.println("[O] Basic Math");
	}

	@Override
	String nChoice(String nchoice) {
		if(nchoice.equalsIgnoreCase("N")) {
			System.out.println("The farther we get from our grade school days, "
					+ "the easier it is to forget those operations and nuances of "
					+ "arithmetical computation that keep recurring in our daily lives:"
					+ " interest and discount problems");
		}
		
		return null1;
	}

	@Override
	String oChoice(String ochoice) {
		if(ochoice.equalsIgnoreCase("O")) {
			System.out.println("A 2-book bundle that adds up to success in basic math and pre-algebra People "
					+ "of all ages — from students in a math class to adults using math in the real world — "
					+ "often dislike ever having to use arithmetic, fractions, decimals, percentages, geometry, "
					+ "and so on. Math is all around us, but it doesn’t have to be hard.");
		}
		
		return null1;
	}
	
	@Override
	void fractChoice() {
		System.out.println("[P] Fraction Action");
		System.out.println("[Q] Fraction fun");
		
	}

	@Override
	String pChoice(String pchoice) {
		if(pchoice.equalsIgnoreCase("P")) {
			System.out.println("Miss Prime and her animal students explore "
					+ "fractions by finding many examples in the world around them.");
		}
		
		return null1;
	}

	@Override
	String qChoice(String qchoice) {
		if(qchoice.equalsIgnoreCase("Q")) {
			System.out.println("Would you rather eat 1/4 of a pizza or 1/8 of a pizza? Find 3/4 of a dollar "
					+ "or 1/10 of a dollar? Confused? You don't have to be! Fractions are made easy in this "
					+ "simple and hands-on math concept book You'll learn what the top and bottom numbers are called, "
					+ "and what they mean.");
		}
		return null1;
	}


}
