package anyone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Bottle {
@Id
private int id;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn
private List<H20> list;
}
