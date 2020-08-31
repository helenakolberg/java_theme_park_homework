package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 1.45;
    }

    public double defaultPrice() {
        return 8.4;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 2.0) {
            return defaultPrice() * 2;
        } else {
            return defaultPrice();
        }
    }
}
