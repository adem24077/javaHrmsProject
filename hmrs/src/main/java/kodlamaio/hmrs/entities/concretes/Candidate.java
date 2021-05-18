package kodlamaio.hmrs.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "candidates")
public class Candidate {
	
	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "nationalId")
	private String nationalId;
	
	@Column(name = "yearofBirth")
	private Date yearofBirth;
}
