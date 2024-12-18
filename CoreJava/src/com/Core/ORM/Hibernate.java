package com.Core.ORM;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Hibernate")
public class Hibernate {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	int id;
	
	@Column(name="Name")
	String name;

	@ElementCollection
	@CollectionTable(name="Address", joinColumns=@JoinColumn(name="Id" , referencedColumnName="Id"))
	@Column(name="Address")
	List<String> address;
	
	
	
	
	
}
