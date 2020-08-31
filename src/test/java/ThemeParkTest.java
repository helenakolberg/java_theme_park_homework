import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;

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
}
