package com.itechtopus.tanks.interfaces;

public interface Tanker extends Runnable{

    /**
     * Method to set a tank link
     */
    void setMyTank(Tank tank);

    /**
     * Method to set a tank's id
     */
    void setMyId(int id);

    /**
     * Method to set a game engine link
     */
    void setGameEngine(GameEngine gameEngine);

    /**
     * Method must return a player's name
     * @return a String name value
     */
    String getPlayerName();

    /**
     * Method must return a player's group name
     * @return a String groupName value
     */
    String getPlayerGroupName();

    /**
     * Method must return a tank's name
     * @return a String tank name value
     */
    String getTankName();

    /**
     * Main game process goes here
     */
    @Override
    void run();
}
