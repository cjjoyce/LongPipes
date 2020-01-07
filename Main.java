package longpipes;

import java.util.*;

public class Main {

    protected static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Creates new GUI Object and sets it to visible
        GUI objUI = new GUI();
        objUI.setVisible(true);

//      // Variables Declared
//      String inputLength, inputDiameter, inputGrade, inputColours, inputInnerInsulation, inputOuterReinforcement, inputChemicalResistance, inputQuantity, inputAnotherPipe;
//      double length, diameter, totalCost;
//      int grade, colours, quantity;
//      boolean innerInsulation, outerReinforcement, chemicalResistance, lengthLoop, diameterLoop, gradeLoop, coloursLoop, innerInsulationLoop, outerReinforcementLoop, chemicalResistanceLoop, quantityLoop, anotherPipeLoop, valid;
//      
//      // Creation of ArrayList to store all objects
//      List<Pipe> totalPipes = new ArrayList<>();
//
//        do {
//
//            grade = 0;
//            quantity = 0;
//            chemicalResistance = false;
//            length = 0;
//            diameter = 0;
//            valid = true;
//
//            // Input Length
//            lengthLoop = true;
//            do {
//                System.out.println("\nEnter in the length of the pipe in metres:");
//                inputLength = input.nextLine();
//
//                try {
//                    length = Double.parseDouble(inputLength);
//                    if (length <= 0) {
//                        lengthLoop = true;
//                        System.out.println("The length needs to be a positive measurement.");
//                    } else if (length > 6) {
//                        System.out.println("LongPipes only supplies pipes up to 6 metres.");
//                        lengthLoop = true;
//                    } else {
//                        lengthLoop = false;
//                    }
//                } catch (NumberFormatException error) {
//                    System.out.println("The pipe's length must be a number.");
//                }
//            } while (lengthLoop);
//
//            // Input Diameter
//            diameterLoop = true;
//            do {
//                System.out.println("\nEnter in the diameter of the pipe in inches:");
//                inputDiameter = input.nextLine();
//
//                try {
//                    diameter = Double.parseDouble(inputDiameter);
//                    if (diameter <= 0) {
//                        diameterLoop = true;
//                        System.out.println("The diameter needs to be a positive measurement.");
//                    } else if (diameter > 50) {
//                        System.out.println("LongPipes only supplies pipes with up to a 50-inch diameter.");
//                        diameterLoop = true;
//                    } else {
//                        diameterLoop = false;
//                    }
//                } catch (NumberFormatException error) {
//                    System.out.println("The pipe's diameter must be a number.");
//                }
//            } while (diameterLoop);
//
//            // Input Grade of Plastic 
//            gradeLoop = true;
//            do {
//                System.out.println("\nEnter in the grade of plastic for the pipe you want (1-5):");
//                inputGrade = input.nextLine();
//
//                try {
//                    grade = Integer.parseInt(inputGrade);
//                    if (grade <= 0 || grade > 5) {
//                        gradeLoop = true;
//                        System.out.println("The plastic grade needs to be between 1 and 5.");
//                    } else {
//                        gradeLoop = false;
//                    }
//                } catch (NumberFormatException error) {
//                    System.out.println("The pipe's grade must be a number.");
//                }
//            } while (gradeLoop);
//
//            // Input Colour 
//            coloursLoop = true;
//            do {
//                System.out.println("\nEnter in how many colours you want on the pipe (0, 1 or 2):");
//                inputColours = input.nextLine();
//
//                try {
//                    colours = Integer.parseInt(inputColours);
//                    if (colours < 0 || colours > 2) {
//                        coloursLoop = true;
//                        System.out.println("\nThe colour options has to be either 0, 1 or 2.\n");
//                    } else if (grade == 1 && colours == 1 || grade == 1 && colours == 2 || grade == 4 && colours == 1 || grade == 5 && colours == 0 || grade == 5 && colours == 1) {
//                        coloursLoop = true;
//                        System.out.println("\nSorry, LongPipes doesn't supply a pipe with a plastic grade of " + grade + " with " + colours + " colour(s), therefore this order has been cancelled.\n");
//                        valid = false;
//                    } else {
//                        coloursLoop = false;
//                    }
//                } catch (NumberFormatException error) {
//                    System.out.println("The pipe's grade must be a number.");
//                }
//            } while (coloursLoop && valid);
//
//            // Input Inner Insulation
//            innerInsulationLoop = false;
//            if (valid) {
//                do {
//                    System.out.println("\nDo you want any inner insulation with your pipe? (yes or no)");
//                    inputInnerInsulation = input.nextLine();
//
//                    if (!inputInnerInsulation.matches("yes|no")) {
//                        innerInsulationLoop = true;
//                        System.out.println("\nEnter in either 'yes' or 'no' on whether or not you want inner insulation.\n");
//                    } else if (inputInnerInsulation.matches("yes")) {
//                        innerInsulation = true;
//                        innerInsulationLoop = false;
//                        if (grade == 1 || grade == 2 || grade == 3 && innerInsulation == true) {
//                            System.out.println("\nSorry, LongPipes doesn't supply a pipe with a plastic grade of " + grade + " with inner insulation, therefore this order has been cancelled.\n");
//                            valid = false;
//                        }
//                    } else if (inputInnerInsulation.matches("no")) {
//                        innerInsulation = false;
//                        innerInsulationLoop = false;
//                    }
//                } while (innerInsulationLoop && valid);
//            }
//
//            // Input Outer Reinforcement
//            outerReinforcementLoop = false;
//            if (valid) {
//                do {
//                    System.out.println("\nDo you want any outer reinforcement with your pipe? (yes or no)");
//                    inputOuterReinforcement = input.nextLine();
//
//                    if (!inputOuterReinforcement.matches("yes|no")) {
//                        outerReinforcementLoop = true;
//                        System.out.println("\nEnter in either 'yes' or 'no' on whether or not you want outer reinforcement.\n");
//                    } else if (inputOuterReinforcement.matches("yes")) {
//                        outerReinforcement = true;
//                        outerReinforcementLoop = false;
//                        if (grade == 1 || grade == 2 || grade == 3 || grade == 4 && outerReinforcement == true) {
//                            System.out.println("\nSorry, LongPipes doesn't supply a pipe with a plastic grade of " + grade + " with outer reinforcement, therefore this order has been cancelled.\n");
//                            valid = false;
//                        }
//                    } else if (inputOuterReinforcement.matches("no")) {
//                        outerReinforcement = false;
//                        outerReinforcementLoop = false;
//                    }
//                } while (outerReinforcementLoop && valid);
//            }
//
//            // Input Chemical Resistance
//            chemicalResistanceLoop = false;
//            if (valid) {
//                do {
//                    System.out.println("\nDo you want any chemical resistance with your pipe? (yes or no)");
//                    inputChemicalResistance = input.nextLine();
//
//                    if (!inputChemicalResistance.matches("yes|no")) {
//                        chemicalResistanceLoop = true;
//                        System.out.println("Enter in either 'yes' or 'no' on whether or not you want chemical resistance.");
//                    } else if (inputChemicalResistance.matches("yes")) {
//                        chemicalResistance = true;
//                        chemicalResistanceLoop = false;
//                    } else if (inputChemicalResistance.matches("no")) {
//                        chemicalResistance = false;
//                        chemicalResistanceLoop = false;
//                    }
//                } while (chemicalResistanceLoop && valid);
//            }
//
//            // Input Quantity 
//            quantityLoop = true;
//            if (valid) {
//                do {
//                    System.out.println("\nHow many pipes of this type would you like?");
//                    inputQuantity = input.nextLine();
//
//                    try {
//                        quantity = Integer.parseInt(inputQuantity);
//                        if (quantity <= 0) {
//                            quantityLoop = true;
//                            System.out.println("The quantity needs to be a positive number.");
//                        } else if (quantity > 100) {
//                            System.out.println("LongPipes only supplies up to 100 pipes for one order.");
//                            quantityLoop = true;
//                        } else {
//                            quantityLoop = false;
//                        }
//                    } catch (NumberFormatException error) {
//                        System.out.println("The quantity must be a number.");
//                    }
//                } while (quantityLoop && valid);
//            }
//
//            // Another Pipe Order
//            anotherPipeLoop = false;
//            do {
//                System.out.println("\nDo you want to order another pipe? (yes or no)");
//                inputAnotherPipe = input.nextLine();
//            } while (inputAnotherPipe.length() == 0);
//
//            if (inputAnotherPipe.charAt(0) == 'y') {
//                anotherPipeLoop = true;
//            }
//
//            if (valid) {
//                switch (grade) {
//                    case 1:
//                        Pipe pipeOne = new Pipe(length, diameter, grade, chemicalResistance, quantity, 0.4);
//                        totalPipes.add(pipeOne);
//                        break;
//                    case 2:
//                        TypeTwo pipeTwo = new TypeTwo(length, diameter, grade, chemicalResistance, quantity, 0.6, 1);
//                        totalPipes.add(pipeTwo);
//                        break;
//                    case 3:
//                        TypeThree pipeThree = new TypeThree(length, diameter, grade, chemicalResistance, quantity, 0.75);
//                        totalPipes.add(pipeThree);
//                        break;
//                    case 4:
//                        TypeFour pipeFour = new TypeFour(length, diameter, grade, chemicalResistance, quantity, 0.8);
//                        totalPipes.add(pipeFour);
//                        break;
//                    case 5:
//                        TypeFive pipeFive = new TypeFive(length, diameter, grade, chemicalResistance, quantity, 0.95);
//                        totalPipes.add(pipeFive);
//                        break;
//                    default:
//                        break;
//                }
//            }
//
//        } while (anotherPipeLoop);
//
//        System.out.println("\n\n##### Order Total #####");
//        totalCost = 0;
//
//        for (int i = 0; i < totalPipes.size(); i++) {
//            System.out.println("\nPipe: Type " + totalPipes.get(i).getPlasticGrade());
//            System.out.println("Cost: £" + String.format("%.2f", totalPipes.get(i).calculateCost()));
//            totalCost += totalPipes.get(i).calculateCost();
//        }
//
//        System.out.println("\nTotal Cost: £" + String.format("%.2f", totalCost));
//
    }
}
