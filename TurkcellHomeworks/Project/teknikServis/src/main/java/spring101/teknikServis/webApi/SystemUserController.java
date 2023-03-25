package spring101.teknikServis.webApi;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import spring101.teknikServis.business.concretes.SystemUserManager;
import spring101.teknikServis.webApi.dto.SystemUserDto;

@RestController
@RequestMapping("/api/user")
@Getter
@Setter
@AllArgsConstructor
public class SystemUserController {
	
	private SystemUserManager systemUserManager;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,consumes="application/json")
	public String addUserAccount(@RequestBody SystemUserDto systemUserDto){
		
		systemUserManager.save(systemUserDto);
		
		return "redirect:/registration?success";
	}
	
}
