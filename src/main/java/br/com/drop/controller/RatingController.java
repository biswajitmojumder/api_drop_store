package br.com.drop.controller;


import br.com.drop.model.entities.Rating;
import br.com.drop.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/rating")
public class RatingController {

    RatingRepository ratingRepository;


    @PostMapping("/post")
    public Rating save(@RequestBody Rating rating){
        return ratingRepository.save(rating);
    }

    @GetMapping("/show/all")
    public List<Rating> showAll(){
        return ratingRepository.findAll();
    }
}
