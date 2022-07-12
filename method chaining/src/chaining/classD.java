package chaining;

public class classD {
	classC D()
	{
		classC C=new classC();
		return C;
	}
	public static void main(String[] args) 
	{
		classD D=new classD();
		D.D().C().B().A();
	}

}
