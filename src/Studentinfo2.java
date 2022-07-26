
public class Studentinfo2 {
	public static void main(String[] args) {
			Student chulsu = new Student();
			chulsu.name = "김철수";
			chulsu.hakbun = "2022-001";
			chulsu.kor = 90;
			chulsu.eng = 100; 
			chulsu.mat	= 85;
			int total = chulsu.kor+chulsu.eng+chulsu.mat;
			double avg = total / 3.0;
			
					System.out.printf("평균:%2f\n ", avg);
					System.out.printf("총점: %d \n", total);
					System.out.printf(chulsu.name+chulsu.hakbun+chulsu.kor+chulsu.eng+chulsu.mat);
	}
}

class Student{		//객체
	String name;		//멤버,Field
	String hakbun;
	int kor;
	int eng;
	int mat;	
}