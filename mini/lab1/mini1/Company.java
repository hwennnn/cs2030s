abstract class Company {
  private String name;

  public Company(String name) {
    this.name = name;
  }

  abstract public void oneYear();

  @Override
  public String toString() {
    return this.name;
  }
}
