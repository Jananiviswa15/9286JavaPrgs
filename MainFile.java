import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainFile {

	public static void main(String args[]) {
		Result resultObtainedByRunningFiles = JUnitCore.runClasses(TestFile.class);
		
		for(Failure failMsg : resultObtainedByRunningFiles.getFailures()) {
			System.out.println(failMsg);
		}
		
		System.out.println(resultObtainedByRunningFiles.getFailureCount());
		System.out.println(resultObtainedByRunningFiles.wasSuccessful());
	}
}
