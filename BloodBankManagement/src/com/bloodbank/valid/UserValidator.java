package com.bloodbank.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bloodbank.dto.User;



@Service
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "unmKey", "*required");
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "passKey", "*required");

	User user = (User) target;
	if(user.getPassword() != null) {
		if(user.getPassword().length()<8) { 
			errors.rejectValue("password", "passKey", " *password should contain at least 8 chars");
		}
	}
	
	}
	
	
}
