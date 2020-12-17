package Java8新特性.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/3 14:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private Integer salary;
    private Integer age;

}
