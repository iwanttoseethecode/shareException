package level;

public class Rectangle implements Figure {
	
	final double height;  
    final double width;  
  
    Rectangle(double height, double width) {  
        this.height = height;  
        this.width  = width;  
    }  
	
	@Override
	public double area() {
		return height * width;
	}

}
