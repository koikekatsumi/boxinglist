package com.example.boxinglist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoxingListController {

    private BoxingListService boxingListService;

    public BoxingListController(BoxingListService boxingListService) {

        this.boxingListService = boxingListService;
    }

    @GetMapping("/boxers")  //エンドポイント例 http://localhost:8080/boxers
    public List<Boxer> getBoxers() {
        List<Boxer> boxer = boxingListService.findAll();
        return boxer;
    }

    @GetMapping("/findNames") //エンドポイント例 http://localhost:8080/findNames?startsWith=I
    public List<Boxer> findByNames(@RequestParam String startsWith) {
        List<Boxer> boxers = boxingListService.findByNamesStartingWith(startsWith);
        return boxers;
    }

    @GetMapping("/boxers/{id}") //エンドポイント例 http://localhost:8080/boxers/1
    public Boxer findBoxer(@PathVariable("id") int id) {
        return boxingListService.findBoxer(id);
    }

    @GetMapping("/boxers/findByMatches")
    //エンドポイント例  http://localhost:8080/boxers/findByMatches?minMatches=40&maxMatches=50
    public List<Boxer> getBoxersByMatches(@RequestParam int minMatches, @RequestParam int maxMatches) {
        return boxingListService.findByNumberOfMatchesBetween(minMatches, maxMatches);
    }

}
