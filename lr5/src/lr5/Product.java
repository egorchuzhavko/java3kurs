package lr5;

import java.util.Map;
import java.util.Set;

public class Product {
	public String name;
	public int price;

	public Product(String name, int price) {
		this.name = name;
		this.price=price;
	}
	
	public static <K, V> void keySet(Map<K, V> map) {
        for (K key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println();
    }

    public static <K, V> void values(Map<K, V> map) {
        for (V value : map.values()) {
            System.out.println(value);
        }
        System.out.println();
    }

    public static <K, V> void entrySet(Map<K, V> map) {
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        for (Map.Entry<K, V> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
