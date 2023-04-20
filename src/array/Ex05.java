package array;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int arr[] = {10, 54, 13, 17, 25, 30};
		Scanner input = new Scanner(System.in);
		String s1;
		System.out.print("짝수, 홀수 입력 : ");
		s1 = input.next();
		for(int n : arr) {
			if(s1.equals("짝수")) {
				if(n % 2 == 0) {
					System.out.println("짝수 : " + n);
				}
			}else if(s1.equals("홀수")) {
				if(n % 2 != 0) {
					System.out.println("홀수 : " + n);
				}
			}else {
				System.out.println("잘못입력");
				break;
			}
		}
	}
}
