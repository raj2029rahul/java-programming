package threading;

public class A extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=1;i<=5;i++)
		{
			System.out.println("\t from thread A:i="+i);
		}
		System.out.println("exit from A");
	}
	

}
