package com.Spring.Repo;

import com.Spring.Entity.Entities;

public interface RepoMeth {
	
	public Entities addEntity(Entities add);
	
	public Entities getEntityById(int id);
	
	public Entities removeEntities(int id);
	

}
