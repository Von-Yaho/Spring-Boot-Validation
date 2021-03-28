package com.exxeta.validation.exception;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.exxeta.validation.io.entities.User;
import com.exxeta.validation.io.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {
    Logger logger = LoggerFactory.getLogger(UniqueEmailValidator.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        logger.info("running isValid");

        User user = userRepository.findByEmail(value);
        return user == null;
        //return !userRepository.findByEmail(value);
    }
}
