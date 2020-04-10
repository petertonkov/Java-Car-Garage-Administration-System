package com.company;

public class Garage {

    public int capacity;
    public int count;
    public String[] registrationPlates;
    public String[] colors;
    public int[] buildYears;
    public double[] invoices;

    public Garage(int capacity)
    {
        this.capacity = capacity;
        this.count = 0;
        this.registrationPlates = new String[capacity];
        this.colors = new String[capacity];
        this.buildYears = new int[capacity];
        this.invoices = new double[capacity];
    }

    public void addCar(String registration, String color, int buildYear) {
        for (var i=0; i < this.capacity; i++) {
                this.registrationPlates[i] = registration;
                this.colors[i] = color;
                this.buildYears[i] = buildYear;
                this.count++;
            }
        }

    public void setInvoiceFor (String registration,double amount){
        for (var i = 0; i < this.count; i++) {
            if (this.registrationPlates[i].equals(registration)) {
                this.invoices[i] = amount;
                System.out.println(this.invoices[i]);
                break;
            }
        }
    }

    public double getInvoiceFor (String registration)
    {
        for (var i = 0; i < this.count; i++) {
            if (this.registrationPlates[i].equals(registration)) {
                return this.invoices[i];
            }
        }
        return 0.0;
    }

    public double calculateTotalInvoices () {
        var sum = 0.0;
        for (var i = 0; i < this.count; i++) {
            sum += this.invoices[i];
        }
        return sum;
    }

    public void printCarInfo(int i) {
        System.out.print("Registration number: ");
        System.out.println(registrationPlates[i]);
        System.out.print("Color: ");
        System.out.println(colors[i]);
        System.out.print("Build year: ");
        System.out.println(buildYears[i]);
        System.out.print("Invoice: ");
        System.out.println(invoices[i]);
    }
}
