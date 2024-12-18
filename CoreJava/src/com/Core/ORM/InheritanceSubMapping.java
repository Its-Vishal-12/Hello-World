package com.Core.ORM;

import javax.persistence.*;

@Entity
@Table(name="bvc")
@PrimaryKeyJoinColumn(name="Id", referencedColumnName="Id")

public class InheritanceSubMapping extends InheritanceMapping {
	
	//TABLE PER SUB CLASS MAPPING

}
