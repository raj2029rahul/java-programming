class AccessTest{
	public static void main(String[] args){
		Test ob=new Test();
		ob.a=12;
		ob.b=24;
		//ob.c=36;this will give error as c is declared as private
		ob.setc(36); //here we can access c through its claass method
		System.out.println("value of a,b and c is:"+ob.a+" "+ob.b+" "+ob.getc());
	}
}

class Test{
	int a;
	public int b;
	private int c;
	void setc(int i){
		c=i;
	}
	int getc(){
		return c;
	}
}
