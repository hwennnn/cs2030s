abstract class Employee {
  /**
   * Different types of employees.
   */
  public static final int MANAGER = 1;
  public static final int FULLTIME = 2;
  public static final int INTERN = 3;

  /**
   * Employee id.
   */
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
