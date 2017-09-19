import java.io.*;
import java.util.*;
public class Pr1 {
	static int num=0;
	static ArrayList<Integer> arr= new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader in= new BufferedReader(new FileReader("DATA41.txt"));
		StringTokenizer st;
		
		
		for(int cases=0;cases<10;cases++){
			num=Integer.parseInt(in.readLine());
			arr= new ArrayList<Integer>();
			for(int i=0;i<num;i++){
				arr.add(i);
				
			}
			ArrayList<Integer> temp= (ArrayList<Integer>) arr.clone();
			ArrayList<Integer> temp2=new ArrayList<Integer>();
			int total=0;
			for(int i=0;i<num;i++){
				total+=per(temp,i,temp2);
			}
			
			System.out.println(total);
			
			
			
		}
		
		
		
		
		
	}
	
	
	public static int per(ArrayList<Integer>  th,int k, ArrayList<Integer>  str){
		int total=0;
		str.add(th.get(k));
		th.remove(k);
		if(th.size()==0){
			for(int pp=1;pp<str.size();pp++){
				if(pp%2==0){
					if(str.get(pp)<str.get(pp-1)){
						
					}else{
						return 0;
					}
				}else{
					if(str.get(pp)>str.get(pp-1)){
						
					}else{
						return 0;
					}
				}
				
			}
		}else{
			for(int i=0;i<th.size();i++){
				
				total+=per(th, i, str);
				
			}
		}
		
		
		return total;
	}

}
