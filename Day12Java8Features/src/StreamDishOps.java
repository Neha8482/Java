
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDishOps {

	public List<String> getLowCaloryDishesNames(List<Dish> dishes){
		Stream<Dish> lowCal = dishes.stream();
		Stream<Dish> res = lowCal.filter((dish) -> dish.getCalories()<400);
		Stream<String> l = res.map((dish) -> dish.getName()).sorted();
		List<String> list = l.collect(Collectors.toList());
		return list;
	}
	
	public static void main(String[] args) {
		StreamDishOps dishes = new StreamDishOps();
		
		List<String> Dishes = new ArrayList<>();
		Dishes = dishes.getLowCaloryDishesNames(Dish.menu);
		for(String d:Dishes) {
			System.out.println(d);
		}
	
	 
	}
}
