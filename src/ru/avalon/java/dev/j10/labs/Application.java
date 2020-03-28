package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Application {
    public static void main(String[] args) {
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         */        
        Shape[] shapes = {
            new Circle(new FloatPoint(1.2f, 2.3f), 3f),
            new Circle(new FloatPoint(5.1f, 10.3f), 4f),
            new Triangle(new FloatPoint(0f, 0f), new FloatPoint(0f, 2f),new FloatPoint(2f, 0f),180),
            new Triangle(new FloatPoint(10f, 5f), new FloatPoint(15f, 0f),new FloatPoint(6f, -8f),70),
            new Triangle(new FloatPoint(7f, 2f), new FloatPoint(4f, 9f),new FloatPoint(-3f, 0f),80),
            new Circle(new FloatPoint(15f, -6f), 2f),
            new Rectangle(new FloatPoint(0f, 0f), new FloatPoint(15f, 4f),0),
            new Rectangle(new FloatPoint(0f, 0f), new FloatPoint(5f, 5f),0),
            new Rectangle(new FloatPoint(0f, 0f), new FloatPoint(4f, 4f),0),
            new Rectangle(new FloatPoint(0f, 0f), new FloatPoint(3f, 3f),0)
        };
         /*
         *2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
         Shape maxShape = MaxArea(shapes);
         System.out.println(maxShape + ", "+ maxShape.getArea());         
    }
    
    static Shape MaxArea(Shape Shapes[]){        
        if (Shapes.length == 0){
            return null;
        }
        Shape tempShape;
        try{
            tempShape = Shapes[0];        
            for(int i=1;i<Shapes.length;i++){        
                if (Shapes[i].getArea() > tempShape.getArea()){                
                    tempShape = Shapes[i];
                }        
            }
        }
        catch (NullPointerException e){
            return null;
        }
        return tempShape;
    };
}
