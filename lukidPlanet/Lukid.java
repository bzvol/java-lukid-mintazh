package lukidPlanet;

import lukidPlanet.errors.OccupiedNameException;

public class Lukid extends NamedEntity {
    public static final Lukid LUKO = createLukid("Luko");
    public static final Lukid LUKA = createLukid("Luka");

    private static int idCounter = 0;

    private final int id = ++idCounter;

    private Lukid(String name) throws OccupiedNameException {
        super(name);
        System.out.println(name + " has been born.");
    }

    public static Lukid createLukid(String name) {
        try {
            return new Lukid(name);
        } catch (OccupiedNameException e) {
            System.out.println("This name is occupied: " + name);
        }

        /* A feladat nem részletezte, hogy a kivétel esetén
           mit adjon vissza a gyártóművelet, így null-t adok vissza. */
        return null;
    }

    public void die() throws RuntimeException {
        if (name.equals(LUKO.name) || name.equals(LUKA.name)) {
            throw new RuntimeException("Luko and Luka are immortal.");
        }

        occupiedNames.remove(name);
        System.out.println(getName() + " has died.");
    }

    @Override
    public String getName() {
        return "Lukid " + name;
    }

    @Override
    public int hashCode() {
        return id * name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Lukid other) {
            return name.equals(other.name) && id == other.id;
        }
        return false;
    }
}
