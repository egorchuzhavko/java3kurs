package z2;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
        Student student1 = new Student("Vladislav", "�111", 6);
        Student student2 = new Student("Gena","K011",4);
        Student student3 = new Student("Petya","K111",3);
        ArrayList<Student>students=new ArrayList<Student>();
        students.add(student2);
        students.add(student1);
        students.add(student3);
        System.out.println("����� ���� ��������� � �� ����� �����...");
        Student.printStudents(students);
        System.out.println("����� ��������� 3 ����� ");
        Student.printStudents(students, 3);
        System.out.println("�������� ����� ��������� (���� ����<3, �� �������� ��������, ���� ����>=3, �� ��������� ����� ��������)");
        Student.checkSrBall(students);
        Student.printStudents(students);
	}

}
