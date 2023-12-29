
public class test3 {

	public static void main(String[] args) {
		
		for(int a=2;a<=100;a=a+2) {
			System.out.print(a+"\t");
			if(a%10==0) {
				System.out.println();
			}
		} 		System.out.println();

		
		for(int a=3;a<=100;a=a+3) {
			System.out.print(a+"\t");
			if(a%9==0) {
				System.out.println();
			}
		}
		
		for(int a=0;a<=100;a++) {
			if(a%2==0) {
				System.out.println(a);
			} 
		}
	}

}
