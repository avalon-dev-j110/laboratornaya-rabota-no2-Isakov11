package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    private FloatPoint center;
    private float radius;

    public Circle(FloatPoint center, float radius) {
        this.center = center;
        this.radius = Math.abs(radius);
    }
    
    public FloatPoint getCenter() {
        return center;
    }

    public float getRadius() {
        return radius;
    }
        
    @Override
    public float getArea(){
        return (float) Math.PI*radius*radius;
    };

    @Override
    public float getLength() {
        return (float) Math.PI*radius*2;
    }
    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
}
