/*
 * 2)	Create class Movie_Details with field’s mov_Name, lead_actor, lead_actories, and genre
 *   add setter and getter method in that class. 
a.	After creating this class create class Movie_DetailsList class 
who will maintain all the objects.
b.	Movie_DetailsList class should have method add_movie(), remove_movie(),
 remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
c.	Movie_DetailsList should have method which will take an argument
 that will be use to determine on which to sort 

 */
public class MovieDetails {

	private String movieName;
	private String actor_Name;
	private String actress_Name;
	private String genre;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActor_Name() {
		return actor_Name;
	}
	public void setActor_Name(String actor_Name) {
		this.actor_Name = actor_Name;
	}
	public String getActress_Name() {
		return actress_Name;
	}
	public void setActress_Name(String actress_Name) {
		this.actress_Name = actress_Name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public MovieDetails(String movieName, String actor_Name, String actress_Name, String genre) {
		super();
		this.movieName = movieName;
		this.actor_Name = actor_Name;
		this.actress_Name = actress_Name;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", actor_Name=" + actor_Name + ", actress_Name=" + actress_Name
				+ ", genre=" + genre + "]"+"\n";
	}
	
	
}
