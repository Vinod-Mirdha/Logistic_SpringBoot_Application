package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Loads;

public interface LoadService {
	
	public List<Loads> getLoads(); 
	
	public Loads getLoad(long LoadId );
	
	public Loads addLoad(Loads Load);
	
	public Loads updateLoad(Loads Load);
	
	public void deleteLoad(long parseLong);

}
