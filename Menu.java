package com.company;
import java.util.Scanner;

public class Menu
{
    public static Scanner scanner = new Scanner(System.in);
    private static int capacity;
    public static Garage garage;
    public void menu() {

        System.out.println("Welcome to the Garage Invoice system.");
        System.out.println("What's the capacity of the garage?");
        capacity = scanner.nextInt();
        garage = new Garage(capacity);

        while (true) {
            printmenu();
            var option = scanner.nextInt();
            switch (option) {
                case 1: {
                        Addcar();
                }
                break;
                case 2: {
                    addInvoice();
                }
                break;
                case 3: {
                    getInvoice();
                }
                break;
                case 4: {
                    getCarInfo();
                }
                case 5:
                {
                    totalInvoices();
                }
                break;
                default:
                    break;
            }

            if (option == 0) {
                break;
            }
        }

    }
    private void printmenu()
    {
        System.out.println("\t\t\t\tGarage invoice system");
        System.out.println("0: Exit system");
        System.out.println("1: Add a new car");
        System.out.println("2: Set invoice for a car");
        System.out.println("3: Get invoice for a car");
        System.out.println("4: Print car info");
        System.out.println("5: Print sum of invoices");
    }
    private static void Addcar()
    {
        System.out.println("Enter the registration of the car");
        var reg = scanner.next();
        System.out.println("Enter the color of the car");
        var color = scanner.next();
        System.out.println("Enter the build year of the car");
        var buildYear = scanner.nextInt();
        Vehicle vehicle = new Vehicle(reg,color,buildYear);
        garage.addCar(vehicle.getReg(),vehicle.getColor(),vehicle.getBuildyear());
    }
    private static void addInvoice()
    {
        System.out.println("Enter the registration of the car");
        var reg = scanner.next();
        System.out.println("Enter the invoice amount of the car");
        var amount = scanner.nextDouble();
        garage.setInvoiceFor(reg, amount);
    }
    private static void getInvoice()
    {
        System.out.println("Enter the registration of the car");
        var reg = scanner.next();
        System.out.println("The invoice is: " + garage.getInvoiceFor(reg));
    }
    private static void getCarInfo ()
    {
        System.out.println("There are " + garage.count + " cars.");
        System.out.println("For which car should I print the info?");
        var index = scanner.nextInt();
        garage.printCarInfo(index);
    }
    private static void totalInvoices()
    {
        System.out.println("The sum of invoices is: " + garage.calculateTotalInvoices());
    }
}
