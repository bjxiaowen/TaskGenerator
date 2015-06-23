package com.bp3.SpringPersonsExample.rest;

import com.bp3.SpringPersonsExample.model.Person;
import com.bp3.SpringPersonsExample.service.PasswordValidator;
import com.bp3.SpringPersonsExample.service.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by afahsl on 6/9/15.
 */
@RestController
@RequestMapping("/api")
public class RController {

    @Autowired
    PersonServices personServices;

    @Autowired
    PasswordValidator passwordValidator;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Map<String, Person> getAllTasks() {
        return personServices.getAllTasks();

    }
}
