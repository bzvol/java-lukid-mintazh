package lukidPlanet.errors;

public class OccupiedNameException extends Exception {
    public OccupiedNameException() {
        super();
    }

    public OccupiedNameException(String name) {
        super("The following name is occupied: " + name);
    }
}
