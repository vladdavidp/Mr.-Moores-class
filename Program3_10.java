import java.util.Scanner;
public class Program3_10 {
	public static void main(String[] args) {
		Scanner Reader = new Scanner (System.in);
		String name,loop;
		int x,BOB,v;
		System.out.println("hello what is your name? ");
		name=Reader.nextLine();
		do {
		System.out.println("ok "+name+ " how may bottles of beer are on the wall? ");
		for (BOB=Reader.nextInt(); BOB>0; BOB--) {
			System.out.println(BOB +" bottles of beer on the wall");
			System.out.println(BOB +" beer on the wall");
		}
		System.out.println("do yo want to go agen (Y or N)");
	}
		while ( BOB == 0 );
}
}