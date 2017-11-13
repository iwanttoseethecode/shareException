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
 * ������1.�߳����Ķ��鷳�� 2.�����������Ҫ�˽�ܶ࣬ȱ����������˼����3.���ж�������һ���������޸��ر��鷳��
		4.�߼�̫��,����bug�ļ��ʺܸ�
*/