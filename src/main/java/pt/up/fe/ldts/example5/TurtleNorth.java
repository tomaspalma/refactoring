package pt.up.fe.ldts.example5;

public class TurtleNorth extends TurtleState {
    @Override
    public void moveForward() {

    }

    @Override
    public void rotateRight() {
        turtle.setDirection(new TurtleEast());
    }

    @Override
    public void rotateLeft() {
        turtle.setDirection(new TurtleWest());
    }
}
