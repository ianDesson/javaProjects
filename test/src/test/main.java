package test;



		import java.io.*;
		import java.util.*;

		public class main {

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
						
						
						
						if (p + f + g > most) {
							winners.clear();
							most = p + f + g;
							winners.add(name);
							tp=p;
							tf=f;
							tg=g;
						} else if (p + f + g == most) {
							if (g > tg) {
								winners.clear();
								winners.add(name);
								tp=p;
								tf=f;
								tg=g;
								
							} else if (f > tf) {
								winners.clear();
								winners.add(name);
							tp=p;
								tf=f;
								tg=g;
							} else if (p > tp) {
								winners.clear();
								winners.add(name);
								tp=p;
								tf=f;
								tg=g;
							} else if (g == tg && f == tf && p == tp) {
								winners.add(name);
							}
						}
					}
					

						
						
					
					
					
					
					
					System.out.println(winners.toString().substring(1,winners.toString().length()-1));
					winners.clear();
				}

			

		

		
	}

}
