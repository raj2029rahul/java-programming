class Figure{
	double dim1;
	double dim2;
	Figure(double a,double b){
		dim1=a;
		dim2=b;
	}
	double area(){
		return 0.0;
	}
}
class Circle extends Figure{
	Circle(double a){
		super(a,a);
	}
	double area(){
		return 3.14*dim1*dim2;
	}	
}
class Triangle extends Figure{
	Triangle(double a,double b){
		super(a,b);
	}
	double area(){
		return (dim1*dim2)/2;
	}
}
class Rectangle extends Figure{
	Rectangle(double a,double b){
		super(a,b);
	}
	double area(){
		return dim1*dim2;
	}
}
class Square extends Figure{
	Square(double a){
		super(a,a);
	}
	double area(){
		return dim1*dim2;
	}
}
class Figure_Area{
	public static void main(String[] args){
		Figure f=new Figure(10,10);
		Circle c=new Circle(8);
		Triangle t=new Triangle(15,6);
		Rectangle r=new Rectangle(12,10);
		Square s=new Square(10);
		Figure fg;
		fg=c;
		System.out.println("area of circle:"+fg.area());
		fg=t;
		System.out.println("area of triangle:"+fg.area());
		fg=r;
		System.out.println("area of rectangle:"+fg.area());
		fg=s;
		System.out.println("area of square:"+fg.area());
		fg=f;
		System.out.println("area of figure:"+fg.area());
	}
}
