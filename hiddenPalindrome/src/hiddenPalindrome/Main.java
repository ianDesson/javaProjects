package hiddenPalindrome;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=0;
		int max=0;
		int x=0;
		boolean possib=false;
		String input=in.nextLine();
		String[] letters=input.split("");
		for(int a=0; a<input.length(); a++){
			if(input.indexOf(letters[a], a+1)!=-1){
				possib=true;
				int ind=input.indexOf(letters[a], a+1);
				if(possib){
					x=a;
					for(int c=ind; c>=a; c--){
						if(letters[x]==letters[c]){
							x++;
							count=ind;
							if(count>max){
								max=count;
							}
						}
					}
				}
				possib=false;
			}
		}
		System.out.println(max);
	}
}