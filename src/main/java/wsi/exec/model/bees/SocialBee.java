package wsi.exec.model.bees;


import wsi.exec.model.Place;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//szuka miejsca w ktorym jest najwiecej pszczol
public class SocialBee extends WanderingBee{

    @Override
    public Place preferredMove(Place current){

        Place next =  theMostBees(current, current.getNearbyPlaces());
        this.setCanMove(false);
        return next;

    }


    protected Place theMostBees (Place current, List<Place> candidates){
        int howManyBees;
        Map<Place, Integer> counter = new HashMap<>();

        for(Place p : candidates){
            howManyBees = p.getBees().size();
            counter.put(p, howManyBees);
        }

        System.out.println(counter.toString());
        System.out.println(Collections.max(counter.entrySet(), Map.Entry.comparingByValue()).getKey());

        return Collections.max(counter.entrySet(), Map.Entry.comparingByValue()).getKey();

    }


}
