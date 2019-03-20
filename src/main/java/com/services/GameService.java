package com.services;

import com.wire.ResponseGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class GameService {

    private NumberGenerator numberGenerator;

    @Autowired
    public void setNumberGenerator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public ResponseGame game(int guessNumber) {

        int i = numberGenerator.numberGenerator();

        if (i == guessNumber) {
            return new ResponseGame("Your guess is: " +guessNumber,"W_I_N_N_E_R_!");

        }

        return  new ResponseGame("Your guess is: " +guessNumber,"L_O_O_S_E");
    }

}
