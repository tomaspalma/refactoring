package pt.up.fe.ldts.example5;

public class Turtle {
    private int row;
    private int column;
    protected TurtleState direction;

    public Turtle(int row, int column, TurtleState direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
        direction.setTurtle(this);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public TurtleState getDirection() {
        return direction;
    }

    public void setDirection(TurtleState direction) {
        this.direction = direction;
    }

    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            direction.rotateLeft();
        } else if (command == 'R') { // ROTATE RIGHT
            direction.rotateRight();
        } else if (command == 'F'){ // MOVE FORWARD
            direction.moveForward();
        }
    }
}
