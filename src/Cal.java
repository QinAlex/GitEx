import java.util.Scanner;

public class Cal {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What you want? Add or subtract? (Plz only enter \"add\" or \"sub\"): ");
		String s = input.next();
		System.out.print("Enter your First Number (int only): ");
		int i= input.nextInt();
		System.out.print("Enter your Second Number (int only): ");
		int j= input.nextInt();
		Add k = new Add(i,j);
		
		if(s.contentEquals("add")) System.out.print("Answer: " + k.AddCal());
		else System.out.print("Answer: " + k.SubCal());
		input.close();
	}
	
	
}