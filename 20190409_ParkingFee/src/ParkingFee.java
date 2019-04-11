//돈을 입력받아
//최초 30분은 2000원, 10분당 1000원
//주차요금 출력하자
//5-> 2000, 30 -> 2000, 40 -> 3000, 41 -> 4000
public class ParkingFee {
	public static void main(String[] args) {
	//분을 입력하자
		int minutes =52;
		int fee =0 ;
		//<=30 이면, 1500
		if(minutes <=30) {
			fee = 1500;
		} else {
		//아니고, 
		//분-30, 요금+=1500
			minutes = minutes -30;
			fee += 1500;
		//요금+=(분/10)*1000
			fee+= (minutes/10)*1000;
		//분%10!=0 면, 요금+=1000	
			if(minutes%10 !=0) {
				fee+=1000;
			}
		}
		System.out.println("주차요금은 "+fee+"원입니다.");
			
		
		
	}
}
