package spring101.teknikServis.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import spring101.teknikServis.entities.RepairService;

public interface RepairServiceRepository extends JpaRepository<RepairService, Long>{

}
