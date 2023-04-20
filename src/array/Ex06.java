package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] id = new String[5];
		String[] pwd = new String[5];
		int num = 0;
		String idCheck = null;
		String pwdCheck = null;
		int j = 0;
		
		/*
		 * id[0] = "1111"; if( id[1] != null) { System.out.println("존재"); }else {
		 * System.out.println("없음"); }
		 */
		while(true) {
			
				try {
					System.out.println("1.로그인");
					System.out.println("2.회원가입");
					System.out.println("3.특정회원 보기");
					System.out.println("4.특정회원 비밀번호 수정");
					System.out.println("5.특정회원 삭제");
					System.out.println("6.모든 회원 보기");
					System.out.println("7.나가기");
					System.out.print(">>>");
					num = input.nextInt();
				}catch(Exception e){
					System.out.println("다시입력해주세요");
					input.nextLine();
				}
			
				switch(num) {
				case 1 :
					System.out.println("로그인");
					System.out.print("아이디 입력 : ");
					idCheck = input.next();
					System.out.print("비밀번호 입력 : ");
					pwdCheck = input.next();
					j = 0;
					while(id.length > j) {
						if(idCheck.equals(id[j])) {
							if(pwdCheck.equals(pwd[j])) {
								System.out.println("인증통과");
								break;
							}else {
								System.out.println("비밀번호가 틀렸습니다.");
								break;
							}
						}
						j++;
					}
					if(j == id.length) {
						System.out.println("아이디가 존재하지 않습니다.");
					}
					break;
				case 2 :
					System.out.println("회원가입");
					System.out.print("아이디 입력 : ");
					idCheck = input.next();
					System.out.print("비밀번호 입력 : ");
					pwdCheck = input.next();
					j = 0;
					while(j < id.length) {
						if(idCheck.equals(id[j])) {
							System.out.println("동일한 아이디가 존재합니다.");
							break;
						}
						if(id[j] == null) {
							id[j] = idCheck;
							pwd[j] = pwdCheck;
							System.out.println("가입을 축하합니다.");
							break;
						}
						j++;
					}
					if(j == id.length) {
						System.out.println("더 이상 저장할 공간이 없습니다.");
					}
					break;
				case 3 : System.out.println("특정회원 보기");
						 System.out.print("아이디 입력 : ");
						 idCheck = input.next();
						 j = 0;
						 while(id.length > j) {
							 if(idCheck.equals(id[j])) {
								 System.out.println((j+1) + ".id : " + id[j] + " pwd : " + pwd[j]);
							 }
							 j++;
							}
						 if(j == id.length) {
								System.out.println("아이디가 존재하지 않습니다.");
							}
							break;
						 
				case 4 : System.out.println("비밀번호 수정");
						 System.out.print("아이디 입력 : ");
						 idCheck = input.next();
						 System.out.print("비밀번호 입력 : ");
						 pwdCheck = input.next();
						 j = 0;
						 while(id.length > j) {
								if(idCheck.equals(id[j])) {
									if(pwdCheck.equals(pwd[j])) {
										System.out.print("수정할 비밀번호 : ");
										pwdCheck = input.next();
										pwd[j] = pwdCheck;
										System.out.println("수정 완료되었습니다.");
									}else {
										System.out.println("비밀번호가 틀렸습니다.");
									}
									break;
								}
								j++;
							}
						 if(j == id.length) {
								System.out.println("아이디가 존재하지 않습니다.");
							}
							break;
				case 5 : System.out.println("회원삭제");
						 System.out.print("삭제할 아이디 입력 : ");
						 idCheck = input.next();
						 System.out.print("비밀번호 입력 : ");
						 pwdCheck = input.next();
						 j = 0;
						 while(id.length > j) {
								if(idCheck.equals(id[j])) {
									if(pwdCheck.equals(pwd[j])) {
										id[j] = null;
										pwd[j] = null;
										System.out.println("삭제되었습니다.");
										break;
									}else {
										System.out.println("비밀번호가 틀렸습니다.");
									}
									break;
								}
								j++;
							}
						 if(j == id.length) {
								System.out.println("아이디가 존재하지 않습니다.");
							}
							break;
				case 6 : System.out.println("회원목록");
						 for(int i = 0; i < id.length; i++) {
							 if(id[0] == null) {
								 System.out.println("회원이 없습니다.");
								 break;
							 }
							 System.out.println((i+1) + ".id : " + id[i] + " pwd : " + pwd[i]);
						 }
						break;
				case 7 : System.out.println("프로그램 종료");	
						 System.exit(1);
			}
			System.out.println("=================================");
		}
	}
}
