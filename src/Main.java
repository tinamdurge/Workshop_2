// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CarRentalSystem carRentalSystem= new CarRentalSystem();
        //ADDING
        carRentalSystem.addCar(registrationNumber: "XYZ789");
        carRentalSystem.addCar(registrationNumber: "XYZ789");
        carRentalSystem.addCar(registrationNumber: "XYZ789");
        carRentalSystem.addCar(registrationNumber: "XYZ789");
        carRentalSystem.addCar(registrationNumber: "XYZ789");

        //RENTING
        carRentalSystem.rentCar(registrationnumber: "XYZ789");

        //displaying
        carRentalSystem.availablecarsDisplay(registrationnumber: "XYZ789");

        //RETURNING
        carRentalSystem.returncar(registrationnumber: "XYZ789");

        //DISPLAYING
        carRentalSystem.availablecarsDisplay();
    }
}