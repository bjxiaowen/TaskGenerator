package com.bp3.SpringPersonsExample.service;

import org.springframework.stereotype.Service;

/**
 * Created by afahsl on 6/8/15.
 */
@Service
public class PasswordValidator {
    public static final int MIN_SIZE = 8;

    public boolean validate(String password) {
        boolean hasUpperLetter = false;
        boolean hasNumber = false;

        if (password == null)
            return false;

        if (password.length() < MIN_SIZE)
            return false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
                hasUpperLetter = true;
            if (Character.isDigit(c))
                hasNumber = true;
        }
        return hasUpperLetter && hasNumber;
    }
}
