package spring101.teknikServis.webApi;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import spring101.teknikServis.business.abstracts.SystemUserService;
import spring101.teknikServis.webApi.dto.SystemUserDto;

@RestController
@RequestMapping("/api/user")
@Getter
@Setter
@AllArgsConstructor
public class SystemUserController {
	
	private SystemUserService systemUserService;
	
	public String addUserAccount(@ModelAttribute("user") SystemUserDto systemUserDto){
		
		systemUserService.save(systemUserDto);
		
		return "redirect:/registration?success";
	}
	 
}
