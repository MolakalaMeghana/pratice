package com.example.demo1.API;
import java.util.*;
import com.example.demo1.model.person;
import com.example.demo1.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class personController {
    @Autowired
    private final personService personService;


    public personController(personService personService)
    {
        this.personService=personService;
    }

    //ADD new person
    @PostMapping("/person")
    public void addperson(@RequestBody person person) {
        personService.addPerson(person);
    }
    //GET all persons
    @GetMapping("/persons")
    public List<Persons> getAllPersons()
    {
       return personService.getAllperson();
    }

    //GET person by id
    @GetMapping("/persons/{id}")
    public person getpersons(@PathVariable("id") int id)
    {
        return personService.getPersonById(id);
    }

    
    @DeleteMapping("/person/{id}")
    public void deleteperson(@PathVariable("id") int id)
    {
        personService.deletePerson(id);
    }

    
    @PutMapping("/persons/{id}")
    public person updateperson(@RequestBody person person,@PathVariable("id") int id)
    {
         this.personService.updatePerson(person,id);
         return person;
    }
}
