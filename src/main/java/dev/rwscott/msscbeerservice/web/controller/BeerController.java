package dev.rwscott.msscbeerservice.web.controller;

import dev.rwscott.msscbeerservice.web.model.BeerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer/")
public class BeerController {

    //get
    @GetMapping("{beerId}")
    BeerDto getBeer(UUID beerId) {
        return null;
    }

    //create
    @PostMapping
    ResponseEntity<Void> createBeer(@RequestBody BeerDto beerDto) {
        return null;
    }

    //update
    @PutMapping("{beerId}")
    BeerDto updateBeer(@RequestParam("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        return null;
    }

}
