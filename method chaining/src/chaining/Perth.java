package chaining;

public class Perth implements InterPerth{
public InterSydney Perth()
{
	InterSydney s=new Sydney();
	return s;
}

public static void main(String[] args)
{
	InterPerth p=new Perth();
	p.Perth().sydney1().Adelaide1();
}
    
}
