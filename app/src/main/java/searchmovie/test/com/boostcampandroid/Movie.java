package searchmovie.test.com.boostcampandroid;

import java.util.Date;

class Movie {
	private String title;
	private String link;
	private String image;
	private String subtitle;
	private String pubDate;
	private String director;
	private String actor;
	private double userRating;
	
	Movie() {
		title = "";
		link = "";
		image = "";
		subtitle = "";
		pubDate = "";
		director = "";
		actor = "";
		userRating=0;
		
	}

	void setValue(String type, String value) {
		if (value == null)
			return;
		if (type.equals("title")) {
			this.title = value;
		} else if (type.equals("link")) {
			this.link = value;
		} else if (type.equals("image")) {
			this.image = value;
		} else if (type.equals("subtitle")) {
			this.subtitle = value;
		} else if (type.equals("pubDate")) {
			this.pubDate = value;
		} else if (type.equals("director")) {
			this.director = value;
		} else if (type.equals("actor")) {
			this.actor = value;
		} else if (type.equals("userRating")) {
			this.userRating = Double.parseDouble(value);
			
		}
	}

	String getTitle() {
		return this.title;
	}

	String getLink() {
		return this.link;
	}

	String getImage() {
		return this.image;
	}

	String getSubtitle()
	{
		return this.subtitle;
	}
	String getPubDate() {
		return this.pubDate;
	}
	String getDirector() {
		return this.director;
	}
	String getActor() {
		return this.actor;
	}
	double getUserRating() {
		return this.userRating;
	}
	
}
