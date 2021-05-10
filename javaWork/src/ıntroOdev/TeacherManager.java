package ýntroOdev;

public class TeacherManager {

Teacher teacher1,teacher2;
	
	public void addTeacher() {

		teacher1=new Teacher(1,"Engin Demiroð");
		 System.out.println("Teacher eklendi: "+teacher1.id+" "+teacher1.name);
		teacher2=new Teacher(2,"Nurdan ATLI");
		 System.out.println("Teacher eklendi: "+teacher2.id+" "+teacher2.name);
		 
	}
	Teacher[] teachers= {teacher1,teacher2};
	public void getList() {

		System.out.println("----------------------");
		for(Teacher teacher :teachers) {
			
			System.out.println(teacher.id+" "+teacher.name);
		}
	}
	
	
}
