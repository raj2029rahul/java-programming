class Box1{
	double length;
	double width;
	double height;
	void setDim(double l,double w,double h){
		length=l;
		width=w;
		height=h;
	}
	double volume(){
	 return length*width*height;
	}
}
public class Demo1{
	public static void main(String[] args){
		double vol;
		Box1 mybox=new Box1();
		mybox.setDim(5,6,7);
		vol=mybox.volume();
		System.out.println("volume="+vol);
	}
}
