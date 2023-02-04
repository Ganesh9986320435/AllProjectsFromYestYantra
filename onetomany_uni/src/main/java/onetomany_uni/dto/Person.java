package onetomany_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
@Id
private int id;
private String name;
}
