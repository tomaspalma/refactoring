package pt.up.fe.ldts.example5;

public class TurtleWest extends TurtleState {
    @Override
    public void moveForward() {

    }

    @Override
    public void rotateRight() {
        turtle.setDirection(new TurtleNorth());
    }

    @Override
    public void rotateLeft() {
        turtle.setDirection(new TurtleSouth());
    }
}
