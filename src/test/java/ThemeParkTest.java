import attractions.Park;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before() {
        themePark = new ThemePark();
    }

    @Test
    public void canGetAllReviewed() {
        ArrayList<IReviewed> places = new ArrayList<IReviewed>();
        assertEquals(places, themePark.getAllReviewed());
    }

    @Test
    public void canVisit() {
        Visitor visitor = new Visitor(20, 1.6, 30);
        Park attraction = new Park("Ice Queen", 5);
        themePark.visit(visitor, attraction);
        assertEquals(1, visitor.getNumOfVisitedAttractions());
        assertEquals(1, attraction.getVisitCount());
    }
}
