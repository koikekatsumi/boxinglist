package com.example.boxinglist;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoxingListService {
    private final BoxingListMapper boxingListMapper;

    public BoxingListService(BoxingListMapper boxingListMapper) {

        this.boxingListMapper = boxingListMapper;
    }

    public List<Boxer> findAll() {
        return boxingListMapper.findAll();
    }

    public List<Boxer> findByNamesStartingWith(String startsWith) {
        return boxingListMapper.findByNamesStartingWith(startsWith);
    }

    public Boxer findBoxer(int id) {
        return boxingListMapper.findById(id)
                .orElseThrow(() -> new BoxingListNotFoundException("Boxer with id " + id + " not found"));
    }

    public List<Boxer> findByNumberOfMatchesBetween(int minMatches, int maxMatches) {
        return boxingListMapper.findByNumberOfMatchesBetween(minMatches, maxMatches);
    }

}
