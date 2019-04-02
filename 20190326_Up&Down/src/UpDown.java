import java.util.Random;
import java.util.Scanner;

public class UpDown {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  
  Random random = new Random();
  int rNumber = random.nextInt(100);
  
  System.out.println("정수를 입력");
  while(true) {
	  int n = sc.nextInt();
	  if(rNumber<n) {
		  System.out.println("Down");
	  }
	  if(rNumber>n) {
		  System.out.println("Up");
	  }
	  
	 if(n==rNumber) {
		  System.out.println("정답"); break;}
		  
  }
  }
}
