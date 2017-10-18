import java.util.Scanner;
public class Program_2_10{
	public static void main(String[] args) {
		int loopVal = 0;
		String name;
		do {
		Scanner reader = new Scanner (System.in);
		double A,B,C,S,eq0,FinalNum, lou;
		String Name;
		System.out.println("hello i am fred your trusty triangle calculator, what is your name?");
		Name=reader.nextLine();
		System.out.println("ok "+ Name + " what is the length of your triangle?");
		A = reader.nextDouble();
		System.out.println("ok "+ Name + " what is the with of your triangle?");
		B = reader.nextDouble();
		System.out.println("ok "+ Name + " what is the length of the remaining side of your triangle?");
		C = reader.nextDouble();
		lou=(A+B+C);
		S=(lou/2);
		eq0 = (S*(S-A)*(S-B)*(S-C));
		FinalNum=(Math.sqrt(eq0));
		
		System.out.println("the area of your triangle is "+FinalNum);
		}
		while ( loopVal < 42 );
	}

}