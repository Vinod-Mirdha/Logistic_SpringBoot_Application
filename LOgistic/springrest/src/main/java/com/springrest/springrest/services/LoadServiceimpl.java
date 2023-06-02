package com.springrest.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Loads;

@Service
public class LoadServiceimpl implements LoadService  {

	@Autowired 
	private LoadDao LoadDao;
	
//	List<Loads> list;
	
	public LoadServiceimpl() {
		
	
//		list = new ArrayList<>();
//		list.add(new Loads(145, "Java Core Load", "this Load contains basics of java"));
//		list.add(new Loads(4343, "spring boot Load", "creating rest api using spring boot"));
	
		
	}
	
	@Override
	public List<Loads> getLoads() {
		
		return LoadDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Loads getLoad(long LoadId) {
		
//		Loads c = null;
//		for(Loads Load : list) {
//			if(Load.getId() == LoadId) {
//				c = Load;
//				break;
//			}
//		}
		
		return LoadDao.getOne(LoadId);
	}

	@Override
	public Loads addLoad(Loads Load) {
//		list.add(Load);
		LoadDao.save(Load);
		return Load;
	}

	@Override
	public Loads updateLoad(Loads Load) {
//		list.forEach(e ->{
//			if(e.getId() == Load.getId()) {
//				e.setTitle(Load.getTitle());
//				e.setDescription(Load.getDescription());
//			}
//		});
		
		LoadDao.save(Load);
		
		return Load;
	}

	@Override
	public void deleteLoad(long parseLong) {
//		list = this.list.stream().filter(e->e.getId() != parseLong).collect(Collectors.toList());
		@SuppressWarnings("deprecation")
		Loads entity = LoadDao.getOne(parseLong);
		LoadDao.delete(entity);
		
	}

}
