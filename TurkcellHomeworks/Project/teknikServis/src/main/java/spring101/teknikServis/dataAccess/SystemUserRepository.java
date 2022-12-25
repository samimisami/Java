package spring101.teknikServis.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring101.teknikServis.entities.SystemUser;

@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Long>{
	
}
