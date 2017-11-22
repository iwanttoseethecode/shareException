package tip21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionStrategy {
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("timor",18));
		studentList.add(new Student("С��",20));
		studentList.add(new Student("С��",26));
		studentList.add(new Student("СĮ",22));
		studentList.add(new Student("���",38));
		
		
		Collections.sort(studentList, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				
				return s1.age - s2.age;
			}
			
		});
		
		System.out.println(studentList);
		
	}
	
}

class Student{
	String name;
	int age;
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������"+name+" ���䣺"+age+"\r\n";
	}
}