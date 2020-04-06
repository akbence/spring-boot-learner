package hu.agocsi.movie.repositories;

import hu.agocsi.movie.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Long> {
}
