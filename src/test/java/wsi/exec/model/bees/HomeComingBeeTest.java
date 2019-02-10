package wsi.exec.model.bees;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import wsi.exec.model.places.Meadow;
import wsi.exec.model.places.Place;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HomeComingBeeTest {


        HomeComingBee testee;

        @Before
        public void setUp() throws Exception {
         testee = new HomeComingBee();
        }


    @Test
    public void isRemember() {
            //given
        Meadow m1 = new Meadow(10, "m1");
        Meadow m2 = new Meadow(10, "m2");
        Meadow m3 = new Meadow(10, "m3");

        testee.wayFromHieve = new ArrayList<Place>();

        testee.preferredMove(m1);
        testee.addToWay(m3);
        testee.addToWay(m2);



        assertThat(testee.getWayFromHieve(), hasItems(
                m1, m2
        ));

        testee.getWayFromHieve().forEach(System.out::println);


    }

        }

