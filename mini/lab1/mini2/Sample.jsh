/open Employee.java
/open Payroll.java

Employee manager = new Manager(10000);
Employee fulltime = new FullTimeEmployee(5000, 5, 100);
Employee intern = new Intern(40, 50, 160, 25);
Payroll pr = new Payroll();

pr.register(manager);
pr.register(fulltime);
pr.register(intern);

// pr
// pr.getTotalSalary()
