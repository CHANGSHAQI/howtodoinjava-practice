package justme.qwj.howtodoinjavapractice.practice.spring5.SpringUseAnnotionBean.example2.service.Impl;

import justme.qwj.howtodoinjavapractice.model.Employee;
import justme.qwj.howtodoinjavapractice.practice.spring5.SpringUseAnnotionBean.example2.service.EmployeeManager;
import org.springframework.stereotype.Service;


public class EmployeeManagerImpl implements EmployeeManager {
    @Override
    public Employee create() {
        Employee emp = new Employee();
        emp.setId(1l);
        emp.setName("Lokesh");
        return emp;
    }
}
