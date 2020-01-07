package longpipes;

// Creation of the Abstract PipeObject class
public abstract class PipeObject {

    // Variables Declared
    protected int plasticGrade, quantity;
    protected boolean chemicalResistance;
    protected double length, diameter, radius, innerRadius, costPerInch, cost, totalCost, outerVolume, innerVolume;

    // Constructor for Pipe Object
    public PipeObject(double length, double diameter, int plasticGrade, boolean chemicalResistance, int quantity, double costPerInch) {
        // Sets the variables for the parameters
        this.plasticGrade = plasticGrade;
        this.quantity = quantity;
        this.chemicalResistance = chemicalResistance;
        this.length = length * 39.3700787;
        this.diameter = diameter;
        this.costPerInch = costPerInch;
    }

  // Get Methods
  public int getPlasticGrade() {
    return plasticGrade;
  }

  public int getQuantity() {
    return quantity;
  }

  public boolean getChemicalResistance() {
    return chemicalResistance;
  }

  public double getLength() {
    return length;
  }

  public double getDiameter() {
    return diameter;
  }

  public double getCostPerInch() {
    return costPerInch;
  }


  // Set Methods
  public void setPlasticGrade(int plasticGrade) {
    this.plasticGrade = plasticGrade;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setChemicalResistance(boolean chemicalResistance) {
    this.chemicalResistance = chemicalResistance;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  public void setCostPerInch(double costPerInch) {
    this.costPerInch = costPerInch;
  }


  // Calculate Volume of Pipe
  public double calculateVolume() {
    // Calculates radius
    radius = getDiameter() / 2;
    // Calculates innerRadius
    innerRadius = (getDiameter() / 2) * 0.9;
    // Calculates outerVolume
    outerVolume = Math.PI * Math.pow(radius, 2) * getLength();
    // Calculates innerVolume
    innerVolume = Math.PI * Math.pow(innerRadius, 2) * getLength();
    // Returns the outer volume of plastic that is needed to calculate the cost
    return outerVolume - innerVolume;
  }


  // Abstract calculateCost Method
  public abstract double calculateCost();

}
