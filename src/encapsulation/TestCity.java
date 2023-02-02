package encapsulation;

public class TestCity {

    public static void main(String[] args) {
        City city = new City();

        city.setPopulation(500006);
        System.out.println(  city.getPopulation()  );

    }
}
