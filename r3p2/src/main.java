//import java.util.*;
//import java.io.*;
//public class main {
//
//	
//	
//	public static void main(String[] args) throws IOException{
//		// TODO Auto-generated method stub
//		BufferedReader in= new BufferedReader(new FileReader("test2.txt"));
//		
//		for(int i = 0; i < 10; i ++){
//			int n = Integer.parseInt(in.readLine());
//			String[] arr = new String[n];
//			ArrayList<ArrayList> family = new ArrayList<ArrayList>();
//			
//			for(int x = 0; x < n; x++){
//				arr[x] = in.readLine();
//			}
//			
//			for(int t = 0; t< arr.length; t++){
//				//every line
//				String[] temp = arr[t].split(".");
//				for(int x = 0; x<temp.length; x++){
//					// reach in
//					
////					for(int y = Integer.parseInt(temp[x]); y < 0; y--){
////						StringBuilder str = new StringBuilder("");
////						
////							if(!family.contains())
////					}
//					
//					
//					
//				}
//				
//			}
//		}
//		
//	}
//}

import java.util.*;
import java.io.*;
public class main {

	static ArrayList<ArrayList> fam= new ArrayList<ArrayList>();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in= new BufferedReader(new FileReader("DATA21.txt"));
		
		for(int i = 0; i < 10; i ++){
			int n = Integer.parseInt(in.readLine());
			String[] arr = new String[n];
			ArrayList<String> family = new ArrayList<String>();
			
			for(int x = 0; x < n; x++){
				arr[x] = in.readLine();
			}
			
			for(int t = 0; t< arr.length; t++){
				//every line
				String sss=arr[t];
				for(int ii=0;ii<sss.length();ii++){
					if(sss.substring(ii, ii+1).equals(".")){
						String tt=sss;
						sss=sss.substring(0,ii)+" "+tt.substring(ii+1);
//						
					}
				}

				 String[] temp = sss.split(" ");

				for(int x = 0; x < temp.length-1; x++){
//					ArrayList<Integer> arrr= new ArrayList<Integer>();
//					arrr.add(Integer.parseInt(temp[x]));
//					
//					for(int y = arrr.get(x); y > 0; y--){
//						arrr.set(x, arrr.get(x)-1);
//						
//					}
//					
//					
					
					
					
					
					
					
					
					String str="";
					for(int yu=0;yu<x+1;yu++){
						str=str+temp[yu]+" ";
					}
					str=str.trim();
				//	System.out.println(str);
					int last = Integer.parseInt(temp[x+1]);
//					System.out.println(last);
					String prefix = sss.substring(0, str.length())+" ";
//					System.out.println("p :"+prefix);
					for(int y = last; y > 0; y--){
						String id = prefix + y;
//						System.out.println(id);
						if(!family.contains(id)){
							family.add(id);
				
							
						}
					}
				}
				
//				look(temp, fam,temp.length);
				
			}
			
			System.out.println(family.size()%1000000007+1);
		}
		
	}
	
//	public static void look(String[] arr, ArrayList<ArrayList> kk, int L){
//		if()
//		
//		
//	}
}