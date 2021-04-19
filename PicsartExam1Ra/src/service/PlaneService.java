package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {

    public Plane create() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter plane model");
        Plane plane = new Plane();
        String model = s.next();
        plane.setModel(model);

        System.out.println("Enter plane is military? (y/n)");
        boolean isMilitary = s.next().charAt(0) == 'y';
        plane.setMilitary(isMilitary);

        System.out.println("Enter plane cost");
        double cost = s.nextDouble();
        plane.setCost(cost);

        //Plane plane = new Plane(model, isMilitary, cost);

        System.out.println("Enter plane country");
        String country = s.next();
        plane.setCountry(country);

        System.out.println("Enter plane year");
        int year = s.nextInt();
        plane.setYear(year);

        System.out.println("Enter plane hours");
        short hours = s.nextShort();
        plane.setHours(hours);

        System.out.println("Enter plane weight");
        double weight = s.nextDouble();
        plane.setWeight(weight);

        System.out.println("Enter plane topSpeed");
        double topSpeed = s.nextDouble();
        plane.setTopSpeed(topSpeed);

        System.out.println("Enter plane count of seats");
        int seats = s.nextInt();
        plane.setSeats(seats);

        return plane;
    }

    public void isMilitary(Plane plane){
        System.out.println(plane.isMilitary()?plane.getCost()+" " +plane.getTopSpeed():plane.getModel()+" "+plane.getCountry());
    }

    public Plane newerPlane(Plane p1, Plane p2){
        Plane p =  p1.getYear()>=p2.getYear() ? p1 : p2;
        return p;
    }

    public void countryOfSmallestSeatsCountPlane(Plane p1, Plane p2, Plane p3){
        Plane p = p1.getSeats()<=p2.getSeats() ? p1:p2;
        if(p.getSeats()<=p3.getSeats()){
            System.out.println(p.getCountry());
        }else{
            System.out.println(p3.getCountry());
        }
    }

    //4
    public void allMilitaryPlanes(Plane[] planes){
        int count = 0;
        for (Plane plane : planes) {
            if(plane.isMilitary()){
                count++;
            }
        }
        Plane[] result = new Plane[count];
        int index = 0;
        for(Plane resPlane : planes){
            if(resPlane.isMilitary()) {
                result[index++] = resPlane;
            }
        }

        System.out.println(result);
        /*for(Plane printPlane : result){
            System.out.println("------------------------------------------------------------------------");
            System.out.printf("Model: %s, Country: %s, Year: %d, Hours: %d\n", printPlane.getModel(), printPlane.getCountry(), printPlane.getYear(), printPlane.getHours()hours);
            System.out.printf("Military: %b, Weight: %f\n", printPlane.isMilitary() ? "Yes" : "No", printPlane.getWeight());
            System.out.printf("TopSpeed: %f, Seats: %d, Cost: %f\n", printPlane.getTopSpeed(), printPlane.getSeats(), printPlane.getCost());
            System.out.println("------------------------------------------------------------------------");
        }*/
    }

    //5
    public void militaryPlanesMoreThan100Hours(Plane[] planes){
        int count = 0;
        for (Plane plane : planes) {
            if(plane.isMilitary() && plane.getHours()>100){
                count++;
            }
        }
        Plane[] result = new Plane[count];
        int index = 0;
        for(Plane resPlane : planes){
            if(resPlane.isMilitary() && resPlane.getHours()>100) {
                result[index++] = resPlane;
            }
        }
        System.out.println(result);
        /*for(Plane printPlane : result){
            System.out.println("------------------------------------------------------------------------");
            System.out.printf("Model: %s, Country: %s, Year: %d, Hours: %d\n", printPlane.getModel(), printPlane.getCountry(), printPlane.getYear(), printPlane.getHours()hours);
            System.out.printf("Military: %b, Weight: %f\n", printPlane.isMilitary() ? "Yes" : "No", printPlane.getWeight());
            System.out.printf("TopSpeed: %f, Seats: %d, Cost: %f\n", printPlane.getTopSpeed(), printPlane.getSeats(), printPlane.getCost());
            System.out.println("------------------------------------------------------------------------");
        }*/
    }

    //6
    public Plane planeWithMinimalWeight(Plane[] planes){
        Plane minWeightPlane = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if(planes[i].getWeight() <= minWeightPlane.getWeight()){
                minWeightPlane = planes[i];
            }
        }
        return minWeightPlane;
    }

    //7
    public Plane militaryCheapestPlane(Plane[] planes){
        Plane military = null;
        for (int i = 0; i < planes.length; i++) {
            if(planes[i].isMilitary()){
                if(military == null){
                    military = planes[i];
                }else{
                    if(planes[i].getCost()<military.getCost()){
                        military = planes[i];
                    }
                }
            }
        }
        return military;
    }

    //8
    public void ascOrderByYear(Plane[] planes){
        boolean isActive = true;
        int countOfFors=0;
        while(isActive){
            isActive=false;
            for (int i = 0; i < planes.length-1-countOfFors; i++) {
                if(planes[i].getYear() > planes[i+1].getYear()){
                    Plane x = planes[i];
                    planes[i] = planes[i+1];
                    planes[i+1]=x;
                    isActive=true;
                }
            }
            countOfFors++;
        }

        System.out.println(planes);
        /*for(Plane printPlane : planes){
            System.out.println("------------------------------------------------------------------------");
            System.out.printf("Model: %s, Country: %s, Year: %d, Hours: %d\n", printPlane.getModel(), printPlane.getCountry(), printPlane.getYear(), printPlane.getHours()hours);
            System.out.printf("Military: %b, Weight: %f\n", printPlane.isMilitary() ? "Yes" : "No", printPlane.getWeight());
            System.out.printf("TopSpeed: %f, Seats: %d, Cost: %f\n", printPlane.getTopSpeed(), printPlane.getSeats(), printPlane.getCost());
            System.out.println("------------------------------------------------------------------------");
        }*/
    }
}
