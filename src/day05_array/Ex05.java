package day05_array;

public class Ex05 {

	public static void main(String[] args) {
		int arr[][] = new int[][] {
			{10, 20, 30, 3},
//			 0,0 0,1 0,2
			{40, 50, 60, 4},
//			 1.0 1,1 1,2
			{70, 80, 90, 5}
//			 2,0 2,1 2,2
		};
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
		System.out.println(arr.length); //세로가 몇개?
		System.out.println(arr[0].length); //인덱스가 들어오면 가로줄, 0번쨰 줄에는 몇개?4개
		System.out.println("===============");
		for(int i=0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				System.out.print(arr[i][k]+ " ");
			}
			/*
			System.out.println( arr[i][0] ); // 배열의 정보 출력(저장되는 위치에 대한 정보)
			System.out.println( arr[i][1] );
			System.out.println( arr[i][2] );
			System.out.println( arr[i][3] );
			*/
			System.out.println("-------------");
		}
	}

}
