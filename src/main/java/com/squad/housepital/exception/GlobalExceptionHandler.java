package com.squad.housepital.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.squad.housepital.constant.Constant;
import com.squad.housepital.dto.ErrorDto;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(DoctorNotFoundException.class)
	public ResponseEntity<ErrorDto> doctorNotFoundException(DoctorNotFoundException ex) {
		ErrorDto errorDto = new ErrorDto();
		errorDto.setMessage(Constant.DOCTOR_NOT_FOUND);
		errorDto.setStatusCode(HttpStatus.NOT_FOUND.value());
		return ResponseEntity.status(HttpStatus.OK).body(errorDto);
	}


}
