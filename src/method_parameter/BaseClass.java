package method_parameter;



public class BaseClass 
{
	public void toolName()
	{
		//Without Parameteres
		
		String tool="WebDriver";
		System.out.println(tool);
	}
	
	public void toolName(String ToolName)
	{
		String tool=ToolName;
		System.out.println("Targeted Paramenter => "+ ToolName);
				
	}
	
	public void toolName(String ToolName, double price)
	{
		String tool=ToolName;
		double rate=price;
		System.out.println(tool+" Price is => "+rate);
		
				
	}
	
	public void Math(int X, int Y)
	{
		int Z=X+Y;
		
		System.out.println(Z);
		
		}
	
	
	
	public static void main(String[] args)
	{
		BaseClass BC=new BaseClass();
		
		
		BC.toolName();
		BC.toolName("WebDriver");
		BC.toolName("WebDriver", 50.55);
		
	
		
		
	}

}
