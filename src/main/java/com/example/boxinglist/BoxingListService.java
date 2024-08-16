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
        List<Boxer> boxers = boxingListMapper.findByNamesStartingWith(startsWith);
        if (startsWith == null || startsWith.trim().isEmpty()) {
            throw new BoxingListNotFoundException("空白入力では、Boxerは検索できません。");
        }
        if (boxers.isEmpty()) {
            throw new BoxingListNotFoundException
                    ("ボクシングリストに　" + startsWith + "　から始まる文字のBoxerは見つかりません。");
        }
        return boxers;
    }

    public Boxer findBoxer(int id) {
        return boxingListMapper.findById(id)
                .orElseThrow(() -> new BoxingListNotFoundException("Boxer with id " + id + " not found"));
    }

    public List<Boxer> findByNumberOfMatchesBetween(Integer minMatches, Integer maxMatches) {
        List<Boxer> boxers = boxingListMapper.findByNumberOfMatchesBetween(minMatches, maxMatches);
        if (boxers.isEmpty()) {
            throw new BoxingListNotFoundException("指定された試合数範囲に該当するボクサーはいません。");
        }
        return boxers;
    }
}
