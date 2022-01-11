package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {
    @Test
    void testGetPlusElevation(){
        Hiking h = new Hiking();
        List<Integer> heights= Arrays.asList(1,2,3,100,101,77,12,17,11);
        assertEquals(105,h.getPlusElevation(heights));
    }

}