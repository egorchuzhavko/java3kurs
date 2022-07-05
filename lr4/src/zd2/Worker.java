package zd2;

import java.util.Comparator;

public class Worker implements Comparable<Worker> {
    public double zp_m;
    public String name;
    public Worker(String name, double zp_m) {
    	this.name = name;
        this.zp_m = zp_m;
    }
    
    public static Comparator<Worker> ZPComparator=new Comparator<Worker>() {
    	@Override
    	public int compare(Worker w1, Worker w2) {
    		return (int)(w2.zp_m - w1.zp_m);
    	}
    };
    
    public static Comparator<Worker> NameComparator = new Comparator<Worker>() {
        @Override
        public int compare(Worker w1, Worker w2) {
            return w1.name.compareTo(w2.name);
        }
    };
    
    public double Calculate() {
    	return 0;
    }

	@Override
	public int compareTo(Worker o) {
		return (int)(this.zp_m-o.zp_m);
	}

	@Override
	public String toString() {
		return "Worker zp_m=" + zp_m + ", name=" + name;
	}
	
	

}
