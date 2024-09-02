class Intern extends Employee {
  private int overtimeHours;
  private int overtimeRate;
  private int clockedHours;
  private int hourlyRate;

  public Intern(int overtimeHours, int overtimeRate, int clockedHours, int hourlyRate) {
    this.overtimeHours = overtimeHours;
    this.overtimeRate = overtimeRate;
    this.clockedHours = clockedHours;
    this.hourlyRate = hourlyRate;
  }

  @Override
  public int getMonthlySalary() {
    return this.clockedHours * this.hourlyRate + this.overtimeHours * this.overtimeRate;
  }

  @Override
  public String toString() {
    String str = String.format("%s%s", "Intern", super.toString());

    return str;
  }
}
