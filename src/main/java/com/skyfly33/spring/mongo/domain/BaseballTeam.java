package com.skyfly33.spring.mongo.domain;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by donghoon on 15. 9. 5..
 */
@Document(collection = "baseball")
public class BaseballTeam {

    private int win;
    private int draw;
    private int lose;

    public BaseballTeam() {
    }

    public BaseballTeam(int win, int draw, int lose) {
        this.win = win;
        this.draw = draw;
        this.lose = lose;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }
}
