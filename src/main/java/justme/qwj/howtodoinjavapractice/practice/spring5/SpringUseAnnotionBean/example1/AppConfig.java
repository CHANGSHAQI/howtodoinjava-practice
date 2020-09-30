package justme.qwj.howtodoinjavapractice.practice.spring5.SpringUseAnnotionBean.example1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "justme.qwj.howtodoinjavapractice.practice.spring5.SpringUseAnnotionBean.example1.service")
public class AppConfig {
}
