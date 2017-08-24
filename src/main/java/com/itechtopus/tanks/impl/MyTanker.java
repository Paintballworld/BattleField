package com.itechtopus.tanks.impl;

import com.itechtopus.tanks.interfaces.Field;
import com.itechtopus.tanks.interfaces.GameEngine;
import com.itechtopus.tanks.interfaces.Tank;
import com.itechtopus.tanks.interfaces.Tanker;
import com.itechtopus.tanks.interfaces.models.Direction;

import java.util.Random;

public class MyTanker implements Tanker {

    public static final String MY_NAME = "M. Kutuzov";
    public static final String GROUP_NAME = "greegto!";
    public static final String TANK_NAME = "Panzer Phantom 2000";

    private Tank tank;
    private GameEngine engine;
    private Field field;
    private int myId;

    @Override
    public void setMyTank(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void setMyId(int id) {
        myId = id;
    }

    @Override
    public void setGameEngine(GameEngine gameEngine) {
        this.engine = gameEngine;
        this.field = gameEngine.getField();
    }

    @Override
    public String getPlayerName() {
        return MY_NAME;
    }

    @Override
    public String getPlayerGroupName() {
        return GROUP_NAME;
    }

    @Override
    public String getTankName() {
        return TANK_NAME;
    }

    @Override
    public void run() {
        while (tank.isAlive()) {
            Random random = new Random(System.currentTimeMillis());
            if (random.nextInt(40) == 1) {
                if (random.nextBoolean())
                    tank.turnLeft();
                else
                    tank.turnRight();
            }

            if (random.nextInt(50) == 1) {
                if (random.nextBoolean())
                    tank.stop();
                else
                    tank.go();
            }

            if (random.nextInt(20) == 1 && tank.isRecharged()) {
                tank.fire();
            }

            if (field.getCellstrength(tank.getPosition().getPositionAhead()) > 0)
                tank.fire();
        }
    }
}
