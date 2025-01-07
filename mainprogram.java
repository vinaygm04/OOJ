class BMSCE extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("BMSCE");
			try{Thread.sleep(10000);}
			catch(InterruptedException e){}
		}
	}
}
class CSE extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("CSE");
			try{Thread.sleep(2000);}
			catch(InterruptedException e){}
		}
	}
}
class mainprogram
{
public static void main(String args[])
	{
		BMSCE b=new BMSCE();
		CSE c=new CSE();
		b.start();
		c.start();
	}
}
