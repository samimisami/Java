package spring101.teknikServis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RepairService {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private enum operatingSystem {DESKTOP, LAPTOP, MAC;}
	private Integer duration;
	
//	duration nasıl işletim sistemine göre değişecek, düşünülecek
	
}
