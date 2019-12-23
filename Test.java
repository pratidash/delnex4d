import java.util.Scanner;
public class Test{
	//main method	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input;
		String reverse = "";
		int count = 0;
		int space = 0;
		//try-catch block
		try{
			input = scan.nextLine();
		}
		catch(java.util.NoSuchElementException e){
			return;
		}
		//Loop to reverse
		for(int i = input.length()-1; i>=0; i--){
			reverse = reverse + input.charAt(i);
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' 
			|| input.charAt(i) == 'o' || input.charAt(i) == 'u'){
				count++;		
			}
			else if(input.charAt(i) == ' '){
				space++;
			}		
		}
		int cons = reverse.length()-count-space;
		System.out.println(reverse+" , the given string contains "+count+" vowels and "+cons+" consonants");
	}
}