import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Problem1
		Scanner in=new Scanner(System.in);
		int xCoord=in.nextInt();
		int yCoord=in.nextInt();
		int quad=0;
		if(xCoord>0 && yCoord>0){
			quad=1;
		}else if(xCoord<0 && yCoord>0){
			quad=2;
		}else if(xCoord<0 && yCoord<0){
			quad=3;
		}else if(xCoord>0 && yCoord<0){
			quad=4;
		}
		System.out.println(quad);
	}
}