package com.example.boxinglist;

public class Boxer {
    private int id;

    private String name;

    private int numberOfMatches;

    private int win;
    private int ko;
    private int loss;
    private int draw;

    public Boxer(int id, String name, int numberOfMatches, int win, int ko, int loss, int draw) {
        this.id = id;
        this.name = name;
        this.numberOfMatches = numberOfMatches;
        this.win = win;
        this.ko = ko;
        this.loss = loss;
        this.draw = draw;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public int getWin() {
        return win;
    }

    public int getKo() {
        return ko;
    }

    public int getLoss() {
        return loss;
    }

    public int getDraw() {
        return draw;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfMatches(int numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setKo(int ko) {
        this.ko = ko;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}
