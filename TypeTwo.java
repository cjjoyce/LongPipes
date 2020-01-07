package longpipes;

public class TypeTwo extends Pipe {

  // Declaration of the Colours variable for 1 colour
  private final double colours;

  // TypeTwo Constructor, extends from Pipe
  public TypeTwo(double length, double diameter, int plasticGrade, boolean chemicalResistance, int quantity, double costPerInch, int colours) {

    // Passes parameters to the Pipe superclass
    super(length, diameter, plasticGrade, chemicalResistance, quantity, costPerInch);
    
    // Set the cost for 2 colours to 12%
    this.colours = 1.12;

  }

  // getColours Method
  public double getColours() {
    return colours;
  }

  @Override
  // Calculates cost of the TypeThree Pipe
  public double calculateCost() {
    // Calculates cost of colour which is 1.12
    cost = super.calculateCost() * colours;
    
    // Returns cost
    return cost;
  }

}
