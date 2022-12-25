package spring101.teknikServis.webApi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SystemUserDto {
	
	private String email;
	private String username;
	private String password;
	
}
