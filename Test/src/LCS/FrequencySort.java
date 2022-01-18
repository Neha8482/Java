package LCS;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
class Element{
	int data;
	int frequency;
	Element(int data , int frequency){
		this.data = data;
		this.frequency = frequency;
	}
}
public class FrequencySort {
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,3,9,9,9,9,5,6,3};
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i=0; i < arr.length;i++) {
			if(mp.get(arr[i]) == null)
				mp.put(arr[i], 1);
			else
				mp.put(arr[i], mp.get(arr[i])+1);
		}
		Queue<Element> heap = new PriorityQueue<>(new Comparator<>() {
			@Override
			public int compare(Element o1, Element o2) {
				if(o1.frequency == o2.frequency)
					return o2.data - o1.data;
				else
					return o2.frequency - o1.frequency; 
			}
			
		});
		for(Map.Entry<Integer,Integer> p : mp.entrySet()) {
			heap.add(new Element(p.getKey(),p.getValue()));
		}
		System.out.println(heap.peek().data);
		
	}

}
