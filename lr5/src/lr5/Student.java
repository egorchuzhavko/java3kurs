package lr5;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public String name;
	public String group;
	public int course;
	List<Subject> subjects;
		
	public Student(String name, String group, int course, List<Subject> subjects) {
		this.name = name;
		this.group = group;
		this.course = course;
		this.subjects=subjects;
	}
	
	public void upCourse() {
		course++;
	}
	
	public static void checkSrBall(ArrayList<Student> students) {
		int id=0;
		ArrayList<Integer> idtodelete=new ArrayList<Integer>();
		for(Student std : students) {
			int balli=0;
			int k=0;
			for(Subject s : std.subjects ) {
				balli+=s.mark;
				k++;
			}
			if((double)balli/k<3) {
				idtodelete.add(id);
			}
			else { 
				if((double)balli/k>=3) {
					students.get(id).course+=1;
				}
			}
			id++;
		}
		int qqq=0;
		for(Integer idd : idtodelete) {
			students.remove(students.get(idd-qqq));
			qqq++;
		}
	}
	
	public static void printStudents(List<Student> students, int coursee) {
		for(Student std : students) {
			if(std.course==coursee) {
				System.out.println(std);
			}
		}
	}
	
	public static void printStudents(List<Student> students) {
		for(Student std : students) {
			System.out.println("Name = "+std.name +" Course = "+std.course);
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", group=" + group + ", course=" + course + ", subjects=" + subjects + "]";
	}
}
