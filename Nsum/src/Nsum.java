import java.util.Scanner;

public class Nsum {
  public static void main(String[] args) {
	//숫자 String으로 입력 받자 <= 자릿수를 알기 위해서 <= 0~자릿수 -1까지 하나씩 잘라서 더해야함
	  Scanner sc=new Scanner(System.in);
	  String number= sc.nextLine();
	  nSum(number);
	  
}

private static void nSum(String number) {
	//각 자릿수의 수를 더하자
	  int length = number.length();
	  int sum = 0;
	  for(int i=0; i< length; i++) {
	  //0~자릿수 -1까지 반복하자
	  // 한글자씩 가져와서 숫자로 바꾸자
		  char n = number.charAt(i);
		
		  sum+=n - '0';
	  //sum에 더하자
	  //더한 값을 출력하자
	  }
	  System.out.println(sum);
}
}
