package io.javabrains.ratingsdataservice.resources;

import io.javabrains.ratingsdataservice.models.RatingModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class Ratings {

    @RequestMapping("/{movieid}")
    public RatingModel getRatings(@PathVariable("movieid") String movieid) {
        return new RatingModel(movieid, 4);
    }
}
