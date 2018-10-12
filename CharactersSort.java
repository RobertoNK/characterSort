import java.util.Scanner;

public class CharactersSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = input.nextLine();
		StringBuffer stringBuf = new StringBuffer();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int j;
			for(j = 0; j < stringBuf.length();j++) {
				
				if(ch <stringBuf.charAt(j)) {
					break;
				}
				stringBuf.insert(j, ch);
			}
			//stringBuf.insert(j, ch);
		}
		System.out.println("Sorted version of string ");
		System.out.println(stringBuf);
	}
}
