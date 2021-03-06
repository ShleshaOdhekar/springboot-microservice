package io.javabrains.moviecatalogservice.resources;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieRest {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getItem(@PathVariable("userId") String userId) {

        return Collections.singletonList(
                new CatalogItem("ZNMD", "Awesome", 4 )
        );

    }
}
