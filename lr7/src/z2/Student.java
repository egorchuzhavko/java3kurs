package z2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public String name;
	public String group;
	public int course;
	int[] marks;
		
	public Student(String name, String group, int course)
    { 
        try {
        	if(group.length()<1 | group.length()>5)
        		throw new GroupException("Длина группы не может быть меньше 1 или больше 4");
        	else
        		this.group = group;
        }
        catch(GroupException ex) {
        	System.out.println(ex.getMessage());
        }
        try
        {
        	if (course <= 0 | course > 5)
        		throw new CourseException("Курс не может быть меньше 1 или больше 4");
        	else
        		this.course = course;
        }
        catch (CourseException ex) {
        	System.out.println(ex.getMessage());
        }        
        try {
            if (name.length() < 1 | name.length() > 32)
                throw new NameException("Длина имени не может быть меньше 1 или больше 31");
            else
            	this.name = name;
        }
        catch (NameException ex) {
            System.out.println(ex.getMessage());
        }
        this.marks = new int[10];
        for (int i = 0; i < 10; i++) 
        {
            this.marks[i] = (int)(Math.random()*6);
        }
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
			for(int s : std.marks ) {
				balli+=s;
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
		String smarks="";
		for(int m : marks) {
			smarks+=Integer.toString(m)+" ";
		}
		return "Student [name=" + name + ", group=" + group + ", course=" + course + ", оценки:" + smarks + "]";
	}
}


class NameException extends Exception 
{
    public NameException(String message)
    {
        super(message); 
    }
}

class CourseException extends Exception 
{
    public CourseException(String message)
    {
        super(message); 
    }
    
}
class GroupException extends Exception
{
	public GroupException(String message) {
		super(message);
	}
}