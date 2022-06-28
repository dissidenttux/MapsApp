package com.tts.MapsApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
    @GetMapping("/home")
    public String getDefaultMap(Model model) {
        model.addAttribute(new Location());
        return "index.html";
    }

    public String getMapForLocation(Location location,
                                    Model model) {
        MapService.addCoordinates(location);
        model.addAttribute(location);
        return "index.html";
    }
}