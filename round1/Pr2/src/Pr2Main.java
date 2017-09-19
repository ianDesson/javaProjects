import java.io.*;
import java.util.*;

public class Pr2Main {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		BufferedReader in= new BufferedReader(new FileReader("DATA21.txt"));
		ArrayList<String> winners = new ArrayList<String>();
		ArrayList<String> input= new ArrayList<String>();
		String mistake="";
		for (int i = 0; i < 10; i++) {
			
			
			mistake="";
			int chocolates = Integer.parseInt(in.readLine());
			int tp = -1; int tf = -1; int tg = -1;
			int most = 0;
			int[][] gg=new int[chocolates][4];
			String[] nameArr= new String[chocolates];
			for (int c = 0; c < chocolates; c++) {
				
				int p = 0;
				int f = 0;
				int g = 0;
				String name;
				if(mistake.length()==0){
					
					name = in.readLine();
				}else{
					name= mistake;
					mistake="";
				}
				
				String[] str;
				loop:
				do{
					str = in.readLine().split(" ");
					if(!str[0].equals("J")){
						mistake=str[0];
						break loop;
						
					}
			//		System.out.println(str[0]);
					p += Integer.parseInt(str[1]);
					f += Integer.parseInt(str[2]);
					g += Integer.parseInt(str[3]);
				}while(str[0].equals("J"));
				//System.out.println(p+f+g);
				
				gg[c][0]=c;
				gg[c][1]=p;
				gg[c][2]=f;
				gg[c][3]=g;
				nameArr[c]=name;
				
				
//				
//				if (p + f + g > most) {
//					winners.clear();
//					most = p + f + g;
//					winners.add(name);
//					tp=p;
//					tf=f;
//					tg=g;
//				} else if (p + f + g == most) {
//					if (g > tg) {
//						winners.clear();
//						winners.add(name);
//						tp=p;
//						tf=f;
//						tg=g;
//						
//					} else if (f > tf) {
//						winners.clear();
//						winners.add(name);
//						tp=p;
//						tf=f;
//						tg=g;
//					} else if (p > tp) {
//						winners.clear();
//						winners.add(name);
//						tp=p;
//						tf=f;
//						tg=g;
//					} else if (g == tg && f == tf && p == tp) {
//						winners.add(name);
//					}
//				}
			}
			
//			for(int[] kk: gg){
//				System.out.println(kk[0]+" "+kk[1]+" "+kk[2]+" "+kk[3]);
//			}
			
			Arrays.sort(gg,new Comparator<int[]>(){
				@Override
				public int compare(int[] a, int[] b) {
					// TODO Auto-generated method stub
					return Integer.compare(a[3], b[3]);
				}
			});
//			for(int[] kk: gg){
//				System.out.println(kk[0]+" "+kk[1]+" "+kk[2]+" "+kk[3]);
//			}
			int tie=0;
			int top=gg[gg.length-1][3];
			loop:
			for(int k=gg.length-1;k>=0;k--){
				if(gg[k][3]==top){
					tie++;
				}else{
					break loop;
				}
			}
			if(tie==1){
				winners.add(nameArr[gg[gg.length-1][0]]);
				
			}else{
				
				int[][]left= new int[tie][4];
				int b=0;
				for(int k=gg.length-tie;k<gg.length;k++){
					left[b]=gg[k];
					b++;
				}
				Arrays.sort(left,new Comparator<int[]>(){
					@Override
					public int compare(int[] a, int[] b) {
						// TODO Auto-generated method stub
						return Integer.compare(a[2], b[2]);
					}
				});
				tie=0;
				top=left[left.length-1][2];
				loop:
					for(int k=left.length-1;k>=0;k--){
						if(left[k][2]==top){
							tie++;
						}else{
							break loop;
						}
					}
				if(tie==1){
					winners.add(nameArr[left[left.length-1][0]]);
				}else{
					gg= new int[tie][4];
					b=0;
					for(int k=left.length-tie;k<left.length;k++){
						gg[b]=left[k];
						b++;
					}
					b=0;
					
					Arrays.sort(gg,new Comparator<int[]>(){
						@Override
						public int compare(int[] a, int[] b) {
							// TODO Auto-generated method stub
							return Integer.compare(a[1], b[1]);
						}
					});
					tie=0;
					top=gg[gg.length-1][1];
					loop:
						for(int k=gg.length-1;k>=0;k--){
							if(gg[k][1]==top){
								tie++;
							}else{
								break loop;
							}
						}
					if(tie==1){
						winners.add(nameArr[gg[gg.length-1][0]]);
						
					}else{
						left= new int[tie][4];
						b=0;
						for(int k=gg.length-tie;k<gg.length;k++){
							left[b]=gg[k];
							b++;
						}
						for(int k=0;k<left.length;k++){
							winners.add(nameArr[left[k][0]]);
						}
					}
					}
					
				
				
				
				
			}
			
			
			
			
			System.out.println(winners.toString().substring(1,winners.toString().length()-1));
			winners.clear();
		}

	}

}
