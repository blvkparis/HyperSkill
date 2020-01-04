package com.company;

/**
 * TODO Enum Task - Robot
 *
 */
public class RobotControl {

    public class Robot {

        private int x;
        private int y;
        private Direction direction;

        public Direction getDirection() {
            return this.direction;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void turnLeft() {
            switch (this.direction) {
                case UP:
                    this.direction = Direction.LEFT;
                    break;
                case DOWN:
                    this.direction = Direction.RIGHT;
                    break;
                case LEFT:
                    this.direction = Direction.DOWN;
                    break;
                case RIGHT:
                    this.direction = Direction.UP;
                    break;
            }
        }

        public void turnRight() {
            switch (this.direction) {
                case UP:
                    this.direction = Direction.RIGHT;
                    break;
                case DOWN:
                    this.direction = Direction.LEFT;
                    break;
                case LEFT:
                    this.direction = Direction.UP;
                    break;
                case RIGHT:
                    this.direction = Direction.DOWN;
                    break;
            }
        }

        public void stepForward() {
            switch (this.direction) {
                case UP:
                    this.y++;
                    break;
                case DOWN:
                    this.y--;
                    break;
                case LEFT:
                    this.x--;
                    break;
                case RIGHT:
                    this.x++;
                    break;
            }
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX && robot.getY() != toY) {
            if (robot.getX() > toX && toY >= 0)
            {
                while (robot.getDirection() != Direction.UP)
                    robot.turnRight();
                while (robot.getX() != toX)
                    robot.stepForward();

            }
        }
    }
}
