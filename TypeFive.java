package longpipes;

public class TypeFive extends TypeFour {

  // Declaration of the outerReinforcement variable
  private final double outerReinforcement;

  // TypeFive Constructor, extends from TypeFour
  public TypeFive(double length, double diameter, int plasticGrade, boolean chemicalResistance, int quantity, double costPerInch) {

    // Passes parameters to the TypeFour superclass
    super(length, diameter, plasticGrade, chemicalResistance, quantity, costPerInch);
    
    // Set the cost for Outer Reinforcement to 17%
    this.outerReinforcement = 1.17;

  }

  // getOuterReinforcement Method
  public double getOuterReinforcement() {
    return outerReinforcement;
  }

  @Override
  // Calculates cost of the TypeFive Pipe
  public double calculateCost() {
    // Calls TypeFour's calculateCost which also adds colour as well. 1.16 * 1.13 * 1.17
    cost = super.calculateCost();

    // Adds additional costs for outer reinforcments.
    cost *= outerReinforcement;

    // Returns cost
    return cost;
  }

}
