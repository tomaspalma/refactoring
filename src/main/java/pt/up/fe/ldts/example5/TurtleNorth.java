package pt.up.fe.ldts.example5;

public class TurtleNorth extends TurtleState {
    @Override
    public char getCharRepresentationOfDirection() {
        return 'N';
    }

    @Override
    public void moveForward() {
        this.turtle.setRow(this.turtle.getRow() - 1);
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
