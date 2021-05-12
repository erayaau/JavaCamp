package oopIntroHW;

import oopIntroHW.CourseManager;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course("Java + REACT Kursu",10,"Java temel kursu","Engin Demiro�"); 
		
		Course course2 = new Course("C# + Angular Kursu",15,"�leri seviye teknikler i�erir.","Engin Demiro�"); 
		
		Course course3 = new Course("Programlamaya Giri� Temel Kurs",5,"Yeni ba�layanlar i�in","Engin Demiro�");
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			
			System.out.println(course.name);
			
		Category category1 = new Category();
		category1.Id = 1;
		category1.name = "Programlamaya giri� kurslar�";
		
		Category category2 = new Category();
		category2.Id = 2;
		category2.name = "�leri seviye kurslar";
		
		CourseManager courseManager = new CourseManager();
		courseManager.update(course);
		
		courseManager.change(course);
		
		Instructor instructor = new Instructor(1,"Engin","Demirog","Diyarbak�rl�");
		
		System.out.println(instructor.homeLand);
		

		
		
		
		
		}

	}

}
