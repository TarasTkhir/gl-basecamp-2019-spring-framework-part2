package com.controllers;

import com.wire.ResponseGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.services.GameService;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameControler {

    @Autowired
    GameService game;


    @ResponseBody
    @GetMapping("/{guessNumber}")
    public ResponseEntity<ResponseGame> play(@PathVariable int guessNumber) {
        System.out.println(game.game(guessNumber));
        return ResponseEntity.ok().body(game.game(guessNumber));

    }
}