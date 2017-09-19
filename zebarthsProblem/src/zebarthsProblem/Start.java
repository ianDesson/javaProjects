package zebarthsProblem;
import java.util.*;
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//This program reads in a String
		//It will then make the String uppercase
		//It will loop through each letter in the string
		//It will switch the letters as follows: 
		//A-->Z, B-->Y, C-->X, D-->W, etc. up to M-->N
		//It will then print out the result.
		//If you copy the output and put it back into the program, you will get the original message back.
		//This code will have many bugs. Your job is to fix these bugs and get the code working.
		//Good luck!

		System.out.println("Input your message");
		String input=in.nextLine();
		input=input.toUpperCase();
		String output="";
		for (int x=0;x<input.length();x++){
			char current=input.charAt(x);
			if (current<'A'||current>'Z'){
				output+=current;
			}else{
				int diff=current-'A';
				diff=25-(diff*2);
				current+=diff;
				output+=current;
			}
		}
		System.out.println("Coded message is "+output);
	}
}


