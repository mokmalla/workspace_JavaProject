import java.util.Random;
import java.util.Scanner;

public class MookJjiBba {
		public static void main(String[] args) {
			boolean winPlayer = false;
			boolean winner = false;
			Scanner sc= new Scanner(System.in);
			String[] pae = {"����","����","��"};
			String[] pae2= {"��","��","��"};
			int result=0;
			while(true) {
				System.out.println("����� �Է��� ������ (1: ����, 2: ����, 3: ��)");
			
			int p =sc.nextInt();
			if(p==0) 
				 break;
			int c = makeComputer();
		    result = compare(p,c);
			System.out.println("����� : "+pae[p-1]+"\t��ǻ�� : "+pae[c-1]);
			if(result==-1) {
				//���� ����� ���� �ֱ�
				winPlayer=false;
				winner=true;
			}
			else if(result ==0) {
			//ó�� ���� �ٽ�
				//���а� ���������� ����, ���ӳ�, ���� ���ڰ� �¸�, ����� �˷�����
				if(winner == true) {
					if(winPlayer == true) 
						System.out.println("�̱�");
					else
						System.out.println("��");
				}
				else {
					//ó������ �ٽ�
				}
			}
			else {
				//���� ����� ���� �ֱ�
				winPlayer=true;
				}
			}
			
			System.out.println();
		}

		private static int compare(int p, int c) {
			//-1; ����ڰ� ��
			//0: ���
			//1: ����ڰ� �̱�
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



