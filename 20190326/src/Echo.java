import java.util.Scanner;

public class Echo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String Echo;
	while(true) {
		Echo = sc.nextLine();
		System.out.println(Echo);
		if(Echo.equals("exit")) {
			System.out.println("¾È³ç, Àß°¡"); break;
		}
	}
}
}
