package longpipes;

public class TypeFour extends TypeThree {

  // Declaration of the innerInsulation variable
  private final double innerInsulation;

  // TypeFour Constructor, extends from TypeThree
  public TypeFour(double length, double diameter, int plasticGrade, boolean chemicalResistance, int quantity, double costPerInch) {

    // Passes parameters to the TypeThree superclass
    super(length, diameter, plasticGrade, chemicalResistance, quantity, costPerInch);
    
    // Set the cost for Inner Insulation to 13%
    this.innerInsulation = 1.13;

  }

  // getInnerInsulation Method
  public double getInnerInsulation() {
    return innerInsulation;
  }

  @Override
  // Calculates cost of the TypeFour Pipe
  public double calculateCost() {
    // Adds cost of colour as well from TypeThree and times it by additional cost of innerInsulation
    cost = super.calculateCost();

    // Add inner insulation cost to total cost of pipe.
    cost *= innerInsulation;
    
    // Returns cost
    return cost;
  }

}
