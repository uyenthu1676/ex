package onoopcoban;

public class Employee {
	private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    
    public int getAnnualSalary(){
        return this.salary * 12;
    }
    
    public int raiseSalary(int percent){
        this.salary += ((this.salary*percent)/100);
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + ']';
    }
}

class TestEmployee {
   public static void main(String[] args) {
      Employee e1 = new Employee(8, "Peter", "Tan", 2500);
      System.out.println(e1); 

     
      e1.setSalary(999);
      System.out.println(e1);  
      System.out.println("id is: " + e1.getID());
      System.out.println("firstname is: " + e1.getFirstName());
      System.out.println("lastname is: " + e1.getLastName());
      System.out.println("salary is: " + e1.getSalary());

      System.out.println("name is: " + e1.getName());
      System.out.println("annual salary is: " + e1.getAnnualSalary()); 

   
      System.out.println(e1.raiseSalary(10));
      System.out.println(e1);
   }

}
