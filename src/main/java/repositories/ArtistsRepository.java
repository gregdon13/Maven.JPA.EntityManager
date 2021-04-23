package repositories;

import entities.Artists;
import org.springframework.data.repository.CrudRepository;

public interface ArtistsRepository extends CrudRepository<Artists, Integer> {
}
