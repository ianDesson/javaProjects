import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Pr3 {

	static String[][] map;
	static int key=0;
	static int tre=0;
	static ArrayList<int[] > door= new ArrayList<int[]>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader in= new BufferedReader(new FileReader("DATA21.txt"));
		StringTokenizer st;
		for(int cases=0;cases<10;cases++){
			tre=0;
			key=0;
			door=new ArrayList<int[]>();
			int[] sp = new int[2];
			int[] cp= new int [2];
			int n = Integer.parseInt(in.readLine());
			map=new String[n][n];
			for(int i=0;i<n;i++){
				String str=in.readLine();
				map[i]=str.split("");
				if(str.contains("S")){
					sp[0]=i;
					sp[1]=str.indexOf("S");
					map[sp[0]][sp[1]]="/";
				}
			}
			cp[0]=sp[0];
			cp[1]=sp[1];
			scan(cp[0],cp[1]);

			
			
			scan2(cp[0],cp[1]);
			System.out.println(tre);
			
			
			
		}
		
		
	}
	
	static public void scan(int x, int y){
		int posx=0;
		int posy=0;
		try{
			//ledft
			
			posx=x;
			posy=y-1;
			if(!(map[posx][posy].equals("#")||map[posx][posy].equals("/"))){
				if(map[posx][posy].equals(".")){
					map[posx][posy]="/";
					scan(posx,posy);
				}else if(map[posx][posy].equals("K")){
					key++;
					map[posx][posy]="/";
					scan(posx,posy);
					getkey();
				}else if(map[posx][posy].equals("T")){
					tre++;
					map[posx][posy]="/";
					scan(posx,posy);
				}else {
					if(Integer.parseInt(map[posx][posy])<=key){
						map[posx][posy]="/";
						scan(posx,posy);
					}else{
						
						int[] arr={posx,posy,Integer.parseInt(map[posx][posy])};
						door.add(arr);
					}
				}
			} 
			
		}catch(IndexOutOfBoundsException e){
			
		}
		try{
			//up
			posx=x-1;
			posy=y;
			if(!(map[posx][posy].equals("#")||map[posx][posy].equals("/"))){
				if(map[posx][posy].equals(".")){
					map[posx][posy]="/";
					scan(posx,posy);
				}else if(map[posx][posy].equals("K")){
					key++;
					map[posx][posy]="/";
					scan(posx,posy);
					getkey();
				}else if(map[posx][posy].equals("T")){
					tre++;
					map[posx][posy]="/";
					scan(posx,posy);
				}else{
					if(Integer.parseInt(map[posx][posy])<=key){
						map[posx][posy]="/";
						scan(posx,posy);
					}else{
						int[] arr={posx,posy,Integer.parseInt(map[posx][posy])};
						door.add(arr);
						
					}
				}
			}
			
		}catch(IndexOutOfBoundsException e){
			
		}
		try{
			//right
			posx=x;
			posy=y+1;
			
			if(!(map[posx][posy].equals("#")||map[posx][posy].equals("/"))){
				if(map[posx][posy].equals(".")){
					map[posx][posy]="/";
					scan(posx,posy);
				}else if(map[posx][posy].equals("K")){
					key++;
					map[posx][posy]="/";
					scan(posx,posy);
					getkey();
				}else if(map[posx][posy].equals("T")){
					tre++;
					map[posx][posy]="/";
					scan(posx,posy);
				}else{
					if(Integer.parseInt(map[posx][posy])<=key){
						map[posx][posy]="/";
						scan(posx,posy);
					}else{
						int[] arr={posx,posy,Integer.parseInt(map[posx][posy])};
						door.add(arr);
						
					}
				}
			}

		}catch(IndexOutOfBoundsException e){
			
		}
		try{
			//down
			posx=x+1;
			posy=y;
			if(!(map[posx][posy].equals("#")||map[posx][posy].equals("/"))){
				 if(map[posx][posy].equals(".")){
						map[posx][posy]="/";
						scan(posx,posy);
					}else if(map[posx][posy].equals("K")){
						key++;
						map[posx][posy]="/";
						scan(posx,posy);
						getkey();
					}else if(map[posx][posy].equals("T")){
						tre++;
						map[posx][posy]="/";
						scan(posx,posy);
						
					}else{
						if(Integer.parseInt(map[posx][posy])<=key){
							map[posx][posy]="/";
							scan(posx,posy);
						}else{
							int[] arr={posx,posy,Integer.parseInt(map[posx][posy])};
							door.add(arr);
							
						}
					}
			}

		}catch(IndexOutOfBoundsException e){

		}


	}
	
	static public void getkey(){
		for(int i=0;i<door.size();i++){
			int[] temp= door.get(i).clone();
			if(temp[2]<=key){
				map[temp[0]][temp[1]]="/";
				door.remove(i);
				scan(temp[0],temp[1]);
				
			}
		}
		
	}
	
	static public void scan2(int x, int y){
		int posx=0;
		int posy=0;
		try{
			//ledft
			
			posx=x;
			posy=y-1;
			if(!(map[posx][posy].equals("#"))){
				if(map[posx][posy].equals(".")){
					map[posx][posy]="/";
					scan(posx,posy);
				}else if(map[posx][posy].equals("K")){
					key++;
					map[posx][posy]="/";
					scan(posx,posy);
					getkey();
				}else if(map[posx][posy].equals("T")){
					tre++;
					map[posx][posy]="/";
					scan(posx,posy);
				}else if(!(map[posx][posy].equals("/"))){
					if(Integer.parseInt(map[posx][posy])<=key){
						map[posx][posy]="/";
						scan(posx,posy);
					}else{
						
						int[] arr={posx,posy,Integer.parseInt(map[posx][posy])};
						door.add(arr);
					}
				}
			} 
			
		}catch(IndexOutOfBoundsException e){
			
		}
		try{
			//up
			posx=x-1;
			posy=y;
			if(!(map[posx][posy].equals("#"))){
				if(map[posx][posy].equals(".")){
					map[posx][posy]="/";
					scan(posx,posy);
				}else if(map[posx][posy].equals("K")){
					key++;
					map[posx][posy]="/";
					scan(posx,posy);
					getkey();
				}else if(map[posx][posy].equals("T")){
					tre++;
					map[posx][posy]="/";
					scan(posx,posy);
				}else if(!(map[posx][posy].equals("/"))){
					if(Integer.parseInt(map[posx][posy])<=key){
						map[posx][posy]="/";
						scan(posx,posy);
					}else{
						int[] arr={posx,posy,Integer.parseInt(map[posx][posy])};
						door.add(arr);
						
					}
				}
			}
			
		}catch(IndexOutOfBoundsException e){
			
		}
		try{
			//right
			posx=x;
			posy=y+1;
			
			if(!(map[posx][posy].equals("#"))){
				if(map[posx][posy].equals(".")){
					map[posx][posy]="/";
					scan(posx,posy);
				}else if(map[posx][posy].equals("K")){
					key++;
					map[posx][posy]="/";
					scan(posx,posy);
					getkey();
				}else if(map[posx][posy].equals("T")){
					tre++;
					map[posx][posy]="/";
					scan(posx,posy);
				}else if(!(map[posx][posy].equals("/"))){
					if(Integer.parseInt(map[posx][posy])<=key){
						map[posx][posy]="/";
						scan(posx,posy);
					}else{
						int[] arr={posx,posy,Integer.parseInt(map[posx][posy])};
						door.add(arr);
						
					}
				}
			}

		}catch(IndexOutOfBoundsException e){
			
		}
		try{
			//down
			posx=x+1;
			posy=y;
			if(!(map[posx][posy].equals("#"))){
				 if(map[posx][posy].equals(".")){
						map[posx][posy]="/";
						scan(posx,posy);
					}else if(map[posx][posy].equals("K")){
						key++;
						map[posx][posy]="/";
						scan(posx,posy);
						getkey();
					}else if(map[posx][posy].equals("T")){
						tre++;
						map[posx][posy]="/";
						scan(posx,posy);
					}else if(!(map[posx][posy].equals("/"))){
						if(Integer.parseInt(map[posx][posy])<=key){
							map[posx][posy]="/";
							scan(posx,posy);
						}else{
							int[] arr={posx,posy,Integer.parseInt(map[posx][posy])};
							door.add(arr);
							
						}
					}
			}

		}catch(IndexOutOfBoundsException e){

		}


	}


}
