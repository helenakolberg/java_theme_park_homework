import attractions.Attraction;
import attractions.Park;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> places;

    public ThemePark() {
        this.places = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.places;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.setVisitCount(attraction.getVisitCount() + 1);
        visitor.addAttraction(attraction);
    }
}
