package session5_assignment1;
import figure.Figure;



class Circle extends Figure{



public void findArea(){         //method to find the area of Circle
System.out.println("Area of circle is "+(2*Math.PI*dim1*dim1));
}
public void findPerimeter(){      //method to find the perimeter
System.out.println("Perimeter of Circle is "+2*Math.PI*dim1);
}
}

class Rectangle extends Figure{



public void findArea(){           //method to find the area of retangle
System.out.println("Area of Rectangle is "+dim1*dim1);
}
public void findPerimeter(){         //method to find the perimeter rectangle
System.out.println("Perimeter of Rectangle is "+4*dim1);
}
}


class Triangle extends Figure{

//Since there is only one dimension I am making this triangle as a equilateral Triangle



public void findArea(){                //method to find the area
System.out.println("Area of Triangle is :"+(Math.sqrt(3)*dim1*dim1)/4);
}
public void findPerimeter(){          //method to find the perimeter of Triangle
System.out.println("Perimeter of Triangle is "+3*dim1);
}
public static void main(String args[]){
Circle circle =new Circle();           //object of class Circle 
Rectangle rectangle = new Rectangle(); //object of class Rectangle
Triangle triangle = new Triangle();    //object of class Triangle



//details of all three figure are being printed
System.out.println("Circle details :"); 
circle.findArea();
 circle.findPerimeter();

System.out.println("Triangle details :"); 
triangle.findArea();
 triangle.findPerimeter();


System.out.println("Rectangle details :"); 
rectangle.findArea();
rectangle.findPerimeter();


}  
}



