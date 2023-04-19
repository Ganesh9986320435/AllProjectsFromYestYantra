import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ten {
	public static void main(String[] args) {
		
		Comparator<Integer> comparator=(Integer i1,Integer i2) ->{return i2-i1; };
		ArrayList< Integer> arrayList=new ArrayList<>();
		Collections.sort(arrayList,comparator);
		TreeSet<Integer> treeSet=new TreeSet<>(comparator);
		LinkedHashSet< Integer> linkedHashSet=new LinkedHashSet<>(comparator);
		HashSet< Integer> hashSet=new HashSet<>();
		HashMap< Integer, String> hashMap=new HashMap<>(comparator);
		TreeMap<String, Integer> treeMap=new TreeMap<>(comparator);
		}
}
