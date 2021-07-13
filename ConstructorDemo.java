class Boxx{
	double length;
	double width;
	double height;
	Boxx(){
		length=10;
		width=5;
		height=3;
	}
	double volume(){
		return length*width*height;
	}
}
public class ConstructorDemo{
	public static void main(String[] args){
		Boxx mybox=new Boxx();
		double vol;
		vol=mybox.volume();
		System.out.println("volume: "+vol);
	}
}
