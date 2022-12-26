package com.himanshi.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements GameConsole  {
    @Override
    public void up() {
        System.out.println("Pacman jump");
    }

    @Override
    public void down() {
        System.out.println("Pacman go down");
    }
}
