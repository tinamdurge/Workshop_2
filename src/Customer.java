class Customer{
    private  String name;
    private String contactinfo;

    public Customer (String name, String contactinfo){
        this.name=name;
        this.contactinfo=contactinfo;
    }
}

class Customer {
    Integer id;
    String name;
    String contactInfo;
    ArrayList<String> rentalHistory;

    public Customer(Integer id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.rentalHistory = new ArrayList<>();
    }
}
