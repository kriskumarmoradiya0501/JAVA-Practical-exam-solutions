/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6student107
 */

class invalideValue extends Exception{
    public invalideValue(String msg){
        super(msg);
    }
}

class Floor{
    double width;
    double length;
    public Floor(double width, double length) throws invalideValue {
        if (width < 0 || length < 0) {
            throw new invalideValue("Width and Length must be non-negative.");
        }
        this.width = width;
        this.length = length;
    }
    
    double getArea(){
        return (width*length);
    }
}

class Carpet{
    double cost;
    public Carpet(double cost){
        this.cost= cost;
    }
    
    public double getCost(){
        return cost;
    }
}

class Calculator{
    public Floor floor;
    public Carpet carpet;
    
    public Calculator(Floor floor, Carpet carpet){
        this.carpet = carpet;
        this.floor = floor;
    }
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Floor floor = new Floor(12.20, 10);
            Carpet carpet = new Carpet(650);
            Calculator calculator = new Calculator(floor, carpet); 

            double totalCost = calculator.getTotalCost();
            System.out.print(totalCost);
        } catch (invalideValue e) {
            System.out.println(e.getMessage());
        }
    }
}
