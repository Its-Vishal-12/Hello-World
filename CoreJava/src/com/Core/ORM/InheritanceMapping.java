package com.Core.ORM;

import javax.persistence.*;

@Entity
@Table(name="abc")
@Inheritance(strategy=InheritanceType.JOINED) // table/sub class joined

public class InheritanceMapping {

	
	
	//TABLE PER SUB CLASS MAPPING
	
	@OneToOne(fetch=FetchType.EAGER , cascade=CascadeType.ALL)
	@JoinColumn(name="")
	Hibernate hibernate;
	

}
