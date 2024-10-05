package LibrarySystem;

public class English extends englishLib {

	String null1 = "";
	
	@Override
	public void vocaChoice() {
		System.out.println("[J] Merriam Webster");
		System.out.println("[K] Vocabulary Beginner");
		
		
	}

	@Override
	String jChoice(String choice) {
		
		if(choice.equalsIgnoreCase("J")) {
			System.out.println("More than 1,800 words used in context. Quizzes with "
					+ "answers to reinforce learning. Root words help to aid understanding of words. "
					+ "For students preparing for standardized tests.");
		}
		return null1;
	}

	@Override
	String KChoice(String kchoice) {
		if(kchoice.equalsIgnoreCase("K")) {
			System.out.println("Vocabulary skills come easy when practice is fun!If you are "
					+ "looking for extra vocabulary help for your middle school student, "
					+ "you will find this book an invaluable resource.");
		}
		return null1;
	}

	@Override
	public void storyChoice() {
		System.out.println("[L] Charlotte's Web");
		System.out.println("[M] Charlie and the Chocolate Factory");
		
	}

	@Override
	public String lChoice(String lchoice) {
		if(lchoice.equalsIgnoreCase("L")) {
			System.out.println("Charlotte's Web is a book of children's literature by American author"
					+ " E. B. White and illustrated by Garth Williams; it was published on October 15, 1952, "
					+ "by Harper & Brothers. The novel tells the story of a livestock pig named Wilbur and his"
					+ " friendship with a barn spider named Charlotte.");
		}
	
		return null1;
	}

	@Override
	public String mChoice(String mChoice) {
		if(mChoice.equalsIgnoreCase("M")) {
			System.out.println("Charlie and the Chocolate Factory is a 1964 children's novel by British author Roald Dahl."
					+ " The story features the adventures of young Charlie Bucket inside the chocolate factory of eccentric"
					+ " chocolatier Willy Wonka.");
		}
	
		return null1;
	}
	
	
	
	
	
	

}
