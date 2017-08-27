package com.itechtopus.tanks.interfaces.field;

import com.itechtopus.tanks.interfaces.models.Direction;
import com.itechtopus.tanks.interfaces.models.Position;

public interface Field {

    /**
     * An int value of width of game field
     * @return positive int value
     * for now - it is allways 52
     */
    int getWidth();

    /**
     * An int value of height of game field
     * @return positive int value
     * for now - it is allways 52
     */
    int getHeight();

//    /**
//     * Returns an int value which represents a numeric
//     * value of strength of the block in position (x, y)
//     * @param position - position value of requesting block
//     * @return max_value..1 value if there is a block in a (x, y)
//     * position and 0 if there is no block,
//     * where max_value is defined by application
//     */
//    int getCellStrength(Position position);

    /**
     * Returns a position, representing location of a flag
     * of team according to teamId
     * @param tankId - id of team, which flag is requesting
     * @return a position of the flag
     */
    Position getFlagPosition(int tankId);


}
