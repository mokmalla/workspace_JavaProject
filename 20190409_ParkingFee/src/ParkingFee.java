//���� �Է¹޾�
//���� 30���� 2000��, 10�д� 1000��
//������� �������
//5-> 2000, 30 -> 2000, 40 -> 3000, 41 -> 4000
public class ParkingFee {
	public static void main(String[] args) {
	//���� �Է�����
		int minutes =52;
		int fee =0 ;
		//<=30 �̸�, 1500
		if(minutes <=30) {
			fee = 1500;
		} else {
		//�ƴϰ�, 
		//��-30, ���+=1500
			minutes = minutes -30;
			fee += 1500;
		//���+=(��/10)*1000
			fee+= (minutes/10)*1000;
		//��%10!=0 ��, ���+=1000	
			if(minutes%10 !=0) {
				fee+=1000;
			}
		}
		System.out.println("��������� "+fee+"���Դϴ�.");
			
		
		
	}
}
