package wsi.exec.model.bees;

import org.junit.Before;
import org.junit.Test;
import wsi.exec.model.Meadow;
import wsi.exec.model.Place;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class SocialBeeTest {

    SocialBee testee;

    @Before
    public void setUp() throws Exception {
        testee = new SocialBee();
    }

    @Test
    public void isPlaceWithMaxNumberOfBee(){
        //given
        Meadow m1 = new Meadow(10, "m1");
        Meadow m2 = new Meadow(10, "m2");
        Meadow m3 = new Meadow(10, "m2");

        Bee b1 = new Bee();
        Bee b2 = new Bee();
        Bee b3 = new Bee();
        Bee b4 = new Bee();
        Bee b5 = new Bee();
        Bee b6 = new Bee();


        m1.addBee(b1);
        m2.addBee(b2);
        m2.addBee(b3);
        m2.addBee(b4);
        m3.addBee(b5);
        m3.addBee(b6);

        List<Place> testeeCandidates = new ArrayList<Place>();
        testeeCandidates.add(m1);
        testeeCandidates.add(m2);
        testeeCandidates.add(m3);

        m1.addNearbyPlace(m2);
        m1.addNearbyPlace(m3);
        m2.addNearbyPlace(m1);
        m2.addNearbyPlace(m3);
        m3.addNearbyPlace(m1);
        m3.addNearbyPlace(m2);

        testee.theMostBees(m1, testeeCandidates);
assertThat(testee.theMostBees(m1, testeeCandidates)).isEqualTo(m2);
        assertThat(testee.preferredMove(m1)).isEqualTo(m2);
    }



}