package mapPractice;

import java.util.HashMap;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("Emma","Chicago", 30);
        Employee e2 = new Employee("Alex","Des Plaines", 24);
        Employee e3 = new Employee("Sam","Chicago", 35);
        Employee e4 = new Employee("David","Zion", 40);



        HashMap< Integer, Employee >    employeeMap = new HashMap();

        employeeMap.put(    e1.id,       e1     );
        employeeMap.put(    e2.id,       e2     );
        employeeMap.put(    e3.id,       e3      );
        employeeMap.put(    e4.id,       e4      );

        System.out.println(    employeeMap   );

        nameFinder( employeeMap );

    }

    public static void nameFinder (HashMap< Integer, Employee > map){

        for ( Employee employee    :    map.values()){

            System.out.println(   employee.name );
        }
    }

}
