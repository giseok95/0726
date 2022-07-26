/*
 *누가 
 *언제
 *목적
 *작성환경(os,jdk version,editor) ex) Window10, Open Jdk11.0.16, Eclipse 2022-6
 */
import java.util.Scanner;

public class Studentinfo {
	public static void main(String[] args) {//프로그램의 시작 끝
		Scanner sc = new Scanner(System.in);
			
		System.out.print("학생 이름 :");
		String name = sc.nextLine(); 
		
		System.out.print("학번 :");
		String hakbun = sc.nextLine();

		System.out.print("주소 :");
		String address = sc.nextLine();
		
		System.out.println("이름:"+name);
		System.out.println("학번:"+hakbun);
		System.out.println("주소:"+address);
		
	}
}
