package justme.qwj.howtodoinjavapractice.practice.spring5.SpringUseAnnotionBean.example2;


import justme.qwj.howtodoinjavapractice.model.Employee;
import justme.qwj.howtodoinjavapractice.practice.spring5.SpringUseAnnotionBean.example2.service.EmployeeManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        EmployeeManager employeeManager = ctx.getBean(EmployeeManager.class);
        Employee employee = employeeManager.create();
        System.out.println(employee);
    }
}
