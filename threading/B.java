package threading;

public class B extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int j=1;j<=5;j++)
		{
			System.out.println("\t from thraed B:j="+j);
		}
		System.out.println("exit from B");
	}
	

}
