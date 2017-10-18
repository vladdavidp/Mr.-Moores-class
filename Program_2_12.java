import java.util.Scanner;
public class Program_2_12{
	public static void main(String[] args) {
		int loopVal = 0;

		do {
		Scanner reader = new Scanner (System.in);
		double cen, quart,A,B,dim,C,D,E,F,G,nic,H,pen;
		System.out.println("how many cents are in the jar ");
		cen= reader.nextDouble();
		A=cen%25;
		B=cen-A;
		quart=B/25;
		C=cen-B;
		D=C%10;
		E=C-D;
		dim=E/10;
		F=(cen-B)-E;
		G=F%5;
		H=((F-G)/5);
		pen=G;
		System.out.println("you have "+quart+" quarters");
		System.out.println("you have "+dim+" dimes");
		System.out.println("you have "+H+" nickils");
		System.out.println("you have "+pen+" pennies");
		
		}
		while ( loopVal < 42 );
	}

}