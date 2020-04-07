package hu.agocsi.movie.bootstrap;

import hu.agocsi.movie.model.Movie;
import hu.agocsi.movie.model.Person;
import hu.agocsi.movie.repositories.MovieRepository;
import hu.agocsi.movie.repositories.PersonRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DevBoostrap implements ApplicationListener<ContextRefreshedEvent> {

    private PersonRepository personRepository;
    private MovieRepository movieRepository;

    public DevBoostrap(PersonRepository personRepository, MovieRepository movieRepository) {
        this.personRepository = personRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {

        Person tomHanks = new Person("Tom", "Hanks");
        Person robertDeNiro = new Person("Robert", "De Niro");

        Movie forrestGump = new Movie("Forrest Gump", 9.2);
        Movie theIntern = new Movie("The Intern", 8.2);

        tomHanks.getMovie().add(forrestGump);
        forrestGump.getPersons().add(tomHanks);

        robertDeNiro.getMovie().add(theIntern);
        theIntern.getPersons().add(robertDeNiro);

        personRepository.saveAll(Arrays.asList(tomHanks,robertDeNiro));
        movieRepository.saveAll(Arrays.asList(forrestGump,theIntern));
    }
}
