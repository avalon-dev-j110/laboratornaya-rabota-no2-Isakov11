package ru.avalon.java.dev.j10.labs.shapes;


public class FloatPoint implements Point {
    private float X;
    private float Y;

    public FloatPoint(float X, float Y) {
        this.X = X;
        this.Y = Y;
    }

    public float getX() {
        return X;
    }

    public float getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "FloatPoint{" + "X=" + X + ", Y=" + Y + '}';
    }
    
}
