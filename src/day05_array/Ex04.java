package day05_array;

public class Ex04 {

	public static void main(String[] args) {
		int[] arr = new int[] {100, 200, 300};
		double[] dos = {1.11, 2.22, 3.33}; //new없이 바로 초기화도 가능
		String[] str = {"안녕", "하세요"};

//		for(int i=0; i < arr.length; i++) {
//		}
		for( int num : arr) {// arr이 가지고 있는 값을 :앞쪽에 있는 값으로 저장하곘다.
			System.out.println( num );
		}
		for(double dou : dos) {
			System.out.println( dou );
		}
		for(String s : str) {
			System.out.println( s );
		}
	}

}
