package com.company;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {

        ArrayList<String> products = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<String> order = new ArrayList<String>();
        ArrayList<Integer> quantity = new ArrayList<Integer>();
        products.add("Coke");
        prices.add(0.99);
        products.add("Diet Coke");
        prices.add(0.99);
        products.add("Pepsi");
        prices.add(0.99);
        products.add("Five Hour Energy");
        prices.add(3.99);
        products.add("Red-Hot Spicy Doritos");
        prices.add(2.99);
        products.add("Cool Ranch Doritos");
        prices.add(2.99);
        products.add("Sunflower Seeds");
        prices.add(0.99);
        products.add("Peanuts");
        prices.add(0.99);
        products.add("Mac Book Chargers");
        prices.add(120.00);
        products.add("Dell Chargers");
        prices.add(50.00);

        Scanner input = new Scanner(System.in);
        String response;
        String hours;
        String output = "";
        double total;
        double ordersum = 0;

        System.out.println("Hello Customer, I don't have my watch on me, is the time between 10am - 10pm?");
        hours = input.nextLine();
        if (hours.equalsIgnoreCase("yes")) {
            System.out.println("We currently have the following items for you to buy: \n   Drinks: \n- Coke ($0.99) \n- Diet Coke ($0.99) \n- Pepsi ($0.99) \n- Five Hour Energy ($3.99) \n   Snacks:\n- Red-Hot Spicy Doritos ($2.99) \n- Cool Ranch Doritos ($2.99) \n- Sunflower Seeds ($0.99) \n- Peanuts ($0.99) \n   Tech Accessories: \n- Mac Book Chargers ($120.00) \n- Dell Chargers ($50.00)");
            order.clear();

            System.out.println("\nWhat's your name? [type 'X' if you want to leave the store]");
            while (!(response = input.nextLine()).equalsIgnoreCase("X")) { //loop to enter each customers order
                output += "\n" + response;
                total = 0; //assigning 0 for as initial for all customers
                System.out.println("What product would you like? ('e or E' to exit)");
                while (!(response).equalsIgnoreCase("E")) { //loop to enter each ordered item
                    response = input.nextLine();
                    for (String p : products) {
                        if (p.equalsIgnoreCase(response)) {
                            total += prices.get(products.indexOf(p));
                            output += "\n\t" + response;
                            if (!order.contains(response)) {
                                order.add((response));
                                quantity.add(1);
                            } else {
                                int index = order.indexOf(response);
                                quantity.set(index, quantity.get(index) + 1);
                            }
                            break;
                        }
                    }
                }
                output += "\n\t" + total + "\n";
                ordersum += total;
                System.out.println("[Store Hours: 10am - 10pm; WE CLOSE AT 10PM] \nNext Customer. What is your name? ('X' if it is not in the store hours): ");
            }
        } else {
            System.out.println("Sorry, the Store is closed");
        }
        System.out.println("Order Summary:" + output);
        System.out.println("Inventory Sold: ");
        for (String i : order) {
            System.out.println("\t" + i + " (" + quantity.get(order.indexOf(i)) + ")");
        }
        System.out.println("\nGrand Total of Store: $" + ordersum);
    }
}




















// practice code

/*

    public static void main(String[] args) {
        ArrayList<String> product = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<String> customer = new ArrayList<String>();
        ArrayList<String> order = new ArrayList<String>();
        ArrayList<ArrayList<String>> totalorders = new ArrayList<>();
        ArrayList<ArrayList<String>> frequency = new ArrayList<>();
        ArrayList<ArrayList<Double>> totals = new ArrayList<>();
        product.add("Red-Hot Spicy Doritos");
        prices.add(2.99);
        product.add("Cool Ranch Doritos");
        prices.add(2.99);
        product.add("Coke");
        prices.add(0.99);
        product.add("Diet Coke");
        prices.add(0.99);
        product.add("Pepsi");
        prices.add(0.99);
        product.add("Five Hour Energy");
        prices.add(3.99);
        product.add("Sunflower Seeds");
        prices.add(0.99);
        product.add("Peanuts");
        prices.add(0.99);
        product.add("Mac Book Chargers");
        prices.add(120.00);
        product.add("Dell Chargers");
        prices.add(50.00);

        Scanner input = new Scanner(System.in);
        String hours;
        String name;
        String itemnum;
        String output = "";
        double total = 0;
        double grandTotal = 0;
        System.out.println("Hello Cashier, is the store the time between 10am - 10pm?");
        hours = input.nextLine();
        if (hours.equalsIgnoreCase("yes")) {
            System.out.println("\n0 :  Red-Hot Spicy Doritos\n1 :  Cool ranch Doritos\n2 :  Coke\n3 :  Diet Coke\n4 :  Pepsi\n5 :  Five Year Energy\n6 :  Sunflower seeds\n7 :  Peanuts\n8 :  Mac Book Chargers\n9 : Dell Chargers");
            order.clear();
            System.out.println("Enter your name or type done if finished"); // adds item twice doesnt count it as 2
            name = input.nextLine();
            if (name.equals("done")) {
                System.exit(0);
            } else {
                customer.add(name);
                System.out.println(customer);
            }
            do {
                System.out.println("Enter the item number you would like to order: type done when finished.");
                System.out.println("Item number: ");

                itemnum = input.nextLine();
                if (itemnum.equals("done")) {
                    break;
                } else {
                    order.add((product.get(Integer.parseInt(itemnum))));
                    */
/*totals.add((prices.get(Integer.parseInt(itemnum))));
                    for (int i = 0; i < order.size() ; i++) { *//*

                        System.out.println(order);
                        */
/*total += prices.get(i);
                        System.out.println(total);

                        //totals.add(prices); *//*


                    }
                }
            while (!itemnum.equalsIgnoreCase("done")) ;
      */
/*      output += "\n" + input;
            total = 0;
        totalorders.add(order);
        System.out.println("Your Orders:");
        System.out.println("Name: " + name);

        total = 0;
        for (int i = 0; i < totalorders.size(); i++) {
             System.out.println(totalorders);
             total += prices.get(i);
             System.out.println(total);
            }
            System.out.println("Order Summary for Today: ");
*//*

                }
      else
                {
                    System.out.println("Store is closed");
                }
            }
        }
*/
