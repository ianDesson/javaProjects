import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pr2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in= new BufferedReader(new FileReader("C:\\Users\\Senslogo\\workspace\\r2Pr2\\DATA31.txt"));
		StringTokenizer sp;
		
		for(int cases=0;cases<10;cases++){
			
			sp=new StringTokenizer(in.readLine());
			int N=Integer.parseInt(sp.nextToken());
			int M=Integer.parseInt(sp.nextToken());
			int K=Integer.parseInt(sp.nextToken());
			int[] rat=new int[N];
			sp=new StringTokenizer(in.readLine());
			for(int i=0;i<N;i++){
				rat[i]=Integer.parseInt(sp.nextToken());
			}
			int hig=rat[0];
			
			for (int da=0; da<K-1; da++){
				int[] temp= rat.clone();
				Arrays.sort(temp);
				hig=temp[N-1];
				loop:
				for(int d=0; d<N;d++){
					if(rat[d]==hig){
						
						rat[d]-=M;
						
						break loop;
					}
					

				}
		
//				int[] temp= rat;
//				Arrays.sort(temp);
//				hig=temp[N-1];
				
				
			}
			
			int[] temp= rat.clone();
			Arrays.sort(temp);
			hig=temp[N-1];
			loop2:
			for(int p=0;p<N;p++){
				if(rat[p]==hig){
					System.out.println(p+1);
					break loop2;
				}
			}
			
			
		}
	

	}

}
