package lanaDrahrepus.services;

import lanaDrahrepus.model.Thing;

public interface ThingService {
    Iterable<Thing> findAll();
    void create(Thing thing);
    Thing findById(Integer id);
}
