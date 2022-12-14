package pt.up.fe.ldts.example5;

public class TurtleWest extends TurtleState {
    @Override
    public char getCharRepresentationOfDirection() {
        return 'W';
    }

    @Override
    public void moveForward() {
        this.turtle.setColumn(this.turtle.getColumn() - 1);
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
