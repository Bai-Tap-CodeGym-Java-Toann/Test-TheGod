package lanaDrahrepus.services;

import lanaDrahrepus.model.Thing;
import lanaDrahrepus.repository.ThingsRepo;
import org.springframework.beans.factory.annotation.Autowired;


public class ThingServiceImpl implements ThingService {
    @Autowired
    ThingsRepo thingsRepo;

    @Override
    public Iterable<Thing> findAll() {
        return thingsRepo.findAll();
    }

    @Override
    public void create(Thing thing) {
        thingsRepo.save(thing);
    }

    @Override
    public Thing findById(Integer id) {
        return thingsRepo.findOne(id);
    }
}
