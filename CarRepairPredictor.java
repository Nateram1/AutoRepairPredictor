import java.util.Scanner;


//This class is to intialize the constructors and variables to calulate the car repair cost
//as well as the problems with the car so that the program can use them
class carDiagnostic {
    private String carIssue;
    private double repairCost;




    public carDiagnostic(String carIssue, double repairCost) {
        this.carIssue = carIssue;
        this.repairCost = repairCost;
    }


    public String getDescription() {
        return carIssue;
    }


    public double getCost() {
        return repairCost;
    }
}


//This class does the same thing as the class above by intializing the constructors and varibles
//To be used later in the code
class Cities {
    private String cityName;
    private String[] repairShop;


    public Cities(String cityName, String[] repairShop) {
        this.cityName = cityName;
        this.repairShop= repairShop;
    }


    public String getName(){
        return cityName;
    }


    public String[] getShop(){
        return repairShop;
    }


}



//this class is responsible for organizing all of the common car issues and costs
public class AutoRepairPredictor {
    private static carDiagnostic[] carDiagnostic = {
        new carDiagnostic("flat tire",40),
        new carDiagnostic("oil change",60),
        new carDiagnostic("AC issues",500),
        new carDiagnostic("battery replacement",150),
        new carDiagnostic("Brake replacement", 200),
        new carDiagnostic("Alternator repair", 250),
        new carDiagnostic("Transmission repair", 2000),
        new carDiagnostic("Engine repair", 3500),
        new carDiagnostic("Wheel alignment", 100),
        new carDiagnostic("Exhaust repair", 150)


    };

//in the main method is where the code will be implemented for the user to be able to interact with the program
//and for the program to compute the nesscessary calulations
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: User enters car issue
        System.out.println("Enter a number (1-10) corresponding to your car issue:");
        for (int i = 0; i < carDiagnostic.length; i++) {
            System.out.println((i + 1) + ". " + carDiagnostic[i].getDescription());
        }
        int carIssueChoice = scanner.nextInt();

        if (carIssueChoice < 1 || carIssueChoice > 10) {
            System.out.println("ERROR: Invalid choice. Please try again. ");
            return;
            
        }
        
    }
    

}




