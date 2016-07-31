package com.github.jntakpe.web;

import com.github.jntakpe.model.Position;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jntakpe
 */
@RestController
@RequestMapping("/api/location")
public class LocationResource {

    private int countCall = 0;

    @RequestMapping(method = RequestMethod.GET)
    public Position testLocation() {
        countCall++;
        return new Position(countCall, countCall);
    }



}
