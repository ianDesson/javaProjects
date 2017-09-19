import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Pr3Main {

	static double[] coor;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in= new BufferedReader(new FileReader("DATA31.txt"));
		StringTokenizer st;
		
		for (int k = 0; k < 10; k++) {
			st = new StringTokenizer(in.readLine());
			int mountNum = Integer.parseInt(st.nextToken());
			coor = new double[mountNum];
			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < mountNum; i++) {
				coor[i] = Integer.parseInt(st.nextToken());
			}
			int maxnum = 0;
			int ans = 0;
			double ind = 0;
			double m = 0;
			double b = 0;
			int num = 0;
			for (double c = 0; c < mountNum; c++) {
				ind = 0;
				while (ind < mountNum) {
					if (ind == c) {
						ind++;
					} else {
						m = (coor[(int) c] - coor[(int) ind]) / (c - ind);
						b = coor[(int) c] - m * c;
						if (touch(m, b, ind, c)) {
							num++;
						}
						ind++;
					}

				}
				if (num > maxnum) {
					ans = (int) c;
					maxnum = num;
				}
				num = 0;

			}
			System.out.println((int) (ans + 1));
		}
		
	}
	
	public static boolean touch(double m, double b, double ind, double c){
		if(Math.abs(ind-c)==1){
			return true;
		}
		int xs=(int)Math.min(ind, c);
		int xf=(int)Math.max(ind, c);
		
		
		for(int i=(xs+1);i<xf;i++){
			
			double y= (i*m)+b;
			if(coor[i]>=y){
				return false;
			}
			
		}
		
		return true;
		
	}

}
