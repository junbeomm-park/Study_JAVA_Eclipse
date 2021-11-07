package exam;

public class Video extends Content {
	String genre;
	
	

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Video(String title,String genre) {
		super(title);
		this.genre=genre;
	}

	@Override
	public void totalPrice() {
		if(genre.equals("new")) {
			price=2000;
			return;
		}else if(genre.equals("comic")) {
			price=1500;
			return;
		}else if(genre.equals("child")) {
			price=1000;
		}else {
			price=500;
		}
			
		

	}

}
