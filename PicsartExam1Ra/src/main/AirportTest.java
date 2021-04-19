package main;

import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();

        Plane plane = service.create();
        plane.printInfo();
        Plane p1 = service.create();
        p1.printInfo();
        Plane p2 = service.create();
        p2.printInfo();
        Plane[] planes = {plane, p1, p2};

        Scanner s = new Scanner(System.in);
        boolean isMenuActive=true;
        while(isMenuActive) {
            System.out.println("Enter command number");
            System.out.println("1. print cost and topSpeed if the plane is military otherwise print model and country");
            System.out.println("2. return the plane which one is newer (if they have the same age return first one)");
            System.out.println("3. print country of the plane with smallest seats count (if they have the same - print first)");
            System.out.println("4. print all not military planes");
            System.out.println("5. print all military planes which were in air more than 100 hours");
            System.out.println("6. return the plane with minimal weight (if there are some of them return last one)");
            System.out.println("7. return the plane with minimal cost from all military planes (if there are some of them return first one)");
            System.out.println("8. print planes in ascending form order by year");

            int command = s.nextInt();

            switch (command) {
                case 1:
                    service.isMilitary(plane);
                    break;
                case 2:
                    service.newerPlane(p1, p2).printInfo();
                    break;
                case 3:
                    service.countryOfSmallestSeatsCountPlane(plane, p1, p2);
                    break;
                case 4:
                    service.allMilitaryPlanes(planes);
                    break;
                case 5:
                    service.militaryPlanesMoreThan100Hours(planes);
                    break;
                case 6:
                    service.planeWithMinimalWeight(planes).printInfo();
                    break;
                case 7:

                    service.militaryCheapestPlane(planes);
                    break;
                case 8:
                    service.ascOrderByYear(planes);
                    break;
                default:
                    System.out.println("Bye");
                    isMenuActive = false;
                    break;
            }
        }
    }

}
