public class MNC extends Company {
  private int valuation;

  public MNC(String name, int valuation) {
    super(name);
    this.valuation = valuation;
  }
  
  @Override
  public void oneYear() {
    this.valuation = valuation; 
  }

  @Override
  public String toString() {
    String str = String.format("[%s]: $%d", super.toString(), this.valuation);
    return str;
  }
}

