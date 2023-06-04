import lukidPlanet.Lukid;

public class LukidMain {
    public static void main(String[] args) {
        final Lukid l1 = Lukid.createLukid("Luki"),
                    l2 = Lukid.createLukid("Luko"),
                    l3 = Lukid.createLukid("Luka");
        if (l1 == null) {
            return;
        }

        System.out.println("L1 Luki hash code: " + l1.hashCode());
        l1.die();

        final Lukid l4 = Lukid.createLukid("Luki");
        if (l4 == null) {
            return;
        }

        System.out.println("L1 Luki equals to L4 Luki: " + l1.equals(l4));
        System.out.println("L4 Luki hash code: " + l4.hashCode());
        System.out.println("L1 Luki hash code equals to L4 Luki hash code: " + (l1.hashCode() == l4.hashCode()));
    }
}
