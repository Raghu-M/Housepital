package com.squad.housepital.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto extends ResponseDto{
	
	private Integer userId;
	private String userName;

}
