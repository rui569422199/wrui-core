package personal.wrui;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class AppBeanUtil implements ApplicationContextAware  {
    
    private static ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(AppBeanUtil.applicationContext==null){
            AppBeanUtil.applicationContext = applicationContext;
        }
	}

}