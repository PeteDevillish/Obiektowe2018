package wsi.exec.model.bees;

import wsi.exec.model.Meadow;
import wsi.exec.model.Place;

import java.util.List;

//v. 1.0 pszczola ktora jesli to mozliwe w najblizszym ruch idzie na lake
public class MeadowBee extends WanderingBee {

    @Override
    public Place preferredMove(Place current) {
        //porownanie
        Place next =  findMeadow(current, current.getNearbyPlaces());
        this.setCanMove(false);
        return next;
    }

    protected Place findMeadow(Place current, List<Place> candidates) {
        System.out.println("selecting from: " + candidates);
        //ustawiam poczatkowa wartosc na miejsce obecne
        Place toGo = current;
        for (Place p : candidates) {
            if (!p.equals(current) && p instanceof Meadow) {
                toGo = p;
                break;
            } else {
                toGo = selectDifferent(current, candidates);
            }
        }
        System.out.println("selected: " + toGo);
        return toGo;
    }



}
