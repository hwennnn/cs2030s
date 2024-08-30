public class SME extends Company {
  private int valuation;
  private int value;

  public SME(String name, int valuation, int value) {
    super(name);
    this.valuation = valuation;
    this.value = value;
  }

  @Override
  public void oneYear() {
    this.valuation += this.value;
  }

  @Override
  public String toString() {
    String str = String.format("(%s): $%d", super.toString(), this.valuation);

    return str;
  }
}
