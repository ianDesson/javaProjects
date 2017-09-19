import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//BufferedReader in= new BufferedReader(new FileReader("DATA31.txt"));
		Random rnd= new Random();
		for(int i = 0; i < 4; i++){
			System.out.println(rnd.nextInt(400));
		}
		
		for(int i = 0; i < 5; i++){
			System.out.println(rnd.nextInt(1000000));
		}
		System.out.println(rnd.nextInt(100000000));
		
	}
}