package people;

import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canGetNumOfVisitedAttractions() {
        assertEquals(0, visitor.getNumOfVisitedAttractions());
    }

    @Test
    public void canAddAttraction() {
        RollerCoaster rollerCoaster = new RollerCoaster("Thunder Mountain", 5);
        visitor.addAttraction(rollerCoaster);
        assertEquals(1, visitor.getNumOfVisitedAttractions());
    }
}
