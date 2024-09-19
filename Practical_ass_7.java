import java.util.Scanner;

class invalideValue extends Exception {
    public invalideValue(String msg) {
        super(msg);
    }
}

abstract class RowMatirial {
    double Goods_value;
    double Service_tax;
    double Surcharge;

    public RowMatirial(double Goods_value) throws invalideValue {
        if (Goods_value < 1) {
            throw new invalideValue("Goods value must be at least 1 Rs.");
        }
        this.Goods_value = Goods_value;
    }

    public abstract void calculate();
    public abstract void disp();
}

abstract class ByRoad extends RowMatirial {
    public ByRoad(double Goods_value) throws invalideValue {
        super(Goods_value);
    }
}

class Railway extends ByRoad {
    public Railway(double Goods_value) throws invalideValue {
        super(Goods_value);
    }

    public void calculate() {
        Service_tax = Goods_value * 0.12;
        Surcharge = Service_tax * 0.03;
    }

    public void disp() {
        System.out.printf("Railway Transport:\nGoods Value: %.2f\nService Tax: %.2f\nSurcharge: %.2f\nTotal: %.2f\n",
                Goods_value, Service_tax, Surcharge, Goods_value + Service_tax + Surcharge);
    }
}

class Transport extends ByRoad {
    public Transport(double Goods_value) throws invalideValue {
        super(Goods_value);
    }

    public void calculate() {
        Service_tax = Goods_value * 0.12;
        Surcharge = Service_tax * 0.03;
    }

    public void disp() {
        System.out.printf("Transport by Road:\nGoods Value: %.2f\nService Tax: %.2f\nSurcharge: %.2f\nTotal: %.2f\n",
                Goods_value, Service_tax, Surcharge, Goods_value + Service_tax + Surcharge);
    }
}

class ByShip extends RowMatirial {
    private boolean international;

    public ByShip(double Goods_value, boolean international) throws invalideValue {
        super(Goods_value);
        this.international = international;
    }

    public void calculate() {
        if (international) {
            Service_tax = Goods_value * 0.20;
            Surcharge = Service_tax * 0.02;
        } else {
            Service_tax = Goods_value * 0.10;
            Surcharge = Service_tax * 0.02;
        }
    }

    public void disp() {
        String transportType = international ? "International Shipping" : "Domestic Shipping";
        System.out.printf("%s:\nGoods Value: %.2f\nService Tax: %.2f\nSurcharge: %.2f\nTotal: %.2f\n",
                transportType, Goods_value, Service_tax, Surcharge, Goods_value + Service_tax + Surcharge);
    }
}

public class Practical_ass_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter goods-value: ");
            double Goods_value = scanner.nextDouble();

            System.out.println("Choose your way:");
            System.out.println("ENTER 1 Railway");
            System.out.println("ENTER 2 transprt");
            System.out.println("ENTER 3 Shipp)");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Railway railway = new Railway(Goods_value);
                    railway.calculate();
                    railway.disp();
                    break;

                case 2:
                    Transport transport = new Transport(Goods_value);
                    transport.calculate();
                    transport.disp();
                    break;

                case 3:
                    System.out.print("Is it international shipping? (true = 1/false = 0): ");
                    int internationalInput = scanner.nextInt();
                    boolean international = (internationalInput == 1);
                    ByShip ship = new ByShip(Goods_value, international);
                    ship.calculate();
                    ship.disp();
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } catch (invalideValue e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
