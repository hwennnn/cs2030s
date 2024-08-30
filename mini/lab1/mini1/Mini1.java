import java.util.Scanner;

/**
 * The main class for CS2030S Lab 01 Mini 1.
 *
 * @author dcsaysp
 * @version CS2030 AY24/25 S1
 */
class Mini1 {
  /** 
   * The list of companies.
   */
  private Company[] companies;

  /**
   * The number of companies.
   */
  private int numCompanies;

  /**
   * The number of year.
   */
  private int numYears;

  /**
   * Different types of companies.
   */
  public static final int MNC = 1;
  public static final int STARTUP = 2;
  public static final int SME = 3;

  public static void main(String[] args) {
    // Create a scanner to read from standard input.
    Scanner sc = new Scanner(System.in);

    Mini1 runner = new Mini1(sc);
    runner.run();
  }

  public Mini1(Scanner sc) {
    // Number of companies
    this.numCompanies = sc.nextInt();

    // Number of years
    this.numYears = sc.nextInt();

    // Initialize companies
    this.companies = new Company[this.numCompanies];

    // Read the data for each company from stdin
    for (int i = 0; i < this.numCompanies; i++) {
      int industryType = sc.nextInt();
      if (industryType == Mini1.MNC) {
        this.companies[i] = new MNC(sc.next(), sc.nextInt());
      } else if (industryType == Mini1.STARTUP) {
        this.companies[i] = new Startup(sc.next(), sc.nextInt(), sc.nextInt());
      } else if (industryType == Mini1.SME) {
        this.companies[i] = new SME(sc.next(), sc.nextInt(), sc.nextInt());
      }
    }

    // Close the scanner
    sc.close();
  }

  public void run() {
    for (int i = 0; i < this.numYears; i++) {
      for (int j = 0; j < this.numCompanies; j++) {
          this.companies[j].oneYear();
        }
    }

    for (int j = 0; j < this.numCompanies; j++) {
      System.out.println(this.companies[j].toString());
    }
  }
}
