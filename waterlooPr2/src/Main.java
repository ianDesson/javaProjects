import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Problem2
		Scanner in=new Scanner(System.in);
		Double N=in.nextDouble();
		int k=in.nextInt(); int sum=0;
		for (int x=0; x<=k;x++){
			sum+=N;
			N*=10;
		}
		System.out.println(sum);
	}
}