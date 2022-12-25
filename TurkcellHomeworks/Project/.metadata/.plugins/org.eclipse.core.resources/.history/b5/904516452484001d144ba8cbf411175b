package spring101.teknikServis.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import spring101.teknikServis.business.abstracts.SystemUserService;
import spring101.teknikServis.entities.SystemUser;

@RestController
@RequestMapping("/api/rendezvous")
@AllArgsConstructor
public class RendezvousController {
	private SystemUserService systemUserService;
	
	public List<SystemUser> getAll() {
		return SystemUserService.findAll();
	}
}
