import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		

		for(int a=sc.nextInt();a<10;a++) {
				for(int b=1;b<10;b++) {
					System.out.println(a+" x "+b+" = "+a*b);
				}
		}
	}
}
