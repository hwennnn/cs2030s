class FullTimeEmployee extends Employee {
  private int monthlySalary;
  private int overtimeHours;
  private int overtimeRate;

  public FullTimeEmployee(int monthlySalary, int overtimeHours, int overtimeRate) {
    this.monthlySalary = monthlySalary;
    this.overtimeHours = overtimeHours;
    this.overtimeRate = overtimeRate;
  }

  @Override
  public int getMonthlySalary() {
    return this.monthlySalary + this.overtimeHours * this.overtimeRate;
  }

  @Override
  public String toString() {
    String str = String.format("%s%s", "FullTime", super.toString());

    return str;
  }
}
