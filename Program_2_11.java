import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.*;
public class Program_2_11{
	public static void main(String[] args) {
		int loopVal = 42;

		do {
		Scanner reader = new Scanner (System.in);
		String Name;
		double dist, gasusd, mpg;
		int dyw;
		System.out.println("hello I am freddy your gas per mile calculator, what is your name");
		Name = reader.nextLine();
		System.out.println(Name+" ,how long was your drive in miles? ");
		dist = reader.nextDouble();
		System.out.println(Name+" ,how much gas did you use in gallons");
		gasusd = reader.nextDouble();
		mpg = (dist/gasusd);
		System.out.println("ok "+Name+" on your trip from point a to point b without stops you had an avrige of "+ (mpg)+" miles per gallon");
		}
		while ( loopVal == 42 );
	}

}
