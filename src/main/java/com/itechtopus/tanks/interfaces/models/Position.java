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
         blocks which the object is built of, considering NOT only
         upper-left coordinates of blocks. For example:
         If the coordinates of tank's center are (4, 3) (pic5), then it's "body" is located
         from 2 up to 6 (!) on X axis, and from 1 to 5 (!) by the y
         axis. Because the tank is represented by a matrix of 4*4 blocks
         Leftmost block is in coordinates (2, 1) and bottom right corner
         is in (5, 4) coordinates, and takes the whole block.
         The getMinX() method in this case will return 2,
         getMaxX() returns 6,
         getMinY() returns 1,
         getMaxY() returns 5.


         Bullet goes on exact axises. When a bullet hits a target it
         affects on both sides of an axis.
         For example if a bullet, goes by x = 4 (upwards), when it reaches
         a wall of bricks it crushes every block which upper-left point is
         from x = 2 to x = 5 (pic3). But when the bullet reaches a tank, the
         tank block matrix must be in bullet.x - 1 .. bullet.x. Meaning that,
         in that example, where the bullet goes by x = 4, it hits tank only i
         f any of tank's blocks is in x = 3, or x = 4. Otherwise - tank bullet
         doesn't reach the tank (pic4)
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

        Позиция (как класс) содержит информацию о расположении всех блоков
        из которых построен объект, учитывая НЕ только левые-верхние точки
        блоков. Напрмимер:
        Если координаты центра танка (4, 3) (рис 1), то его "тело" расположено
        со 2-й по 6 (!) позицию по оси X и с 1-ой по 5-ую позицию по
        оси Y. Потому что танк представлен ввиду матрицы 4*4 блоков, самый
        верхний-левый из которых имеет координаты (2, 1), а правый нижний блок
        в координате (5, 4) и занимает весь этот блок.
        В таком случае метод getMinX() вернет 2,
        getMaxX() вернет 6,
        getMinY() вернет 1,
        getMaxY() вернет 5.

        Снаряд летит непосредственно по осям. Когда снаряд попадает в цель
        он создает уров по обеим сторонам от оси.
        Например, если снаряд летит по x = 4 (вверх), когда он достигнет
        кирпичной стены, он ломает каждый блок, верхняя-левая точка которого
        от x = 2 до x = 5 (рис3). Но когда снаряд попадает в танк, блок
        матрица танка должен быть в диапазоне от bullet.x - 1 .. bullet.x.
        Что означает, в том примере, где снаряд летит по ч = 4, он попадает
        в танк только если какой-нибудь из блоков танка находится в позиции
        x = 3 или x = 4. В противном случае, снаряд в танк не попадает (рис4)
     */

    /**
     * To retrieve a direction
     * @return a Direction instance, representing current direction
     */
    Direction getDirection();

    /**
     * @return a X component of Position (middle-point)
     */
    int getX();

    /**
     * @return a Y component of Position (middle-point)
     */
    int getY();

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
