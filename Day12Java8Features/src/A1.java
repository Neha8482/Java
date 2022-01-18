import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
class Abc implements Consumer<Integer>{

	@Override
	public void accept(Integer i) {
		// TODO Auto-generated m
		System.out.println(i);
	}
}

public class A1 {

	public static void main(String[] args) {
		int[] arr = { 1,9,2,7,3,4,9,0,1,1,1};
		List<Integer> l = new ArrayList<>();
		for(int i =0 ;i < arr.length;i++) {
			l.add(arr[i]);
		}
		
		
		 h = (a,b)-> {
			if(a < b)
				return a;
			else return b;
		};
	}
}
