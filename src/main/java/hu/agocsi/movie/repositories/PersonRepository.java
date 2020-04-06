package hu.agocsi.movie.repositories;

import hu.agocsi.movie.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {
}
