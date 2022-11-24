package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary<=10000&&salary>0){
            System.out.println(salary-(salary*.15));
        }
        else if (10000<salary&&salary<=20000)
        {
            System.out.println(salary-(salary*.18));
        }
        else if (salary>20000)
        {
            System.out.println(salary-(salary*.20));
        }
        else {
            System.out.println("wrong input!");
        }
    }
}
