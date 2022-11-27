package pt.up.fe.ldts.example5;

public class TurtleSouth extends TurtleState {
    @Override
    public void moveForward() {

    }

    @Override
    public void rotateRight() {
        turtle.setDirection(new TurtleWest());
    }

    @Override
    public void rotateLeft() {
        turtle.setDirection(new TurtleEast());
    }
}
