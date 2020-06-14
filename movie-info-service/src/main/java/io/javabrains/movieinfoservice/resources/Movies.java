package io.javabrains.movieinfoservice.resources;

import io.javabrains.movieinfoservice.models.MovieModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieinfo")
public class Movies {

    @RequestMapping("/{movieid}")
    public MovieModel getMovieinfo(@PathVariable("movieid") String movieid){
        return new MovieModel(movieid, "ZNMD");
    }
}

