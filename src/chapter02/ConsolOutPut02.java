package chapter02;

public class ConsolOutPut02 {
	public static void main(String[] args) {

		System.out.printf("%o : 8진수로 출력 \n", 30);            //36  (8진수)  
		System.out.printf("%x : 16진수로 출력 \n", 30);
		System.out.printf("%s  : 문자열을 불러들임 \n", "화요일 입니다.");
		System.out.printf("%f : 실수 값을 불러들임 \n", 5.8);
		System.out.printf("%4.2f : 실수 불러들임 \n", 5.8);
		
		System.out.printf("당신의 나이는 %d 이고, 몸무게는 %f 입니다 \n", 35,70.5);
		
		System.out.printf("%d , %f, %s \n", 30, 20.55, "오늘"); 
	
	
	}
}
