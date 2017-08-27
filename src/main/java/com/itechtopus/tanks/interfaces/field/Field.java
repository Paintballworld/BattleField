package com.itechtopus.tanks.interfaces.field;

import com.itechtopus.tanks.interfaces.models.*;

public interface Field {

    /**
     * An int value of width of game field
     * @return positive int value
     * by default - it is always 52
     */
    int getWidth();

    /**
     * An int value of height of game field
     * @return positive int value
     * by default - it is always 52
     */
    int getHeight();

    /**
     * Returs BlockType of block, which is located in (x, y)
     * @param x - X coordinate
     * @param y - Y coordinate
     * @return a BlockType or null, if there is not block
     */
    BlockType getBlockAt(int x, int y);

    /**
     * Will return a block type, which is located in the
     * point at (point.getX(), point.getY())
     * @param point - point
     * @return BlockType or null, if block is empty
     */
    BlockType getBlockAt(Point point);

    /**
     * Returns a position, representing location of a flag
     * of team according to teamId
     * @param tankId - id of team, which flag is requesting
     * @return a position of the flag
     */
    Position getFlagPosition(int tankId);

    /**
     * Returns an array of BlockTypes of all field
     * @return an matrix of BlockTypes
     */
    BlockType[][] getAllBlocks();

    /**
     * Get the farthest position which given model can go
     * @return a Position instance, which shows a maximum
     * position that this model could get, moving to current direction
     * Position of the model is not changing
     */
    Position getFarthestPositionFor(MovingModel model);

    /**
     * Return a Position of hypothetical movement to passed direction
     * model's coordinates are not mentioned to change
     * @return a Position instance, which shows a maximum
     * position that this tank could get, moving to given direction
     */
    Position getFarthestPositionFor(MovingModel model, Direction direction);



}
