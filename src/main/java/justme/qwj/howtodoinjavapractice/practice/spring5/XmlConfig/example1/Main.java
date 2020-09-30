package justme.qwj.howtodoinjavapractice.practice.spring5.XmlConfig.example1;

import justme.qwj.howtodoinjavapractice.model.Department;
import justme.qwj.howtodoinjavapractice.model.Employee;
import justme.qwj.howtodoinjavapractice.model.Operations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("XmlConfig/beans2.xml");
        Department department = ctx.getBean(Department.class);
        Employee employee = ctx.getBean(Employee.class);
        Operations operations = ctx.getBean(Operations.class);

        System.out.println(department);
        System.out.println(employee);
        operations.helloWorld();
    }
}
