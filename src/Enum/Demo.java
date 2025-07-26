package Enum;

import java.util.Scanner;

public class Demo {

    public static void main(String args[])
    {
//         Laptop lap =Laptop.Dell;
//        System.out.println(lap + ":" + lap.getPrice());
        for(Laptop lap : Laptop.values())
            System.out.println(lap + ":" + lap.getPrice());
    }
}


    enum Laptop{
                 Dell(40000), XPS(45000), Mac, Realme(53000);
                 private int price;

        Laptop() {

        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        Laptop(int price) {
            this.price = price;
        }
    }
