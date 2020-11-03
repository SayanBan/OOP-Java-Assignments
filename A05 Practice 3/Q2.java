import java.io.Console;
class Quiz
{
	public static void main(String args[])
	{
		int i=1,score=0;
		
		Console cn=System.console();
		
		System.out.println(":Name of the student:");
		String n=cn.readLine();
		
		System.out.print("Who is the inventor of Java?");
        
		
		
		char ch[];
		//ch[]={'J','A','M','E','S'};
		while(i<=3)
	{
        ch=cn.readPassword();
		if(ch[0]=='J'& ch[1]=='A'& ch[2]=='M'& ch[3]=='E'& ch[4]=='S')
		{
			System.out.println("Correct");
			score=5;
			i++;
		}
		else
		{
			System.out.println("Wrong,Try Again");
			score=0;
			i++;
		}
	}
	System.out.println("Cannot Attempt");
	System.out.println("Name of the student is "+n);
	System.out.println("Score is:"+score);
	}
}
