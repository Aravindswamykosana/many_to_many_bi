package many_to_many_bi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double budget;
	private String director;
	private String releaseDate;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "movie")
	private List<Hero>hero;
	
	public Movie() {
		super();
	}
	
}
