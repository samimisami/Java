package spring101.teknikServis.business.abstracts;

import java.util.List;

import spring101.teknikServis.entities.SystemUser;
import spring101.teknikServis.webApi.dto.SystemUserDto;

public interface SystemUserService {
	
	SystemUser save(SystemUserDto systemUserDto);
	
	List<SystemUser> getAll();

	static List<SystemUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
