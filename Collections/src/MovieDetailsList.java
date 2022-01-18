import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MovieDetailsList {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		String argumentToSortOn;
		argumentToSortOn = "movieName";
		Set<MovieDetails> movie = null;
		
		if(argumentToSortOn.equals("movieName"))
		movie = new TreeSet<>(new Comparator<MovieDetails>()
				{
			       @Override
					public int compare(MovieDetails o1, MovieDetails o2) {
						String m1= o1.getMovieName();
						String m2 = o2.getMovieName();
						return m1.compareTo(m2);
					}
				});
		if(argumentToSortOn.equals("actor_Name"))
			movie = new TreeSet<>(new Comparator<MovieDetails>()
					{
				       @Override
						public int compare(MovieDetails o1, MovieDetails o2) {
							String m1= o1.getActor_Name();
							String m2 = o2.getActor_Name();
							return m1.compareTo(m2);
						}
					});
			
		if(argumentToSortOn.equals("acctress_Name"))
			movie = new TreeSet<>(new Comparator<MovieDetails>()
					{
				       @Override
						public int compare(MovieDetails o1, MovieDetails o2) {
							String m1= o1.getActress_Name();
							String m2 = o2.getActress_Name();
							return m1.compareTo(m2);
						}
					});
			
		if(argumentToSortOn.equals("genre"))
			movie = new TreeSet<>(new Comparator<MovieDetails>()
					{
				       @Override
						public int compare(MovieDetails o1, MovieDetails o2) {
							String m1= o1.getGenre();
							String m2 = o2.getGenre();
							return m1.compareTo(m2);
						}
					});
			movie.add(new MovieDetails("I","xyz","abc","athestic"));
			movie.add(new MovieDetails("Hera Pheri","Akshay","Bipasha","Comedy"));
			movie.add(new MovieDetails("Action Replay","Akshay","Aish","Action"));
			movie.add(new MovieDetails("YJHD","Ranbir","Deepika","Good"));
		
			Iterator<MovieDetails> iter = movie.iterator();
			while(iter.hasNext()) {
				if(iter.next().getMovieName().equals("YJHD")) {
				movie.remove(iter.next());
				}
			}
			
			
			for(MovieDetails mo: movie) {
				String mo_name = "I";
				if(mo.getMovieName().equals(mo_name)) {
					System.out.println(mo);
				}
			}
			
			for(MovieDetails mo: movie) {
				String mo_genre = "Comedy";
				if(mo.getGenre().equals(mo_genre)) {
					System.out.println(mo);
				}
			}
			
			System.out.println();
			System.out.println(movie);
			movie.clear();
			System.out.println(movie);
	}
}
