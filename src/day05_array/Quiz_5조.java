package day05_array;

import java.util.Scanner;

public class Quiz_5조 {

	public static void main(String[] args) {
//		1)6개의 서로 다른 자연수를 배열로 입력하고, 이들 중 최댓값을 찾고 그 최댓값이 몇번째 수 인지 구하는 프로그램 작성
//
//			자연수를 입력하지 않을 경우 "다시 입력하세요" - 해당 수만 다시 입력하도록 함
//			자연수는 1번째 부터 6번째까지 있음
//			
//			----------------------------
//			1번째 수 입력 : 0
//			다시 입력하세요 : 0
//			다시 입력하세요 : 12
//			2번째 수 입력 : 99
//			3번째 수 입력 : 25
//			4번째 수 입력 : -7
//			다시 입력하세요 : 7
//			5번째 수 입력 : 56
//			6번째 수 입력 : 100
//			
//			12 99 25 7 56 100 
//			
//			해당 배열의 최댓값은 6번째 수인 100 입니다. 
//			-----------------------------
		Scanner input = new Scanner(System.in);
		int arr[] = new int[6];
		int cnt = 1;
		int num = 0;
		for(int i = 1; i <7; i++) {
		System.out.print(cnt + "번째 수 입력: ");
		num = input.nextInt();
			if(num <= 0) {
			System.out.print("다시 입력하세요: ");
			num = input.nextInt();
		}
			cnt++;
		}
		
		
		
//		Q2)
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 배열에 초기화 후 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//
//		ex. 5 3 2 7 4 8 6 10 9 10
//		최대값 : 10
//		최소값 : 2
		
//		int arr[] = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			int random = (int)(Math.random() * 10 + 1);
//			arr[i] = random;
//		}
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}if(arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
		
		
//		Q3)up&down 게임 만들기
//		Random 숫자 값을 설정하고 해당 숫자 값을 맞추는 게임을 제작하시오
//		입력 숫자가 정답숫자보다 높으면 "UP"/ 낮으면"Down"
//		랜덤 정수 구하는식 => (int)(Math.random()*50+1);
//		예시)
//		======Up & Down======
//		1. 게임 시작
//		2. 기록 확인
//		3. 게임 종료
//		번호를 선택하시오 >> 1
//		========Start=========
//		50
//		정답 입력 : 25
//		Up
//		정답 입력 : 70
//		Down
//		정답 입력 : 50
//		정답!!
//		====================
//		1. 게임 시작
//		2. 기록 확인
//		3. 게임 종료
//		번호를 선택하시오 >> 2
	}

}
