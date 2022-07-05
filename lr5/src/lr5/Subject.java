package lr5;

public class Subject {
	public String nameofsubject;
	public int mark;
	
	public Subject(String nameofsubject, int mark) {
		this.nameofsubject = nameofsubject;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Subject [nameofsubject=" + nameofsubject + ", mark=" + mark + "]";
	}
	
}
