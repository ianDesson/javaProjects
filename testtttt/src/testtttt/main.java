package testtttt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar1={4,56,7};
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int[] ar2= ar1.clone();
		Arrays.sort(ar2);
		for(int i=0;i<3;i++){
			System.out.println(ar1[i]+" "+ar2[i]);
			
			}
		
		
	}

}
