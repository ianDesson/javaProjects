package multipleChoice;
import java.util.*;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		String ans="";
		double score=0;
		boolean err=true;
		System.out.println("Welcome to the quiz about stuff!");
		System.out.print("Would you like to begin?");
		System.out.println("(Type (yes) or (no)");
		ans=in.nextLine();
		if(ans.equalsIgnoreCase("yes")){
			System.out.println("Good! Let's begin.");
		}else{
			System.out.println("You're no fun...");
			System.exit(0);
		}

		do{
			try{
				System.out.println("What continent is Canada in? \n(Please type the corresponding letter for each response)");
				System.out.println("a) Africa b) North America c) Europe d) Asia");
				ans=in.nextLine();
				System.out.println("\n");
				if(ans.equalsIgnoreCase("b")){
					score++;
					err=false;
				}else if(ans.equalsIgnoreCase("a")){
					err=false;
				}else if(ans.equalsIgnoreCase("c")){
					err=false;
				}else if(ans.equalsIgnoreCase("d")){
					err=false;
				}
			}catch (Exception e){
				System.out.println("Please enter a letter!");
			}

		}while (err);
		err=true;
		do{
			try{
				System.out.println("Who was a co-founder of Apple?");
				System.out.println("a) Steve Jobs b) Bill Gates c) Martin Shkrelli d) Kenny Schrub");
				ans=in.nextLine();
				if(ans.equalsIgnoreCase("a")){
					score++;
					err=false;
					System.out.println("\n");
				}else if(ans.equalsIgnoreCase("b")){
					err=false;
				}else if(ans.equalsIgnoreCase("c")){
					err=false;
				}else if(ans.equalsIgnoreCase("d")){
					err=false;
				}
				
			}catch (InputMismatchException e){
				System.out.println("Please enter a letter!");
			}

		}while (err);
		err=true;

		do{
			try{
				System.out.println("Who is the current Prime Minister of Canada?(2016)");
				System.out.println("a) Bill Gates b) Barack Obama c) Justin Trudeau d) John A. Macdonald");
				ans=in.nextLine();
				if(ans.equalsIgnoreCase("c")){
					score++;
					err=false;
					System.out.println("\n");
				}else if(ans.equalsIgnoreCase("d")){
					err=false;
				}else if(ans.equalsIgnoreCase("b")){
					err=false;
				}else if(ans.equalsIgnoreCase("a")){
					err=false;
				}
			}catch (InputMismatchException e){
				System.out.println("Please enter a letter!");
			}

		}while (err);
		err=true;

		do{
			try{
				System.out.println("What operating system are our school computers using?");
				System.out.println("a) Windows b) Mac c) Linux d) What is an operating system?");
				ans=in.nextLine();
				if(ans.equalsIgnoreCase("a")){
					score++;
					err=false;
					System.out.println("\n");
				}else if(ans.equalsIgnoreCase("d")){
					System.out.println("An operating system is the software that manages your computer's hardware. \n It also enables certain services to run.");
					err=false;
				}else if(ans.equalsIgnoreCase("b")){
					err=false;
				}else if(ans.equalsIgnoreCase("c")){
					err=false;
				}
			}catch (InputMismatchException e){
				System.out.println("Please enter a letter!");
			}
		}while (err);
		err=true;

		do{
			try{
				System.out.println("How much electricity did Canadians use in 2010?");
				System.out.println("a) ~100 million kWH b) ~500 million kWH c) ~50 billion kWH d) ~500 billion kWH");
				ans=in.nextLine();
				if(ans.equalsIgnoreCase("d")){
					score++;
					err=false;
					System.out.println("\n");
				}else if(ans.equalsIgnoreCase("a")){
					err=false;
				}else if(ans.equalsIgnoreCase("b")){
					err=false;
				}else if(ans.equalsIgnoreCase("c")){
					err=false;
				}
			}catch (InputMismatchException e){
				System.out.println("Please enter a letter!");
			}

		}while (err);
		err=true;

		do{
			try{
				System.out.println("What company made the monitor that this quiz was created on?");
				System.out.println("a) Asus b) Intel c) Dell d) Linux");
				ans=in.nextLine();
				if(ans.equalsIgnoreCase("c")){
					score++;
					err=false;
					System.out.println("\n");
				}else if(ans.equalsIgnoreCase("a")){
					err=false;
				}else if(ans.equalsIgnoreCase("b")){
					err=false;
				}else if(ans.equalsIgnoreCase("d")){
					err=false;
				}
			}catch (InputMismatchException e){
				System.out.println("Please enter a letter!");
			}

		}while (err);
		err=true;

		do{
			try{
				System.out.println("Who designs Android?");
				System.out.println("a) Apple b) Microsoft c) Google d) Intel");
				ans=in.nextLine();
				if(ans.equalsIgnoreCase("c")){
					score++;
					err=false;
					System.out.println("\n");
				}else if(ans.equalsIgnoreCase("a")){
					err=false;
				}else if(ans.equalsIgnoreCase("b")){
					err=false;
				}else if(ans.equalsIgnoreCase("d")){
					err=false;
				}
			}catch (InputMismatchException e){
				System.out.println("Please enter a letter!");
			}

		}while (err);
		err=true;

		do{
			try{
				System.out.println("How many Gigabytes are one Terabyte?");
				System.out.println("a) 124 GB b) 1,024 GB c) 1,000 GB d) 100 GB");
				ans=in.nextLine();
				if(ans.equalsIgnoreCase("c")){
					score++;
					err=false;
					System.out.println("\n");
				}else if(ans.equalsIgnoreCase("a")){
					err=false;
				}else if(ans.equalsIgnoreCase("b")){
					err=false;
				}else if(ans.equalsIgnoreCase("d")){
					err=false;
				}
			}catch (InputMismatchException e){
				System.out.println("Please enter a letter!");
			}

		}while (err);
		err=true;

		do{
			try{
				System.out.println("What colour is the exit sign in Mr. Zebarth's classroom?");
				System.out.println("a) Red b) Blue c) Yellow d) I am colour blind");
				ans=in.nextLine();
				if(ans.equalsIgnoreCase("a")){
					score++;
					err=false;
					System.out.println("\n");
				}else if(ans.equalsIgnoreCase("d")){
					System.out.println("Sorry, I didn't know. Have half a point.");
					score+=0.5;
				}else if(ans.equalsIgnoreCase("c")){
					err=false;
				}else if(ans.equalsIgnoreCase("b")){
					err=false;
				}
			}catch (InputMismatchException e){
				System.out.println("Please enter a letter!");
			}

		}while (err);
		err=true;

		do{
			try{
				System.out.println("If Greg has 10 Watermelons in his car, and loses 3 on the way back home due to a robbery.\nWhat is the mass of the sun?");
				System.out.println("a)2.764x10^30 g b) 1.989x10^30 kg c) 3.00x10^8 kg d) 1 million kg");
				ans=in.nextLine();
				if(ans.equalsIgnoreCase("b")){
					score++;
					err=false;
					System.out.println("\n");
				}else if(ans.equalsIgnoreCase("a")){
					err=false;
				}else if(ans.equalsIgnoreCase("c")){
					err=false;
				}else if(ans.equalsIgnoreCase("d")){
					err=false;
				}
			}catch (InputMismatchException e){
				System.out.println("Please enter a letter!");
			}

		}while (err);
		err=true;
		if(score>=5){
			System.out.println("Congratulations! You passed!");
		}else{
			System.out.println("You failed!");
		}
		System.out.println("Your score is "+score);
		System.out.println("You got "+(score/10)*100+"%");
	}
}