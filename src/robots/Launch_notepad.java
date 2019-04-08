package robots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Launch_notepad 
{

	public static void main(String[] args) throws IOException, AWTException 
	{
		//Launch Notepad at Runtime
		Runtime.getRuntime().exec("Notepad.exe");
		
		//Create Object for Robot
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_H);
				
		
		
		
		
		
		

	}

}
