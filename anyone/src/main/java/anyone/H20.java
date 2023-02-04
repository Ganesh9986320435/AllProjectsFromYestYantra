package anyone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class H20 {
	@Id
	private int h_id;
	@ManyToOne(mapped
	private Bottle bottle;
	
}
