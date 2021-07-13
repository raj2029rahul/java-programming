package threading;
class multi1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\t from thread 1:i="+i);
		}
	}
};

class multi2 implements Runnable
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("\t from thread 1:j="+j);
		}
	}
};


public class Threaddebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi1 m1=new multi1();
		m1.start();
		Runnable m2=new multi2();
		Thread threadx=new Thread(m2);
		threadx.start();
	}

}
