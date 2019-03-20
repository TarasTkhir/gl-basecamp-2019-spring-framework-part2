package com.services;

import com.wire.ResponseGame;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GameServiceTest {


    @InjectMocks
    GameService gameService;

    @Mock
    NumberGenerator numberGenerator;


    @Test
    public void whenMethodGameCalledThenReturnWinnerIfGuessNumberEqualsActualRandomNumber() {
        gameService = new GameService();
        numberGenerator = Mockito.mock(NumberGenerator.class);
        when(numberGenerator.numberGenerator()).thenReturn(1);
        gameService.setNumberGenerator(numberGenerator);

        assertEquals("W_I_N_N_E_R_!", gameService.game(1).getResult());
    }

    @Test
    public void whenMethodGameCalledThenReturnLooseIfGuessNumberNotEqualsActualRandomNumber() {
        gameService = new GameService();
        numberGenerator = Mockito.mock(NumberGenerator.class);
        when(numberGenerator.numberGenerator()).thenReturn(1);
        gameService.setNumberGenerator(numberGenerator);

        assertEquals("L_O_O_S_E", gameService.game(2).getResult());
    }
}
