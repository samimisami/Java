package spring101.teknikServis.dataAccess;


import org.springframework.data.jpa.repository.JpaRepository;

import spring101.teknikServis.entities.SystemUser;

public interface SystemUserRepository extends JpaRepository<SystemUser, Long>{
	
}
