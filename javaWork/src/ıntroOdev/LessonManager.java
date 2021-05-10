package ýntroOdev;

public class LessonManager {
	Lesson lesson1,lesson2;
	
	public void addLesson() {

		 lesson1=new Lesson(1,"Java","Engin Demiroð");
		 System.out.println("Lesson eklendi: "+lesson1.name+" Ogretmen: "+lesson1.teacher);
		 lesson2=new Lesson(2,"C#","Nurdan ATLI");
		 System.out.println("Lesson eklendi: "+lesson2.name+" Ogretmen: "+lesson2.teacher);
	}
	
	public void getList() {
		
		Lesson[] lessons= {lesson1,lesson2};
		
		for(Lesson lesson :lessons) {
			
			System.out.println(lesson.id+" "+lesson.name+" "+lesson.teacher);
		}
		
	}
	
}
