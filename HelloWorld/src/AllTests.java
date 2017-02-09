
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.AddTest;
import com.SubTest;

@RunWith(Suite.class)
@SuiteClasses({ com.AddTest.class, com.SubTest.class })
public class AllTests {
	
	public static void main(String args[]) {
		Result result = org.junit.runner.JUnitCore.runClasses(AllTests.class);
	    for (Failure failure : result.getFailures()) {
	       System.out.println(failure.toString());
	    }
	    System.out.println(result.wasSuccessful());
		 }

}
