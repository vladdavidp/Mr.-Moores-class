import java.util.Scanner;
public class Program3_10 {
	public static void main(String[] args) {
		Scanner Reader = new Scanner (System.in);
		String name;
		int x,BOB;
		System.out.print("hello what is your name? ");
		name=Reader.nextLine();
		do {
		System.out.print("ok "+name+ " how may bottles of beer are on the wall? ");
		for (BOB=Reader.nextInt(); BOB>0; BOB--) {
			int LO=BOB-1;
			System.out.println(BOB +" bottles of beer on the wall, "+BOB +" beer on the wall");
			System.out.println("Take one down and pass it around, " +LO+" bottles of beer on the wall.");
		}
	}
		while (BOB==0);
}

}