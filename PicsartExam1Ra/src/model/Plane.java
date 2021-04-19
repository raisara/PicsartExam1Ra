package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private short hours;
    private boolean isMilitary;
    private double weight;
    private double topSpeed;
    private int seats;
    private double cost;

    /*public Plane(String model, boolean isMilitary, double cost) {
        setModel(model);
        setMilitary(isMilitary);
        setCost(cost);
    }*/

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(!model.isEmpty()){
            this.model = model;
        }else{
            System.out.println("Write down the model");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(!country.isEmpty()){
            this.country = country;
        }else{
            System.out.println("Write down the country");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>=1903 && year<=2020){
            this.year = year;
        }else{
            System.out.println("The year must be from 1903 to 2020");
        }
    }

    public short getHours() {
        return hours;
    }

    public void setHours(short hours) {
        if(hours>=0 && hours<=10000){
            this.hours = hours;
        }else{
            System.out.println("The hours must be from 0 to 10000");
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
            isMilitary = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>=1000 && weight<=160000){
            this.weight = weight;
        }else{
            System.out.println("The weight must be from 1000 KG to 160000 KG");
        }
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        if(topSpeed>=0){
            this.topSpeed = topSpeed;
        }else{
            System.out.println("The topSpeed can't be a negative value");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats>=0){
            this.seats = seats;
        }else{
            System.out.println("The seats can't be a negative value");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost>=0){
            this.cost = cost;
        }else{
            System.out.println("The cost can't be a negative value");
        }
    }

    public void printInfo() {
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("Model: %s, Country: %s, Year: %d, Hours: %d\n", model, country, year, hours);
        System.out.printf("Military: %b, Weight: %f\n", isMilitary ? "Yes" : "No", weight);
        System.out.printf("TopSpeed: %f, Seats: %d, Cost: %f\n", topSpeed, seats, cost);
        System.out.println("------------------------------------------------------------------------");
    }


    /*model - name of the plane (Any not empty string)
    country - country the plane belongs to (Any not empty string)
    year - year of publishing  (from 1903 to 2020)
    hours - hours in air (from 0 to 10000)
    military - is military or not
    weight - weight of plane (from 1000 KG to 160000 KG)
    topSpeed - maximal speed per hour (1000 km/h) (any not negative value)
    seats - number of seats (any not negative value)
    cost - cost of the plane (ex: 445.6$) (any not negative value)*/
}
