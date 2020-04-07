package hu.agocsi.movie.controller;

import hu.agocsi.movie.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/people")
    public String getPeople(Model model) {

        model.addAttribute("people", personRepository.findAll());

        return "people";
    }
}
