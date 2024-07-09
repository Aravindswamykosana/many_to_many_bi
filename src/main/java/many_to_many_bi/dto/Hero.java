package many_to_many_bi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Hero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double heigth;
	private int age;
	private String status;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Movie>movie;
	public Hero() {
		super();
	}
}
