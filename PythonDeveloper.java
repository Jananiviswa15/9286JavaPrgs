package BeanCreation;

import org.springframework.stereotype.Component;

@Component("dev")
public class PythonDeveloper implements Developers{

	@Override
	public void developApps() {
		System.out.println("create apps by using python");
		
	}

}
