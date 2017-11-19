import javax.swing.*;
import java.util.concurrent.TimeUnit;
public class Program_3_8 {
	public static void main(String[] args) throws InterruptedException {
		String usrinput , Name, still,nan="yes";
		int word=1, chari=0, sen=0,x,vo=0,pun=0,cap=0,low=0;
		char n;// Don't Panic
		Name=JOptionPane.showInputDialog("what is your name? ");//what is your name
		usrinput=JOptionPane.showInputDialog("Now then, "+ Name + " give me a detaled descripton of how you are feeling ");
		for( x = 0; x<usrinput.length(); x++){
			n=usrinput.charAt(x);
			if ((n) !=   ' ') { 
				chari++;
			}
			if ((n) ==   ' ') {
				word=word+1;
				chari++;//spaces are characters too
			}// all bugs plese report to the raid factory from Grace Murray Hopper
		
			if ((n) ==   '.'&&x>1) { // define a sentince
				sen++;
				pun++;
			}
			if ((n) ==   '!'&&x>1) { 
				sen++;
				pun++;
			}
			if ((n) ==   '?'&&x>1) { //i hate grammar
				sen++;	
				pun++;
			}
			if ((n)== ',' || (n)== ';' || (n)== ':'){
				pun++;
			}
			if ((n)=='u' ||(n)=='U' ||(n)=='o' ||(n)=='O' ||(n)=='i' ||(n)=='I' ||(n)=='e' ||(n)=='E' ||(n)=='A' || (n)=='a'){
				vo++;
			}
			if((n)=='A' ||(n)=='B' ||(n)=='C' ||(n)=='D' ||(n)=='E' ||(n)=='F' ||(n)=='G' ||(n)=='H' ||(n)=='I' ||(n)=='J' ||(n)=='K' ||(n)=='L' ||(n)=='M' ||(n)=='N' ||(n)=='O' ||(n)=='P' ||(n)=='Q' ||(n)=='R' ||(n)=='S' ||(n)=='T' ||(n)=='U' ||(n)=='V' ||(n)=='W' ||(n)=='X' ||(n)=='Y' ||(n)=='Z'){
				cap++;
			}else if((n)!=',' &&(n)!='.' && (n)!=';'&&(n)!=':' &&(n)!='?'&&(n)!='!'&&(n)!=',') {
				low++;
			}
		}
		if (word==1){//bug fix if the user dose not try anything they used to get 1 word and zero characters now they get 0 words and zero characters
			word=0;
			if (chari<2 ){
				JOptionPane.showMessageDialog(null, "realy what a putz you did not anwser my queston!!");// life the universe and everything	
			}
		}
		if(sen==1&chari==1){// multiple outputs due to gramer
			JOptionPane.showMessageDialog(null, "there is "+sen+" sentence, there are "+word+" words and there is "+chari+ " character "+pun+" puncituaton marks "+vo+" vowels "+cap+" capital leters, and there are "+low+" lowercase letters");
			TimeUnit.SECONDS.sleep(7);
			JOptionPane.showMessageDialog(null, "You're still here? It's over. Go home. Go.  ");
		}else if(sen==1&chari!=1){//sen1
			JOptionPane.showMessageDialog(null,"there is "+sen+" sentence, there are "+word+" words and "+chari+ " characters "+pun+" puncituaton marks "+vo+" vowels "+cap+" capital leters, and there are "+low+" lowercase letters");
			TimeUnit.SECONDS.sleep(7);
			JOptionPane.showMessageDialog(null, "You're still here? It's over. Go home. Go.  ");
		}else if(sen!=1&chari==1){//chari1
			JOptionPane.showMessageDialog(null,"there are "+sen+" sentences, there are "+word+" words and there is "+chari+ " character "+pun+" puncituaton marks "+vo+" vowels "+cap+" capital leters, and there are "+low+" lowercase letters");
			TimeUnit.SECONDS.sleep(7);
			JOptionPane.showMessageDialog(null, "You're still here? It's over. Go home. Go.  ");
		}else if(sen!=1&chari!=1){//none
			JOptionPane.showMessageDialog(null,"there are "+sen+" sentences, there are "+word+" words and "+chari+ " characters "+pun+" puncituaton marks "+vo+" vowels "+cap+" capital leters, and there are "+low+" lowercase letters");
			TimeUnit.SECONDS.sleep(7);
			JOptionPane.showMessageDialog(null, "You're still here? It's over. Go home. Go.  ");
		}
	}
}//To be, or not to be either way were all fucked   (: