public class New{
	public static void main(String[] args){
			Old ol=new Old();
			ol.purpose();
			ol.display();
		}
}
class Old extends Newold{
	void purpose(){
		System.out.println("just for testing purpose....");
}
}
class Newold{
	public void display(){
	System.out.println("goodbye tata");
}
}
