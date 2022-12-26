package com.himanshi;

import com.himanshi.game.Game;
import com.himanshi.game.Mario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        Game runner = context.getBean(Game.class);
//        Mario game=new Mario();
//        Pacman game=new Pacman();
//        Game runner= new Game(game);

        runner.run();
    }
}