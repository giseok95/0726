import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student a = new Student(); 
		
		System.out.printf("학번: ");
		a.hakbun = sc.nextLine();
		System.out.printf("이름: ");
		a.name = sc.nextLine();
		System.out.printf("국어: ");
		a.kor = sc.nextInt();
		System.out.printf("영어: ");
		a.eng = sc.nextInt();
		System.out.printf("수학: ");
		a.mat = sc.nextInt();
		
		int total = a.kor+a.eng+a.mat;
		double avg =total/3;
		
		System.out.printf("학번: %s\n",a.hakbun);
		System.out.printf("이름: %s\n",a.name);
		System.out.printf("국어: %d\n",a.kor);
		System.out.printf("영어: %d\n",a.eng);
		System.out.printf("수학: %d\n",a.mat);
		System.out.printf("총점: %d\n",total);
		System.out.printf("평균: %.2f\n",avg);
	}
}
