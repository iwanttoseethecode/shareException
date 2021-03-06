package tip20;

class Figure {  
    enum Shape { RECTANGLE, CIRCLE };  
  
    final Shape shape;  
  
    double height;  
    double width;  
  
    double radius;  
  
    Figure(double radius) {  
        shape = Shape.CIRCLE;  
        this.radius = radius;  
    }  
  
    // Constructor for rectangle  
    Figure(double length, double width) {  
        shape = Shape.RECTANGLE;  
        this.height = length;  
        this.width = width;  
    }  
  
    double area() {  
        switch(shape) {  
          case RECTANGLE:  
            return height * width;  
          case CIRCLE:  
            return Math.PI * (radius * radius);  
          default:  
            throw new AssertionError();  
        }  
    }  
}  

/*
 * 坏处：1.冗长，阅读麻烦； 2.对这个对象需要了解很多，缺少面向对象的思考；3.所有东西放在一个类里面修改特别麻烦。
		4.逻辑太多,出现bug的几率很高
*/
