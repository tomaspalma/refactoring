package pt.up.fe.ldts.example5;

public class TurtleEast extends TurtleState{

    @Override
    public void moveForward() {

    }

    @Override
    public void rotateRight() {
        turtle.setDirection(new TurtleSouth());
    }

    @Override
    public void rotateLeft() {
        turtle.setDirection(new TurtleNorth());
    }
}