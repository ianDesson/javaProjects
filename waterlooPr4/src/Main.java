import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Problem4
		Scanner in=new Scanner(System.in);
		int min=in.nextInt();
		int[] clock ={1,2,0,0};
		int count=0;
		for (int x=0;x<=min;x++){
			//clock
			clock[3]++;
			if(clock[3]==10){
				clock[3]=0;
				clock[2]++;
			}if(clock[2]==6){
				clock[1]++;
				clock[2]=0;
				clock[3]=0;
			}if(clock[0]+clock[1]==4){
				clock[0]=0;
				clock[1]=1;
			}
			//counting
			if(clock[0]==0){
				if((clock[3]-clock[2])==clock[2]-clock[1]){
					count++;
				}
			}else{
				if((clock[3]-clock[2])==(clock[2]-clock[1]) && (clock[2]-clock[1])==(clock[1]-clock[0])){
					count++;
				}
			}
		}
		System.out.println(count);
	}	
}