import attractions.Park;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    IReviewed park;
    IReviewed iceCreamStall;

    @Before
    public void before() {
        themePark = new ThemePark();
        park = new Park("Adventure Park", 5);
        iceCreamStall = new IceCreamStall("Ice Queen", "Janet Jones", ParkingSpot.B2, 4);
    }

    @Test
    public void canGetAllReviewed() {
        ArrayList<IReviewed> places = new ArrayList<IReviewed>();
        assertEquals(places, themePark.getAllReviewed());
    }

    @Test
    public void canVisit() {
        Visitor visitor = new Visitor(20, 1.6, 30);
        Park attraction = new Park("Adventure Park", 5);
        themePark.visit(visitor, attraction);
        assertEquals(1, visitor.getNumOfVisitedAttractions());
        assertEquals(1, attraction.getVisitCount());
    }

    @Test
    public void canGetNumOfPlaces() {
        assertEquals(0, themePark.numOfPlaces());
    }

    @Test
    public void canAddPlace() {
        themePark.addPlace(park);
        assertEquals(1, themePark.numOfPlaces());
    }

    @Test
    public void checkAllReviews() {
        themePark.addPlace(park);
        themePark.addPlace(iceCreamStall);
        HashMap<String, Integer> reviews = themePark.allReviews();
        int value1 = reviews.get("Ice Queen");
        int value2 = reviews.get("Adventure Park");
        assertEquals(4, value1);
        assertEquals(5, value2);
    }
}
