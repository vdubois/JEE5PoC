import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Adresse {

	@Id @GeneratedValue
	private Long identifiant;

	private String rue;
}

