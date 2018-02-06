package cinemas;

import java.util.HashMap;
import java.util.Map;

public class Movies {
	
	
	
	private String Title;
	private String Genre;
	private String AgeRating;
	public Movies(String title, String genre, String ageRating) {
		super();
		Title = title;
		Genre = genre;
		AgeRating = ageRating;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getAgeRating() {
		return AgeRating;
	}
	public void setAgeRating(String ageRating) {
		AgeRating = ageRating;
	}
	@Override
	public String toString() {
		return "Movies [Title=" + Title + ", Genre=" + Genre + ", AgeRating=" + AgeRating + "]";
	}
	
	
	
		 
		 
	
		 
	 

	 
	 
	 
}
