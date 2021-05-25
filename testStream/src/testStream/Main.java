package testStream;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(isAlphabets("abcdefg123hijkl"));
		System.out.println(isAlphabets("abcdefghijkl"));
		System.out.println(isAlphabets(""));
		System.out.println(isAlphabets(null));
			
	}
	
	public static boolean isAlphabets(String x) {
		if(x == "" || x == null) {
			return false;
		}
		else {
			boolean result = x.chars().allMatch(Character::isLetter);
			return result;
		}
	}
	
	

}

