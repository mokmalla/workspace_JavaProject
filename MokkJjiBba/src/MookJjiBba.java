import java.util.Random;
import java.util.Scanner;

public class MookJjiBba {
		public static void main(String[] args) {
			boolean winPlayer = false;
			boolean winner = false;
			Scanner sc= new Scanner(System.in);
			String[] pae = {"가위","바위","보"};
			String[] pae2= {"묵","찌","빠"};
			int result=0;
			while(true) {
				System.out.println("사용자 입력을 말하자 (1: 가위, 2: 바위, 3: 보)");
			
			int p =sc.nextInt();
			if(p==0) 
				 break;
			int c = makeComputer();
		    result = compare(p,c);
			System.out.println("사용자 : "+pae[p-1]+"\t컴퓨터 : "+pae[c-1]);
			if(result==-1) {
				//이전 결과를 갖고 있기
				winPlayer=false;
				winner=true;
			}
			else if(result ==0) {
			//처음 비기면 다시
				//승패가 갈린다음에 비기면, 게임끝, 이전 승자가 승리, 결과를 알려주자
				if(winner == true) {
					if(winPlayer == true) 
						System.out.println("이김");
					else
						System.out.println("짐");
				}
				else {
					//처음비기면 다시
				}
			}
			else {
				//이전 결과를 갖고 있기
				winPlayer=true;
				}
			}
			
			System.out.println();
		}

		private static int compare(int p, int c) {
			//-1; 사용자가 짐
			//0: 비김
			//1: 사용자가 이김
			int result=0;
			if( (p+1)%3 ==c % 3) {
				result=1;
			}
			else if(p==c) {
				result=0;
			}
			else{
				result=-1;
			}
			
			return result;
		}

		private static int makeComputer() {
			Random random = new Random();
			int c= random.nextInt(3-1+1)+1;
			return c;
		}
		}



