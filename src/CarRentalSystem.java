public class CarRentalSystem {
    private Map<String,Boolean> caravailability;
    public CarRentalSystem() {
        this.caravailability = new HashMap<>();
    }
    //Method to add new car
    public void addCar(String registrationNumber){
        if(!caravailability.containsKey(registrationNumber)) {
            caravailability.put(registrationNumber, true);//Car in available
            System.out.println("Car with registration number" + registrationNumber + "added to the system.");
        }
        else {
            System.out.println("Car with registration number" + registration + "already exists in system.");

        }
    }
    //RENTING METHOD
    private Map<String,Car>carDetails;
    private Map<String,Customer>customerDetails;
    private Map<String,RentalHistory>rentalHistory;
    public void rentCar(String registrationNumber){
        if(caravailability.containsKey(registrationNumber)) {
            if (caravailability.get(registrationNumber)) {
                caravailability.put(registrationNumber, false);
                System.out.println("Car with registration number " + registrationNumber + "rented.");
            } else {
                System.out.println("Car with registration number " + registrationNumber + "is already rented.");
            }
        }
             else {
                System.out.println("Car with registration number " +registrationNumber +"does not exists.");
            }

    }
    //RETURNING RENTED CAR
    public void returncar(String registrationNumber){
        if(caravailability.containsKey(registrationNumber)) {
            if (!caravailability.get(registrationNumber)) {
                caravailability.put(registrationNumber, true);
                System.out.println("Car with registration number " + registrationNumber + "rented.");
            } else {
                System.out.println("Car with registration number " + registrationNumber + "is not rented currently");
            }
        }
             else {
                System.out.println("Car with registration number " +registrationNumber +"does not exists.");
            }
        }
        //DISPLAYING LIST OF AVAILABLE CARS
        public void availablecarsDisplay(){
            System.out.println("Available cars:");
            for(Map.Entry<String,Boolean> entry: caravailability.entrySet()){
                if(entry.getValue()){
                    System.out.println(entry.getKey());
                }
            }
        }

        public void updateCar(String registrationNumber, Car updateCar){
        if (carDetails.containsKey(registrationNumber)){
            carDetails.put(registrationNumber,updatedCar);
            System.out.println("Car details updated for registration number" +registrationNumber);
        }
        else {
            System.out.println("Car with registration number"+ " does not exist");
        }
        }
    this.carDetails=new HashMap<>();
    this.customerDetails= new HashMap<>();
    this.rentalHistory= new HashMap<>();
    class Customer{
        private  String name;
        private String contactinfo;

        public Customer (String name, String contactinfo){
            this.name=name;
            this.contactinfo=contactinfo;
        }
    }
    class Car{
        private String make;
        private String model;
        public Car(String make, String model){
            this.make=make;
            this.model=model;
        }
    }

    class RentalHistory{
        private String rentalDate;
        private String returnDate;
        private int rentalDuration;
        private Customer customer;
        private Car car;
        public RentalHistory(String rentalDate, int rentalDuration,Customer customer,Car car){
            this.rentalDate=rentalDate;
            this.rentalDuration=rentalDuration;
            this.customer=customer;
            this.car=car;
        }

    }
    public void deleteCar(String registrationNumber){
        if (carDetails.containsKey(registrationNumber)){
            carDetails.remove(registrationNumber);
            caravailability.remove(registrationNumber);
            System.out.println("Car with registration number" +registrationNumber+"deleted from the system");
        }
        else {
            System.out.println("Car with registration number"+registrationNumber+ " does not exist");
        }
    }


}
