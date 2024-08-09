package views;

import controllers.GameController;

public interface GameViewable {

    void setController(GameController gc);

    void launch();
}
