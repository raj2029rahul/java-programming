class A{
	int i,j;
	void showij(){
		System.out.println("value of i and j :"+i+" "+j);
	}	
}
class B extends A{
	int k;
	void showk(){
		System.out.println("value of k :"+k);
	}
	void sum(){
		System.out.println("i+j+k :"+(i+j+k));
	}
}
class SimpleInheritence{
	public static void main(String args[]){
		A ob1=new A();
		B ob2=new B();
		ob1.i=12;
		ob1.j=24;
		ob1.showij();
		System.out.println();
		ob2.i=10;
		ob2.j=20;
		ob2.k=30;
		System.out.println("content of sub class is:");
		ob2.showij();
		ob2.showk();
		ob2.sum();
	}
}
