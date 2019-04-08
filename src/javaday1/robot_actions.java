package javaday1;

public class robot_actions 
{
	public static void run()
	{
		System.out.println("Run Executed");
	}
	public static void walk()
	{
		System.out.println("Walk Executed");
	}
	public static void jog()
	{
		System.out.println("Jog Executed");
	}
	public static void main(String[] args) 
	{
		
		robot_actions.jog();
		robot_actions.run();
		robot_actions.walk();
		
		jog();
		run();
		walk();
		
		
		
		
		
	}
}
