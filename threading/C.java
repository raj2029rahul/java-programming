package threading;

public class C extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int k=1;k<=5;k++)
		{
			System.out.println("\t from thread C:k="+k);
		}
		System.out.println("exit from C");
	}
	

}
