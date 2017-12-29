import java.text.DecimalFormat;
import java.util.Scanner;
public class midterm {
	private static Scanner txt;

	public static void main(String[] args){
		DecimalFormat round =new DecimalFormat(".###");
		boolean loop=true;
		txt = new Scanner(System.in);
		double x,a,b,c,disc;
		while(loop==true){
			System.out.print("what is the value of a? ");
			a =txt.nextDouble();
			System.out.print("what is the value of b? ");
			b =txt.nextDouble();
			System.out.print("what is the value of c? ");
			c =txt.nextDouble();
			disc=((Math.pow(b,2))-(4*a*c));
			if (disc<0){
				System.out.print("there are no real soloutions");
			}if (disc==0){
				x=(((-1)*b)/(2*a));
				System.out.print("there is one real soloution and it is "+x);
			}
			if (disc>0){
				double xp,xn;
				xp=(((((-1)*b)+Math.sqrt(disc))/(2*a)));
				xn=(((((-1)*b)-Math.sqrt(disc))/(2*a)));
				int lol1 = (int) xp;
				int lol2 = (int) xn;
				if (xp==lol1){
					System.out.print("there are two real soloution and they are "+xp);
				}else{
					System.out.print("there are two real soloution and they are "+round.format(xp));
				}
				if (xn==lol2){
					System.out.print(xn);
				}else{
					System.out.print(round.format(xn));
				}}
			System.out.print("\n"+"do you want to play agin, 0 for yes 1 for no \n");
			int play=txt.nextInt();
			if (play!=1){
				loop=true;}}}}// by Louis Orcinolo, condor0010
