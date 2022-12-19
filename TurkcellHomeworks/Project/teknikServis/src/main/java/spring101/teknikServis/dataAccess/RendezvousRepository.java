package spring101.teknikServis.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import spring101.teknikServis.entities.Rendezvous;

public interface RendezvousRepository extends JpaRepository<Rendezvous, Long>{

}
