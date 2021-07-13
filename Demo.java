public class Demo{
	public static void main(String[] args){
	Box mybox=new Box();
	Box mybox1 =new Box();
	Box mybox2=new Box();
	mybox.length=10;
	mybox.width=10;
	mybox.height=10;
	mybox.volume();
	
	mybox1.length=11;
	mybox1.width=11;
	mybox1.height=11;
	mybox1.volume();
	
	mybox2.length=12;
	mybox2.width=12;
	mybox2.height=12;
	mybox2.volume();
	}
}
class Box{
	double length;
	double width;
	double height;
	public void volume(){
	System.out.println("volume is:"+length*width*height);
	}
}
