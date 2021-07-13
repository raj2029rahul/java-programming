class Cube{
	double length;
	double width;
	double height;
	Cube(double l,double w,double h){
		length=l;
		width=w;
		height=h;
	}
	double volume(){
		return length*width*height;
	}
}
public class ParameterConstructor{
	public static void main(String[] args){
		Cube mycube=new Cube(3,3,3);
		double vol;
		vol=mycube.volume();
		System.out.println("volume: "+vol);
	}
}
