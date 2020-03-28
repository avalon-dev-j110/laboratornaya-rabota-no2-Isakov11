package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    
    private FloatPoint leftDownCorner;   
    private FloatPoint rightUpCorner;    
    private int rotation;

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    public Rectangle(FloatPoint leftDownCorner, FloatPoint rightUpCorner, int rotation) {
        this.leftDownCorner = leftDownCorner;
        this.rightUpCorner = rightUpCorner;        
        this.rotation = rotation;
    }
 //------------------------------------------------------------------------------------------------------------
    public void setRotation(int rotation) {
        this.rotation = rotation;
    }
 //------------------------------------------------------------------------------------------------------------   
    
    public FloatPoint getLeftDownCorner() {
        return leftDownCorner;
    }

    public FloatPoint getRightUpCorner() {
        return rightUpCorner;
    }
   
    @Override
    public float getPerimeter() {
       return 2*(this.getLineLenght(new FloatPoint(rightUpCorner.getX(),leftDownCorner.getY()), rightUpCorner)+
               this.getLineLenght(new FloatPoint(rightUpCorner.getX(),leftDownCorner.getY()), leftDownCorner));
    }

    @Override
    public float getArea() {
        return (this.getLineLenght(new FloatPoint(rightUpCorner.getX(),leftDownCorner.getY()), rightUpCorner)*
               this.getLineLenght(new FloatPoint(rightUpCorner.getX(),leftDownCorner.getY()), leftDownCorner));
    }

    @Override
    public int getRotation() {
        return rotation;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "leftDownCorner=" + leftDownCorner + ", rightUpCorner=" + rightUpCorner + ", rotation=" + rotation + '}';
    }
    
}
