package BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SampleClass{// implements InitializingBean, DisposableBean{

	//by xml config
//	void init() {
//		System.out.println("when bean is created it ll be called auto");
//	}
//	
//	void destroy() {
//		System.out.println("ioc is closed this method is called auto");
//	}
	
	
	
//imple interf
//	@Override
//	public void afterPropertiesSet() throws Exception {
//System.out.println("when bean is created it ll be called auto");
//		
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("ioc is closed this method is called auto");
//		
//	}
	
	// by using annot
	
	@PostConstruct
	void myinit() {
		System.out.println("when bean is created it ll be called auto");
	}
	
	
	@PreDestroy
	void mydestroy() {
		System.out.println("ioc is closed this method is called auto");
	}
}
