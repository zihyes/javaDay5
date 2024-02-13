package day05_array;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		String[] str = new String[3]; //최초로 이 공간에는 null로 초기화
		System.out.println(str.length);
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < str.length; i++) {
			System.out.println(i +".번쨰 입력");
			str[i] = input.next();
		}
		System.out.println("--- 출력 ---");
		for(int i = 0; i < str.length; i++) {
			System.out.println(i + "." + str[i]);
		}
	}

}
