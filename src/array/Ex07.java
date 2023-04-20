package array;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		//배열 5개를 만들고 로그인 프로그램을 만드시오
		String[] id = new String[5];
		String[] pwd = new String[5];
		String new_id = null;
		String new_pw = null;
		boolean bool = true;
		int menu = 0;
		int i = 0;

		Scanner scan = new Scanner(System.in);
		while(bool) {
			try {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.println(">>>");
			menu = scan.nextInt();
			}catch(Exception e) {
				System.out.println("다시 입력해주세요");
				scan.nextLine();
			}
			switch(menu) {

			case 1:
				System.out.println("====로그인====");
				System.out.println("아이디 입력하기: ");
				new_id = scan.next();
				System.out.println("비밀번호를 입력해주세요");
				new_pw = scan.next();
				for(i=0; i<id.length; i++) {
					if(new_id.equals(id[i])) {	// 같은아이디와 ,비밀번호를 동시에 검사
						if(new_pw.equals(pwd[i])){
							System.out.println("인증통과");
							break;
						}else {
							System.out.println("비밀번호가 일치하지 않습니다.");
							break;
						}
					}
					
				}
				if(i == id.length) {
					System.out.println("아이디가 존재하지 않습니다.");
				}
				break;

			case 2:
				System.out.println("====회원가입====");
				System.out.println("아이디 입력하기: ");
				new_id = scan.next();
				System.out.println("비밀번호 입력: ");
				new_pw = scan.next();
				for(i=0; i<id.length; i++) { //반복횟수는 id에 저장된 수 만큼
					if(new_id.equals(id[i])) {//모든 id값을 비교함
						System.out.println("동일한 아이디가 존재합니다.");
						break;
					}
					if(id[i] == null) {//id의 모든값이 비었을때 (중복이 아닐때)
						id[i] = new_id;
						pwd[i] = new_pw;
						System.out.println("가입을 축하합니다.");
						break;
					}
					if(i == id.length) {
						System.out.println("더 이상 저장할 공간이 없습니다.");
					}
					break;
				}
			}

			System.out.println("프로그램을 종료합니다.");
			bool = false;
		}
	}
}






