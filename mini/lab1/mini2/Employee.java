abstract class Employee {
  public static int lastId = 0;
  private final int id;
 
  public Employee() {
    this.id = lastId;
    Employee.lastId++;
  }

  abstract public int getMonthlySalary();

  @Override
  public String toString() {
    return String.valueOf(id);
  }
}
