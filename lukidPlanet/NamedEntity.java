package lukidPlanet;

import lukidPlanet.errors.OccupiedNameException;

import java.util.HashSet;
import java.util.Set;

public class NamedEntity {
    protected final static Set<String> occupiedNames = new HashSet<>();

    protected final String name;

    protected NamedEntity(String name) throws OccupiedNameException {
        if (occupiedNames.contains(name)) {
            throw new OccupiedNameException(name);
        }
        this.name = name;
        occupiedNames.add(name);
    }

    public String getName() {
        return name;
    }
}
