package oop.pojo.abstracts;

import oop.interfaces.Drawable;

public abstract class AbstractBFObject implements Drawable {

    private int x;
    private int y;

    public AbstractBFObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }
}
