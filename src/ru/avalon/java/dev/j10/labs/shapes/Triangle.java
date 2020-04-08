package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    private FloatPoint rightCorner;
    private FloatPoint upCorner;
    private FloatPoint leftCorner;
    private int rotation;

    public Triangle(FloatPoint rightCorner, FloatPoint upCorner, FloatPoint leftCorner, int rotation) {
        this.rightCorner = rightCorner;
        this.upCorner = upCorner;
        this.leftCorner = leftCorner;
        this.rotation = rotation;
    }
//------------------------------------------------------------------------------------------------------------
    public void setRotation(int rotation) {
        this.rotation = rotation;
    }
//------------------------------------------------------------------------------------------------------------
    public FloatPoint getRightCorner() {
        return rightCorner;
    }

    public FloatPoint getUpCorner() {
        return upCorner;
    }

    public FloatPoint getLeftCorner() {
        return leftCorner;
    }

    @Override
    public float getPerimeter() {
        float a=this.getLineLenght(rightCorner, upCorner);        
        if (a!=0){
            float b=this.getLineLenght(upCorner, leftCorner);            
            if (b!=0){
                float c=this.getLineLenght(leftCorner, rightCorner);                
                if(c!=0){
                    return a+b+c;
                }
            }
        }
        return 0f;
    }

    @Override
    public float getArea() {
        //По формуле Герона
        float p = (this.getPerimeter())/2;        
        return (float) Math.sqrt(p*(p-this.getLineLenght(rightCorner, upCorner))*
                                   (p-this.getLineLenght(upCorner, leftCorner))*
                                   (p-this.getLineLenght(leftCorner, rightCorner)) );
    }

    @Override
    public int getRotation() {
        return rotation;
    }

    @Override
    public String toString() {
        return "Triangle{" + "rightCorner=" + rightCorner + ", upCorner=" + upCorner + ", leftCorner=" + leftCorner + ", rotation=" + rotation + '}';
    }
}
