import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Program_3_ {
	public static void main(String[] args) throws InterruptedException {
		Scanner Reader = new Scanner (System.in);
		String usrinput , Name, still,nan="yes";
		int word=1, chari=0, sen=0,x;
		char n;// Don't Panic
		System.out.print("what is your name? ");
		Name=Reader.nextLine();
		System.out.print("Now then, "+ Name + " tell me how you are feeling ");
		usrinput=Reader.nextLine();
		for( x = 0; x<usrinput.length(); x++){
			n=usrinput.charAt(x);
			if ((n) !=   ' ') { 
				chari++;
			}
			if ((n) ==   ' ') {
				word=word+1;
				chari++;//spaces are characters too
			}// all bugs plese report to the raid factory from Grace Murray Hopper
		
			if ((n) ==   '.'&&x>1) { 
				sen++;	
			}
			if ((n) ==   '!'&&x>1) { 
				sen++;	
			}
			if ((n) ==   '?'&&x>1) { //i hate grammar
				sen++;	
			}
		}
		if (word==1){//bug fix if the user dose not try anything they used to get 1 word and zero characters now they get 0 words and zero characters
			word=0;
			if (chari<2 ){
				System.out.println("realy what a putz you did not anwser my queston!!");// life the universe and everything	
			}
		}
		if(sen==1&chari==1){//all 1
			System.out.println("there is "+sen+" sentence, there are "+word+" words and there is "+chari+ " character"+"\n"+"\n");
			TimeUnit.SECONDS.sleep(7);
			System.out.println("You're still here? It's over. Go home. Go.  ");
		}else if(sen==1&chari!=1){//sen1
			System.out.println("there is "+sen+" sentence, there are "+word+" words and "+chari+ " characters"+"\n"+"\n");
			TimeUnit.SECONDS.sleep(7);
			System.out.println("You're still here? It's over. Go home. Go.  ");
		}else if(sen!=1&chari==1){//chari1
			System.out.println("there are "+sen+" sentences, there are "+word+" words and there is "+chari+ " character"+"\n"+"\n");
			TimeUnit.SECONDS.sleep(7);
			System.out.println("You're still here? It's over. Go home. Go.  ");
		}else if(sen!=1&chari!=1){//none
			System.out.println("there are "+sen+" sentences, there are "+word+" words and "+chari+ " characters"+"\n"+"\n");
			TimeUnit.SECONDS.sleep(7);
			System.out.println("You're still here? It's over. Go home. Go.  ");
		}
	}
}//To be, or not to be either way were all fucked   (: