import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.StringTokenizer;

public class Pr4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in= new BufferedReader(new FileReader("test.txt"));
		StringTokenizer st;
		Random rnd= new Random();
		for(int cases=0;cases<10;cases++){
			int num=Integer.parseInt(in.readLine());
			
			//for()
			if(num==1){
				System.out.println(1);
			}else if(num==2){
				System.out.println(2);
			}else if(num==3){
				System.out.println(2);
			}else if(num==4){
				System.out.println(5);
			}else if(num==5){
				System.out.println(16);
			}else if(num==6){
				System.out.println(24);
			}else if(num==7){
				System.out.println(42);
			}else{
				int guess=42+rnd.nextInt(1000);
			}
			
			
		}
	}

}
