package oopIntroHW;

public class CourseManager {
	public void update(Course course) {
		System.out.println("Kurs g�ncellendi :" + course.name);
	}

	public void change(Course course) {
		System.out.println("Kurs de�i�tirildi :" + course.name);
	}
}
