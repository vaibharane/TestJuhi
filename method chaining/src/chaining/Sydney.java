package chaining;

public class Sydney implements InterSydney{
	public InterAdelaide sydney1()
	{
		InterAdelaide a=new Adelaide();
		return a;
	}

}
