package lr5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		//������� 1
        System.out.println("������� 1\n");
		Map<String,Product> hashMap=new HashMap<String,Product>();
		hashMap.put("Lego", new Product("Lego",100));
		hashMap.put("Nerf",new Product("Nerf",60));
		hashMap.put("Ball",new Product("Ball",25));
		hashMap.put("Bear",new Product("Bear",10));
		System.out.println("keySet:");
        Product.keySet(hashMap);
        System.out.println("values:");
        Product.values(hashMap);
        System.out.println("entrySet:");
        Product.entrySet(hashMap);
        
        //������� 2
        System.out.println("������� 2\n");
        Subject s1=new Subject("Biology",2);
        Subject s2=new Subject("Math",4);
        Subject s3=new Subject("Programming",4);
        Subject s4=new Subject("English",3);
        ArrayList<Subject> goodmarks=new ArrayList<Subject>();
        goodmarks.add(s3);
        goodmarks.add(s2);
        ArrayList<Subject> badmarks=new ArrayList<Subject>();
        badmarks.add(s1);
        badmarks.add(s4);
        Student student1 = new Student("Vasiliy", "K111", 3,goodmarks);
        Student student2 = new Student("Gena","K011",4,badmarks);
        Student student3 = new Student("Petya","K111",3,badmarks);
        ArrayList<Student>students=new ArrayList<Student>();
        students.add(student2);
        students.add(student1);
        students.add(student3);
        System.out.println("����� ���� ��������� � �� ����� �����...");
        Student.printStudents(students);
        System.out.println("����� ��������� 3 ����� ");
        Student.printStudents(students, 3);
        System.out.println("�������� ����� ��������� (���� ����<3 -> �������� ��������, ���� ����>=3 -> ��������� ����� ��������)...");
        Student.checkSrBall(students);
        Student.printStudents(students);
        
      //������� 3
        System.out.println("\n������� 3\n");
        Map<String, Pet> hashMap3 = new HashMap<>();
        hashMap3.put("���", new Cat("����"));
        hashMap3.put("������", new Dog("�����"));
        hashMap3.put("�������", new Parrot("����"));
        System.out.println(hashMap3);
        values(hashMap3);
        keySet(hashMap3);
	}
	
	public static <K, V> void values(Map<K, V> map) {
        for (V value : map.values()) {
            System.out.println(value.toString());
        }
        System.out.println();
    }

    public static <K, V> void keySet(Map<K, V> map) {
        for (K key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println();
    }
}
