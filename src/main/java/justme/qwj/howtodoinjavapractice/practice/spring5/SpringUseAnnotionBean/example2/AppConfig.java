package justme.qwj.howtodoinjavapractice.practice.spring5.SpringUseAnnotionBean.example2;

import justme.qwj.howtodoinjavapractice.practice.spring5.SpringUseAnnotionBean.example2.service.EmployeeManager;
import justme.qwj.howtodoinjavapractice.practice.spring5.SpringUseAnnotionBean.example2.service.Impl.EmployeeManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public EmployeeManager employeeManager(){
        return new EmployeeManagerImpl();
    }
}
