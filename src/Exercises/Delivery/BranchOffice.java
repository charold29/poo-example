package Exercises.Delivery;

public class BranchOffice {
    private final int id;
    private final String address;
    private final String city;

    public BranchOffice(int id, String address, String city) {
        this.id = id;
        this.address = address;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public double calculatePrice(Package p){
        int priority = p.getPriority();
        double normalPrice = p.getWeight();

        switch(priority){
            case 0: //normal
                return normalPrice;
            case 1: //high
                return normalPrice + 10;
            case 2: //express
                return normalPrice + 20;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "BranchOffice{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                "}\n";
    }
}
