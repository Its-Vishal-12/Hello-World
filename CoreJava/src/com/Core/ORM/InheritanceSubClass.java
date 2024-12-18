package com.Core.ORM;

import javax.persistence.*;

@Entity
@Table(name="qwe")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value="asd")
@DiscriminatorColumn(name="qwe")
public class InheritanceSubClass {

	//table per class mapping
	
}
