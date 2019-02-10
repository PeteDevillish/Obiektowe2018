package wsi.exec.model.bees;

import wsi.exec.model.places.Place;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DebugScoutBee extends ScoutBee {
    @Override
    public Place preferredMove(Place current) {
        Place next = super.preferredMove(current);
        ///tutaj dopisać kod wypisujący na ekran coś w stylu:
        ///  bee: (id); has visited ... places so far
        /// liczba odwiedzonych miejsc to: visited.size();


        System.out.println("Bee " + getId()  + " has visited " + visited.size()+ " " + placeOrPlaces());
        return next;
    }

    public String placeOrPlaces(){
        if (visited.size() == 1) return "place";
        else return "places";
    }
}
