package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.ad="G�lfidan";
		student.soyad="Baltac�";
		student.id=15;
		student.email="gulfidanbaltaci@ogrenci.beykoz.edu.tr";
		student.password="12345";
		student.alinanKurs="Java Kursu";
	
		Instuctor instructor = new Instuctor();
		instructor.ad = "Engin";
		instructor.soyad = "Demiro�";
		instructor.id = 34;
		instructor.email = "engindemirog@deneme.com";
		instructor.password = "password";
		instructor.kurs = "Java Geli�time Kursu";		

		UserManager userManager = new UserManager();
		User[] users = {student, instructor};
		userManager.addMultiple(users);	
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addKurs("Java Geli�time Kursu");
		instructorManager.deleteKurs("Java Geli�time Kursu");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addAlinanKurs("Java Geli�time Kursu");
		studentManager.deletAlinanKurs("Java Geli�time Kursu");		
	}

}
