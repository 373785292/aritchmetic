package Java8新特性.Impl;

import Java8新特性.domain.Employee;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/3 14:57
 */

public class FilterBySalary implements Mypredicate<Employee> {
    @Override
    public boolean verify(Employee employee) {
        return employee.getSalary()>5000;
    }
}
