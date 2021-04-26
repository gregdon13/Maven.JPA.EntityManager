package repositories;

import entities.Albums;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Albums, Long> {
}
