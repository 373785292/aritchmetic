package Java8新特性.Impl;

import Java8新特性.domain.Employee;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/3 14:58
 */

public class FilterByAge implements Mypredicate<Employee> {
    @Override
    public boolean verify(Employee employee) {
        return employee.getAge()>15;
    }
}
