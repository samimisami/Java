package spring101.teknikServis.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name="systemUsers")
@Getter
@Setter
@Entity
public class SystemUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="userName")
	private String userName;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
//	Spring Security [kullanıcı rolleri(admin, user, visitor)] eklenecek
	
}
