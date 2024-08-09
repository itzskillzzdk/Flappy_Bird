package controllers;

import models.Bird;
import models.Ground;
import views.GameViewable;

import static config.GameConfiguration.GROUND_DIMENSION;
import static config.GameConfiguration.GROUND_POSITION;

public class GameController {

    private Bird bird;
    private Ground ground;
    private GameViewable view;
    private GameState gameState;

    public GameController(GameViewable view) {
//        this.bird = new Bird();
        this.view = view;
        this.ground = new Ground(GROUND_POSITION, (int) GROUND_DIMENSION.getWidth(), (int) GROUND_DIMENSION.getHeight());
        this.gameState = GameState.Home;
        view.setController(this);
    }

    public void run() {
        switch(gameState) {
            case Home:
                view.launch();
                break;
            case Playing:
                startPlaying();
                break;
            case Loose:

                break;
        }
    }

    public void startPlaying() {
        if(gameState != GameState.Playing) {
            /*
            TODO: Code...
             */
            gameState = GameState.Playing;
        }
        this.run();
    }

    public void exitGame()  {
        System.exit(0);
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
