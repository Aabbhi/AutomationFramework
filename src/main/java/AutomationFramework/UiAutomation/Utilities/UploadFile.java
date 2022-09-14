package AutomationFramework.UiAutomation.Utilities;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFile {

	private UploadFile()
	{
		
	}
	
	public static void uploadFileToPage() throws FindFailed, InterruptedException
	{
		String filepath ="C:\\Users\\Abhishek\\Desktop\\Eclipse project\\UiAutomation\\images\\";
	      String inputFilePath ="C:\\Users\\Abhishek\\Desktop\\document\\";
		Screen s=new Screen();
		Pattern filelocation= new Pattern(filepath+"file.jpg");
		Pattern open= new Pattern(filepath+"open1.jpg");
		s.wait(10);
		s.type(filelocation,inputFilePath+"testing.docx");
		s.wait(10);
		s.click(open);
		
	}
}
