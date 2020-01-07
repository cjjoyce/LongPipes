package longpipes;

public class TypeThree extends Pipe {

  // Declaration of the Colours variable for 2 colours
  private final double colours;

  // TypeThree Constructor, extends from Pipe
  public TypeThree(double length, double diameter, int plasticGrade, boolean chemicalResistance, int quantity, double costPerInch) {

    // Passes parameters to the Pipe superclass
    super(length, diameter, plasticGrade, chemicalResistance, quantity, costPerInch);
    
    // Set the cost for 2 colours to 16%
    this.colours = 1.16;

  }

  // getColours Method
  public double getColours() {
    return colours;
  }

  @Override
  // Calculates cost of the TypeThree Pipe
  public double calculateCost() {
    // Calculates cost of colour which is 1.16
    cost = super.calculateCost() * colours;
    
    // Returns cost
    return cost;
  }

}
