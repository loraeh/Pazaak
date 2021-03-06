package nl.rug.oop.cardgame.view;

import nl.rug.oop.cardgame.Game;
import nl.rug.oop.cardgame.view.buttons.NextTurn;
import nl.rug.oop.cardgame.view.buttons.PlayCard;
import nl.rug.oop.cardgame.view.buttons.Rules;
import nl.rug.oop.cardgame.view.buttons.StandButton;

import javax.swing.*;

/**
 * Panel with the buttons for the draw-class controllers
 */
public class ButtonBar extends JMenuBar {
    /**
     * Create a new ButtonBar with all the necessary buttons
     *
     * @param game The actual game, passed to the controllers
     */
    public ButtonBar(Game game) {
        add(new PlayCard(game,0));
        add(new PlayCard(game,1));
        add(new PlayCard(game,2));
        add(new PlayCard(game,3));
        add(new NextTurn(game));
        add(new StandButton(game));
        add(new Rules(game));
    }
}
