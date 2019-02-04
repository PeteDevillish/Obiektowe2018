package wsi.exec.model.bees;

import org.junit.Before;
import org.junit.Test;
import wsi.exec.model.Meadow;
import wsi.exec.model.Place;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class MeadowBeeTest {
    MeadowBee testee;

    @Before
    public void setUp() throws Exception {

        testee = new MeadowBee();
    }

    @Test
    public void beeExists() {
        assertThat(testee).isNotNull();
    }

    @Test
    public void isFindMeadowWorkCorrect(){
        Meadow m1 = new Meadow(10, "m1");
        Meadow m2 = new Meadow(10, "m2");
        Meadow m3 = new Meadow(10, "m2");

        List<Place> testeeCandidates = new ArrayList<Place>();
        testeeCandidates.add(m2);
        testeeCandidates.add(m3);

        assertThat(testee.findMeadow(m1,testeeCandidates)).isNotNull();
        assertThat((testee.findMeadow(m1, testeeCandidates)) instanceof Meadow );

    }


}