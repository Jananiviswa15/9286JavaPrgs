package BeanCreation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@Component
//@Primary
public class JavaDeveloper implements Developers{

	@Override
	public void developApps() {
System.out.println("create apps by using java");
		
	}

}
