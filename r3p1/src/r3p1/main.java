package r3p1;

import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in= new BufferedReader(new FileReader("DATA12.txt"));
		StringTokenizer st;


		for(int testt=0;testt<10;testt++){
			

			st= new StringTokenizer(in.readLine());
			int f= Integer.parseInt(st.nextToken());
			int d= Integer.parseInt(st.nextToken());

			int[] arr=new int[f];
			int count=0;
			int temp=0;
			int single=0;
			for(int i=0;i<d;i++){
				st= new StringTokenizer(in.readLine());
				for(int k=0;k<f;k++){
					temp=Integer.parseInt(st.nextToken());
					arr[k]+=temp;
					single+=temp;


				}
				if(single%13==0){
					count+= single/13;
				}

				single =0;
			}
			
		
			for(int i=0;i<f;i++){
				if(arr[i]%13==0){
					count+= arr[i]/13;
				}
			}
			System.out.println(count);
		}


	}
}