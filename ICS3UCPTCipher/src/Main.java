import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome to the Split Word Cipher!");
		System.out.println("Choose an option:");
		System.out.println("1. Encode");
		System.out.println("2. Decode");
		System.out.print("Your choice: ");
		int choice=in.nextInt();
		in.nextLine();
		
		//if they choose 1, go to Encode method
		if (choice==1){
			System.out.println("You have chosen to ENCODE A MESSAGE");
			System.out.print("Enter your message: ");
			String message=in.nextLine().toUpperCase();
			//print the output to the screen
			System.out.println(encode(message));
		}//if they choose 2, go to Decode 
		else if (choice==2){
			System.out.println("You have chosen to DECODE A MESSAGE");
			System.out.print("Enter your message: ");
			String message=in.nextLine().toUpperCase();
			System.out.println(message.length());
			System.out.println(decode(message)); //Print out our decoded message
		}else{
			System.out.println("Not a valid choice. Goodbye");
		}
	}
	public static String encode (String message){
		String output="";
		String[] words=message.split(" ");
		//Loop through all of the words
		for (int x=0;x<words.length;x++){
			//add the letter representing the length of the word
			char size=(char)(words[x].length()-1+'A');
			//add the letter to the output string
			output+=size;
			//loop through the letters of the word
			for (int y=0;y<words[x].length();y++){
				//get the letter
				char temp=words[x].charAt(y);
				//add the length of the word
				temp+=words[x].length();
				//if the letter is past Z, loop back to the beginning of the alphabet
				if (temp>'Z'){
					temp-=26;
				}
				//add the new letter to the output
				output+=temp;
			}
		}
		return output;
	}
	public static String decode (String message){
		String output="";
		char[] msg = message.toCharArray(); //Create a char array of all the letters
		for (int x=0; x<msg.length; x++){ //loop through all the letters
			int shift=msg[x]-64; //get the length of the word
			for(int y=x; y<shift+x; y++){ //loop through the word
				//char letter = (char) (((msg[y+1]-'A'-shift)%26)+'A'); //<-- This one stopped working at the last word.
				char letter = (char) (msg[y+1]-shift); //Shift back the letter (decode)
				if(letter<'A'){
					letter+=26;
				}
				output+=letter; //Add our decoded letter
			}
			x+=shift; //Skip to end of the word
			output+=" "; //add a space to output
		}
		return output;
	}

}
