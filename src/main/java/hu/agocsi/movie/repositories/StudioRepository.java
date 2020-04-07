package hu.agocsi.movie.repositories;

import hu.agocsi.movie.model.Studio;
import org.springframework.data.repository.CrudRepository;


public interface StudioRepository extends CrudRepository<Studio,Long> {
}
