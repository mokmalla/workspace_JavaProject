import java.util.Random;
import java.util.Scanner;

public class UpDownBot {
	public static void main(String[] args) {
		int start =0;
		int end = 99;
		  Scanner sc=new Scanner(System.in);
		  
		  Random random = new Random();
		  while(true) {
		  int rNumber = random.nextInt(end-start)/2+start; 
		  System.out.println(rNumber+ " 입니까?");
		  
			  String answer = sc.nextLine();
			  if(answer.equals("down")) {
				  end=rNumber-1;
			  }
			  
			  else if(answer.equals("up")) {
				  start=rNumber+1;
				  
			  }
			  
			  else if(answer.equals("정답")) {
				 System.out.println("ㅋㅋ"); break;
			 }
				  
		  }
	}
}
