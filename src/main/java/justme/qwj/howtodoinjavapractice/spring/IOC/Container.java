package justme.qwj.howtodoinjavapractice.spring.IOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Spring提供两种类型的容器
 * BeanFactory和ApplicationContext容器
 */
public class Container {

    /**
     * BeanFactory本质是一个高级工厂的接口,该工厂能够
     * 维护不同的Bean及其依赖项的注册表
     *
     * 在 new XmlBeanFactory中已经不能放入一个InputStream对象
     * 而且此方法过期
     */
    public void crateXmlBeanFactory() throws FileNotFoundException {
        InputStream is = new FileInputStream("beans.xml");
        Resource resource = new InputStreamResource(is);
        BeanFactory factory = new XmlBeanFactory(resource);
        Object obj = factory.getBean("helloWorld");
    }

    /**
     * 其它创建Bean工厂方法
     * @throws FileNotFoundException
     */
    public void crateXmlBeanFactory2() throws FileNotFoundException {
        Resource resource =  new FileSystemResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

       ClassPathResource classPathResource =  new ClassPathResource("beans.xml");
       BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
    }



}
