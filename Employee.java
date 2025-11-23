//Name : Moyo Ibikunle
//Date: 21/11/2025
//Lab: Lab 8
public class Employee extends Person
{
    private double annualSal;
    
    public Employee(String name, double annualSal)
        {
            super(name);
            this.annualSal = annualSal;
        }

        public String getDescription()
            {
                return " an employee with a salary of " + annualSal + ".";
            }











}