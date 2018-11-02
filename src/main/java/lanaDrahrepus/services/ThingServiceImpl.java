package lanaDrahrepus.services;

import lanaDrahrepus.model.Thing;
import lanaDrahrepus.repository.ThingsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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
}
