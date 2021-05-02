package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.ad="Gülfidan";
		student.soyad="Baltacı";
		student.id=15;
		student.email="gulfidanbaltaci@ogrenci.beykoz.edu.tr";
		student.password="12345";
		student.alinanKurs="Java Kursu";
	
		Instuctor instructor = new Instuctor();
		instructor.ad = "Engin";
		instructor.soyad = "Demiroğ";
		instructor.id = 34;
		instructor.email = "engindemirog@deneme.com";
		instructor.password = "password";
		instructor.kurs = "Java Geliştime Kursu";		

		UserManager userManager = new UserManager();
		User[] users = {student, instructor};
		userManager.addMultiple(users);	
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addKurs("Java Geliştime Kursu");
		instructorManager.deleteKurs("Java Geliştime Kursu");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addAlinanKurs("Java Geliştime Kursu");
		studentManager.deletAlinanKurs("Java Geliştime Kursu");		
	}

}
