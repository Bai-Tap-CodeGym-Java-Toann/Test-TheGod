package lanaDrahrepus.repository;

import lanaDrahrepus.model.Thing;
import org.springframework.data.repository.CrudRepository;


public interface ThingsRepo extends CrudRepository<Thing,Integer> {
}
