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




public class CarRepairPredictor {
    private static carDiagnostic[] carDiagnostic = {
        new carDiagnostic("flat tire",40),
        new carDiagnostic("oil change",60),
        new carDiagnostic("AC issues",500),
        new carDiagnostic("battery replacement",150)


    };


   


}




