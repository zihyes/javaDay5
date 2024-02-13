package day05_array;

public class Ex02 {

	public static void main(String[] args) {
		double dos[] = new double[] {1.111, 2.222, 3.333}; // 대괄호는 앞 뒤 상관 없음, 배열을 생성하자마자 특정값으로 초기화하겠다.
		System.out.println( dos[0]);
		
		System.out.println( dos.length );
		for( int i = 0; i < 3; i++) {
			System.out.println(i + "." + dos[i]);
		}
	}

}
