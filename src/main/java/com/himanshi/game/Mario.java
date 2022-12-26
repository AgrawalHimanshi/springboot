package com.himanshi.game;

import org.springframework.stereotype.Component;

@Component
public class Mario implements GameConsole {


    @Override
    public void up() {
        System.out.println("Mario jump");
    }

    @Override
    public void down() {
        System.out.println("Mario go down");
    }
}
