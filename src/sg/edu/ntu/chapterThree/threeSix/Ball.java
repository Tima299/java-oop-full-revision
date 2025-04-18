package sg.edu.ntu.chapterThree.threeSix;

public class Ball {
    private float x;
    private float y;
    private float radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, float radius, float speed, float direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed * Math.cos(direction));
        this.yDelta = (float) (-speed * Math.sin(direction));
    }

    public float getX() {
        return x;
}

public void setX(float x) {
    this.x = x;
}

public float getY() {
    return y;
}

public void setY(float y) {
    this.y = y;
}

public float getRadius() {
    return radius;
}

public void setRadius(float radius) {
    this.radius = radius;
}

public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    public void reflectVertical() {
        yDelta = -yDelta;
    }
    public String toString() {
        return "Ball [ (" + x + ", " + y + "), speed (" + xDelta + ", " + yDelta + ")]";
    }
}
