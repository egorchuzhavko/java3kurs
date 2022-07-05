package lr9;

import java.util.ArrayList;

public class Z3_1 {
	
	
	public static void main(String[] args) {
        ArrayList<Integer> products=new ArrayList();
        
        Thread Producer=new Thread(new Runnable() {
        	public void run() {
        		for(int i =0;i<3;i++) {
        			products.add(1);
    				System.out.println("Производитель добавил товар\nТоваров на складе: "+products.size());
        		}
        		while(true) {
        			try {
    					Thread.sleep(2500);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
            		products.add(1);
    				System.out.println("Производитель добавил товар\nТоваров на складе: "+products.size());
        		}
        	}
        });
        Thread Customer=new Thread(new Runnable() {
        	public void run() {
        		while(true) {
        			try {
    					Thread.sleep(1300);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
        			if(!products.isEmpty())
        			{
        				products.remove(0);
        				System.out.println("Покупатель купил товар\nТоваров на складе: "+products.size());
        			}
        			else {
        				System.out.println("Товаров на складе нет");
        			}
        		}
        		
        	}
        });
        Producer.start();
        Customer.start();
    }

}
