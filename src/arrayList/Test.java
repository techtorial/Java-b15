package arrayList;

import object.BankAccount;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();

        Computer c1 = new Computer("Dell",1600,"Black",15.5);
        Computer c2 = new Computer("Acer",899,"Gray",13.5);
        Computer c3 = new Computer("Apple",2200,"White",16.5);
        Computer c4 = new Computer("ASUS",300,"Silver",17.5);

        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);

        System.out.println( computers   );

        // find computers they are less than $1000
        //and show their brand, cost and color to the user
        for ( int i = 0; i < computers.size(); i++  ){

            if (  computers.get(i).price <1000  ){
                System.out.println( computers.get(i).brand +"- "+
                        computers.get(i).price +" - "+computers.get(i).color);
            }

        }

      ArrayList<Computer> str =   findFancyComputer( computers );
        System.out.println(str);

        System.out.println(totalCostOfComputers(computers));
        BankAccount account = new BankAccount();
        account.withdraw( totalCostOfComputers(computers));
    }
    // create a method that will get an arraylist as parameter
    // this method will find out computers that has price more than $1200
    // and screenSize is more than 13.5
    // this method will store and return those computers as a new arraylist

    public static ArrayList<Computer> findFancyComputer(ArrayList<Computer> devices ){
        ArrayList<Computer> fancyComputers = new ArrayList<>();
        for ( Computer device : devices ){

            if (device.price > 1200 && device.screenSize >13.5){

                fancyComputers.add(device);
            }
        }
        return fancyComputers;
    }

    // find out and tell me the total prices of  computers so that I can buy all of them
    // create a method to solve this task

    public static Double totalCostOfComputers(ArrayList<Computer> list){
        double sum = 0;
        for ( Computer item: list){

            sum  += item.price;
        }
        return sum;
    }











}
