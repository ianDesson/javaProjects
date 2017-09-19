import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in= new BufferedReader(new FileReader("DATA42.txt"));
		StringTokenizer st;

		for(int testt=0;testt<10;testt++){


			st=new StringTokenizer(in.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());

			if(n==m){
				System.out.println(0);
				for(int i=0;i<n;i++){
					in.readLine();

				}
			}else{

				int[][] arr=new int[n][2];
				for(int i=0;i<n;i++){
					st=new StringTokenizer(in.readLine());
					arr[i][0]=Integer.parseInt(st.nextToken());
					arr[i][1]=Integer.parseInt(st.nextToken());

				}

				int min=Integer.MAX_VALUE;
				int ind=-1;
				for(int i=0;i<n;i++){
					if(Math.abs(arr[i][1]-arr[i][0])<min){
						min=Math.abs(arr[i][1]-arr[i][0]);
						ind=i;
					}
					


				}
				System.out.println(2*Math.abs(arr[ind][0]*arr[ind][1])%1000000007);

			}
		}


	}
}