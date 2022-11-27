package pt.up.fe.ldts.example5;

public class TurtleSouth extends TurtleState {
    @Override
    public char getCharRepresentationOfDirection() {
        return 'S';
    }

    @Override
    public void moveForward() {
        this.turtle.setRow(this.turtle.getRow() + 1);
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
