class Main {
  public static void main (String[] args) {
    Employee manager = new Employee(1, 10000);
    int salary = manager.calculateMonthlySalary();
    System.out.println(salary);
  }
}
