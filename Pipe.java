package longpipes;

public class Pipe extends PipeObject {
  
  // Pipe Constructor, extends from PipeObject
  public Pipe(double length, double diameter, int plasticGrade, boolean chemicalResistance, int quantity, double costPerInch) {
    
    // Passes parameters to the PipeObject superclass
    super(length, diameter, plasticGrade, chemicalResistance, quantity, costPerInch);
  }
  
  // getClassName Method
  public void getClassName(){
       System.out.println(this.getClass().getSimpleName());
  }
 
  @Override
  // Calculates cost of the Pipe
  public double calculateCost() {
    // Multiplies the volume by cost per inch and the quantity, to calculate the cost for one order
    cost = (super.calculateVolume() * super.getCostPerInch()) * super.getQuantity();

    // If the user has selected Chemical Resistance, add 14% to cost
    if (super.getChemicalResistance()) {
      cost *= 1.14;
    }

    // Returns cost
    return cost;
  }

}
