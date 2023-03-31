package oop.lab06.ex1p3;

public class Point2D {
    float x, y;

    public Point2D(float x, float y) {
        this.x= x;
        this.y = y;
    }

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {x, y};
        return arr;
    }

    public String toString() {
        return "(" + this.x
                + "," + this.y + ")";
    }
}
