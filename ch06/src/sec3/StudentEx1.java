package sec3;

public class StudentEx1 {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("김철수");
		st1.setAge(15);
		st1.setPg(90);
		st1.setDb(95);
		st1.setUi(90);
		st1.setTot();
		st1.setAvg();
		Student st2 = new Student();
		st2.setName("김병철");
		st2.setAge(13);
		st2.setPg(70);
		st2.setDb(55);
		st2.setUi(80);
		st2.setTot();
		st2.setAvg();
		Student st3 = new Student();
		st3.setName("김현우");
		st3.setAge(18);
		st3.setPg(95);
		st3.setDb(100);
		st3.setUi(90);
		st3.setTot();
		st3.setAvg();
		Student st4 = new Student();
		st4.setName("김민재");
		st4.setAge(17);
		st4.setPg(100);
		st4.setDb(85);
		st4.setUi(95);
		st4.setTot();
		st4.setAvg();
		
		
		System.out.println("이름 : "+st1.getName()+"\t나이 : "+st1.getAge()+"\t\tpg 점수 : "+st1.getPg()+"\tdb 점수 : "+st1.getDb()+"\tui 점수 : "+st1.getUi()+"\n총점 : "+st1.getTot()+"\t\t평균 : "+st1.getAvg()+"\t학점 : "+st1.getHak());
		System.out.println("\n이름 : "+st2.getName()+"\t나이 : "+st2.getAge()+"\t\tpg 점수 : "+st2.getPg()+"\tdb 점수 : "+st2.getDb()+"\tui 점수 : "+st2.getUi()+"\n총점 : "+st2.getTot()+"\t\t평균 : "+st2.getAvg());
		System.out.println("\n이름 : "+st3.getName()+"\t나이 : "+st3.getAge()+"\t\tpg 점수 : "+st3.getPg()+"\tdb 점수 : "+st3.getDb()+"\tui 점수 : "+st3.getUi()+"\n총점 : "+st3.getTot()+"\t\t평균 : "+st3.getAvg());
		System.out.println("\n이름 : "+st4.getName()+"\t나이 : "+st4.getAge()+"\t\tpg 점수 : "+st4.getPg()+"\tdb 점수 : "+st4.getDb()+"\tui 점수 : "+st4.getUi()+"\n총점 : "+st4.getTot()+"\t\t평균 : "+st4.getAvg());
	
	}

}
