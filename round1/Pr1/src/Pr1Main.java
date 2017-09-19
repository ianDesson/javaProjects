import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pr1Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in= new BufferedReader(new FileReader("DATA11.txt"));
		StringTokenizer st;
		
		for (int k = 0; k < 10; k++) {
			st = new StringTokenizer(in.readLine());
			int cost = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine());
			double[] percent = new double[4];
			for (int i = 0; i < 4; i++) {
				percent[i] = Double.parseDouble(st.nextToken());
			}
			st = new StringTokenizer(in.readLine());
			double totalStudent = Double.parseDouble(st.nextToken());
			int student[] = new int[4];
			for (int i = 0; i < 4; i++) {
				student[i] = (int) (percent[i] * totalStudent);
			}
			int max = 0;
			double[] temp = new double[4];
			for (int i = 0; i < 4; i++) {
				temp[i] = percent[i];
			}
			Arrays.sort(percent);
			int temp2 = 0;
			for (int i = 0; i < 4; i++) {
				if (temp[3] == percent[i]) {
					temp2 = i;
				}

			}
			int temp3 = 0;
			for (int i = 0; i < 4; i++) {
				totalStudent -= student[i];
			}
			student[temp2] += totalStudent;
			double totalMon = 12 * student[0] + 10 * student[1] + 7 * student[2] + 5 * student[3];
			if (totalMon / 2 >= cost) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			} 
		}
		
		
	}

}
