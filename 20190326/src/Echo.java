import java.util.Scanner;

public class Echo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String inputString;
	String Echo;
	while(true) {
		System.out.println("아무말이나 하시오.");
		Echo = sc.nextLine();
		System.out.println(Echo);
		if(Echo.equals("exit")) {
			System.out.println("끝"); break;
		}
	}
}
}
