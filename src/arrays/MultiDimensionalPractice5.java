package arrays;

public class MultiDimensionalPractice5 {



    public static void main(String[] args) {

        String[][] brands = {{"Apple", "Dell", "google", "Acer", "Samsung"}, {"LG", "Sony", "Toshiba"}, {"Google", "Bose", "JBL"}};

        double[][] prices = {{2500, 1800, 400, 1399, 1550.99}, {1100, 800, 599}, {99.99, 120.99, 89.95}};

        // "JBL is 89.95"

        // show me google products which are less than $100

        for (int i = 0; i < brands.length; i++) {

            for (int j = 0; j < brands[i].length; j++) {

                //  System.out.println(   brands[i][j] + " is $"+ prices[i][j]    );

                if (brands[i][j].equalsIgnoreCase("google") && prices[i][j] < 100) {
                    System.out.println(brands[i][j] + " is the item from Google with price of $" + prices[i][j]);
                }
            }

        }


    }
}
