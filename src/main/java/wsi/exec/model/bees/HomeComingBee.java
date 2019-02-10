package wsi.exec.model.bees;

import wsi.exec.model.places.Place;

import java.util.List;

public class HomeComingBee extends WanderingBee {
    List<Place> wayFromHieve;


    //todo: ta pszczoła powinna pamiętać całą ścieżkę od początku ruchu
    //select different -> wybrała
    //prefered move -> poleciala


    public List<Place> getWayFromHieve() {

        return wayFromHieve;

    }

    public void setWayFromHieve(List<Place> wayFromHieve) {
        this.wayFromHieve = wayFromHieve;
    }

    @Override
    public Place preferredMove(Place current) {
        Place next = super.preferredMove(current);
        addToWay(current);
        return next;
    }
    public void addToWay(Place current){
        getWayFromHieve();
        wayFromHieve.add(current);

    }

    // TODO: 2019-02-10 funkcja, której wywołanie sprawia,że pszczoła wraca z powrotem do ula
    // TODO: 2019-02-10 zastanowić się nad logiką funkcji w pszczole - co zrobić gdy pszczoła była w jakimś miejscu kilka razy? jak sprawić, by leciała do ula najszybszą/najbezpieczniejszą/najbardziej
    // pożądaną przez nas drogą(np. ścieżką gdzie może zebrać jak najwięcej "jedzenia")?



}
