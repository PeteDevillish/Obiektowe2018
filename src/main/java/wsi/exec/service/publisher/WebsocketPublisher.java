package wsi.exec.service.publisher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import wsi.exec.model.places.Place;

import java.util.List;

/**
 * Publikuje stan świata do klienta podłączonego przez websocket
 */
@Component
public class WebsocketPublisher implements WorldPublisher {
    @Value("${realengine.url}")
    String url;

    @Override
    public void publishWorld(List<Place> places) {
        
    }
}
