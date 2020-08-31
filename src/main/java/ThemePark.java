import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

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

    public int numOfPlaces() {
        return this.places.size();
    }

    public void addPlace(IReviewed place) {
        this.places.add(place);
    }

    public HashMap<String, Integer> allReviews() {
        HashMap<String, Integer> reviews = new HashMap<String, Integer>();
        for (IReviewed place : this.places) {
            reviews.put(place.getName(), place.getRating());
        }
        return reviews;
    }
}
