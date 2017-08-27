package com.itechtopus.tanks.interfaces.models;

public interface Position {

    /*
         ENG:
         Each object on a field is represented with a
         set of blocks, which have common sides
         for example:
            a tank is a matrix of 4*4 blocks
            a cement block - is a matrix of 2*2 blocks
            a brick wall - is a set of brick blocks 1*1

         The coordinates of a block is a pair of numbers (x and y),
         which are pointing to an upper-left point of a block, meaning,
         for example, that a simple brick block with given
         coordinates (0, 0) is located between 0 and 1 by X axis,
         and 0 and 1 by Y.

         The Position (as a class) holds an information of all
         blocks which the object is built of, considering that
         only upper-left coordinates of blocks. For example:
         If a tank's coordinates are (2, 1) (pic 1), it's "body" is located
         from 2 up to 6 (!) on X axis, and from 1 to 5 (!) by the y
         axis. Because the tank consists of a matrix of 4*4 blocks
         Leftmost block is in coordinates (2, 1) and bottom right corner
         is in (5, 4) coordinates.
     */

    /*
        РУС:
        Каждый объект поля представлен в виде набора блоков, которые
        имеют общие стороны, например:
            танк - это матрицы из 4*4 блоков
            цементный блок - матрица из 2*2 блоков
            кирпичная стена - набор из кирпичных блоков 1*1

        Координатами блока является пара чиесл (x и y), которые указывают
        на верхнюю-левую точку блока, что означает, например, что
        простой кирпичный блок с данными координатами (0, 0) расположен
        между 0 и 1 координатами по оси X и 0 и 1 координатами по оси Y
     */

    /**
     * To retrieve a direction
     * @return a Direction instance, representing current direction
     */
    Direction getDirection();

    /**
     * @return X - X coordinate of the leftmost point of
     * this object
     */
    int getMinX();

    /**
     * @return Y - coordinate of the highest point of
     * this object
     */
    int getMinY();

    /**
     * @return X - X coordinate of the rightmost point of
     * this object
     */
    int getMaxX();

    /**
     * @return Y - coordinate of the lowest point of
     * this object
     */
    int getMaxY();
}
