class Manager extends Employee {
  private int monthlySalary;

  public Manager(int employeeType, int monthlySalary) {
    this.monthlySalary = monthlySalary;
  }
  
  @Override
  public int getMonthlySalary() {
    return this.monthlySalary;
  }

  @Override
  public String toString() {
    String str = String.format("%s%s", "Manager", super.toString());

    return str;
  }
}
