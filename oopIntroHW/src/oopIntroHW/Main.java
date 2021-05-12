package oopIntroHW;

import oopIntroHW.CourseManager;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course("Java + REACT Kursu",10,"Java temel kursu","Engin Demiroð"); 
		
		Course course2 = new Course("C# + Angular Kursu",15,"Ýleri seviye teknikler içerir.","Engin Demiroð"); 
		
		Course course3 = new Course("Programlamaya Giriþ Temel Kurs",5,"Yeni baþlayanlar için","Engin Demiroð");
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			
			System.out.println(course.name);
			
		Category category1 = new Category();
		category1.Id = 1;
		category1.name = "Programlamaya giriþ kurslarý";
		
		Category category2 = new Category();
		category2.Id = 2;
		category2.name = "Ýleri seviye kurslar";
		
		CourseManager courseManager = new CourseManager();
		courseManager.update(course);
		
		courseManager.change(course);
		
		Instructor instructor = new Instructor(1,"Engin","Demirog","Diyarbakýrlý");
		
		System.out.println(instructor.homeLand);
		

		
		
		
		
		}

	}

}
