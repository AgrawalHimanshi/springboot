package com.himanshi.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Game {
    /**
     * if constructor is not present then its is
     * field level injection
     */
    @Autowired
    private  GameConsole game;

    /**
     * Recommended:
     * presence of contructor made it
     * constructor level injection
     * @param game
     */
    public Game(GameConsole game) {
        this.game = game;
    }

    /**
     * setter based injection
     */
//    @Autowired
//    public void setGame(GameConsole game) {
//        this.game = game;
//    }

    public void run(){
        game.up();
        game.down();
    }
}
