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
