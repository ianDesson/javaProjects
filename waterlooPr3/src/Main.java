import java.util.*;
public class Main {

	public static void main(String[] args) {
		// Problem3
		Scanner in=new Scanner(System.in);
		int xStr=in.nextInt(); int yStr=in.nextInt();
		int xEnd=in.nextInt(); int yEnd=in.nextInt();
		int charge=in.nextInt();
		int xDist=Math.abs(xEnd-xStr); int yDist=Math.abs(yEnd-yStr);
		boolean pass=false;
		if(xDist==0 && yDist==charge){
			//Directly Across
			pass=true;
		}else if (yDist==0 && xDist==charge){
			//Directly above
			pass=true;
		}else if(xDist+yDist==charge){
			//Account for slope
			pass=true;
		}else if(2+xDist==charge){
			pass=true;
		}else if(2+yDist==charge){
			pass=true;
		}
		if(pass){
			System.out.println("Y");
		}else{
			System.out.println("N");
		}
	}
}