package sg.edu.ntu.chapterSix.sixFour;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {

        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString(){
        return "("+this.center.x+", "+this.center.y+") speed=("+this.center.xSpeed+", "+this.center.ySpeed+") radius="+this.radius;
    }
    public void moveUp(){
        this.center.y -= this.center.ySpeed;
    }
    public void moveDown(){
        this.center.y += this.center.ySpeed;
    }
    public void moveLeft(){
        this.center.x -= this.center.xSpeed;
    }
    public void moveRight(){
        this.center.x += this.center.xSpeed;
    }
}
