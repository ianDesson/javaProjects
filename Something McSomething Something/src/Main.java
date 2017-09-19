import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		//Introduction
		System.out.println("Welcome to mad libs!");
		
		//Variables(words/numbers)
		System.out.println("Please, type in an adjective!");
		String adj=in.nextLine();
		System.out.println("And type in another adjective!");
		String adj0=in.nextLine();
		System.out.println("Please, type in a noun!");
		String n=in.nextLine();
		System.out.println("And type in another noun!");
		String n0=in.nextLine();
		System.out.println("Please type in a whole number!");
		int num=in.nextInt();
		System.out.println("Please type a living thing (plural)!");
		in.nextLine();
		String n1=in.nextLine();
		System.out.println("Please type in a verb ending in ing!");
		String v=in.nextLine();
		System.out.println("Please type in another verb!");
		String v0=in.nextLine();
		System.out.println("Please type in an emotion!");
		String e=in.nextLine();
		System.out.println("Please type in an adjective!");
		String adj1=in.nextLine();
		System.out.println("Please type in a verb!");
		String v1=in.nextLine();
		System.out.println("Please type in an adjective!");
		String adj2=in.nextLine();
		System.out.println("Please type in a place.");
		String p=in.nextLine();
		
		//The paragraph
		System.out.print("The "+adj+" and "+adj0+" man jumped over the "+n+".");
		System.out.println(" As he ran back to his "+n0+" where the rest of his "+num+" "+n1+" were eating.");
		System.out.print("He was having trouble "+v+" with his "+n1+"!");
		System.out.println(" None of them wanted to "+v0+" with him!");
		System.out.print("This is because they had begun to "+e+" him.");
		System.out.println(" So, the "+adj1+" man decided to "+v1+" his "+adj2+" "+n1+" back to their rightful "+p+".");	
		
	}
}