package pt.up.fe.ldts.example5;

public class TurtleEast extends TurtleState{

    @Override
    public char getCharRepresentationOfDirection() {
        return 'E';
    }

    @Override
    public void moveForward() {
        this.turtle.setColumn(this.turtle.getColumn() + 1);
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
