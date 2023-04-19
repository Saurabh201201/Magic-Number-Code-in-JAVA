import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int n=sc.nextInt();
		if(n%9==1){
		    System.out.println(n+" is a Magic Number!");
		}
		else{
		    System.out.println(n+" is not a Magic Number!");
		}
	}
}
