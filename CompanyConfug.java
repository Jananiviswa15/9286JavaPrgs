package BeanCreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //replacement of you beans.xml
@ComponentScan(basePackages = "BeanCreation")
public class CompanyConfug {

/*	
	@Bean(name = {"bean1", "bean2"})
	//default name -> method name
	public Company createCompanyBean() {
		
//		Company obj = new Company();
//		obj.setManager(createManagerBean());
//		obj.setDev(createDevBean());
		return new Company(createManagerBean(),createDevBean() );
		//new Company(manager obj);
	//	return obj;
	}
	
	@Bean
	public Developers createDevBean() {
		
		//return new JavaDeveloper();
		return new PythonDeveloper();
		
	}
	@Bean
	public Manager createManagerBean() {
		return new Manager();
	}*/
}
