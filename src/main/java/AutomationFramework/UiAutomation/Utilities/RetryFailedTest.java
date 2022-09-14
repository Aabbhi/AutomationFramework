package AutomationFramework.UiAutomation.Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.internal.annotations.DisabledRetryAnalyzer;

public class RetryFailedTest implements IRetryAnalyzer{

	private int count=0;
	private int maxCount=3;
	public boolean retry(ITestResult r)
	{
		if(!r.isSuccess())
		{
			if(count<maxCount)
			{
				count++;
				r.setStatus(r.FAILURE);
				return true;
			}
			else
				r.setStatus(r.FAILURE);
		}
		else
			r.setStatus(r.SUCCESS);
		return false;
		
	}
}

