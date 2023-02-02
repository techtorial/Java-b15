package mentoringWithKutman;

import java.util.*;

public class Cars {
    /*
    Toyota:Camry
                :Sedan,1987,$35,000-$50,000
           Corolla
                 :Sedan,1995,$25,000-$35,000
           Prius
                :Sedan,2005,$40,000-$60,000
           Tacoma
                :
           Sienna
                :
           Highlander
                    :
    Honda:Accord, Civic, Odyssey, CR-V, Insight, Pilot
    Hyundai:Accent, Sonata, Ioniq, Kona, Santa Fe
    Ford:Mustang, Ranger, Maverick, Explorer, F-150
    Kia: Sportage, K5, Stinger, Sorento, Forte
     */

    public static void getCarInfo(String name){
        Scanner scanner=new Scanner(System.in);
        String userMakeResponse;
        String userModelResponse;

        Map<String,Map<String, List<String>>> carMake=new HashMap<>();
        Map<String,List<String>> toyotaModelInfo=new HashMap<>();
        List<String> corolla=new ArrayList<>();
        corolla.add("Sedan");
        corolla.add("1995");
        corolla.add("$25,000-$35,000");

        toyotaModelInfo.put("Corolla",corolla);
        carMake.put("Toyota",toyotaModelInfo);


        System.out.println("Welcome to CODEFISH dealership!");
        System.out.println("Here is some make of the cars that we have in stock:");
        for (String make:carMake.keySet()){
            System.out.println(make);
        }

        userMakeResponse=scanner.nextLine();
        for (String make:carMake.keySet()){
            if(userMakeResponse.equalsIgnoreCase(make)){
                for (String model:carMake.get(make).keySet()){
                    System.out.println(model);
                }
                System.out.println("Which model?");
                userModelResponse=scanner.nextLine();
                for (String model:carMake.get(make).keySet()){
                    if(userModelResponse.equalsIgnoreCase(model)){
                        for (String info:toyotaModelInfo.get(model)){
                            System.out.println(info);
                        }
                    }
                }
            }
        }




    }

    public static void main(String[] args) {
        getCarInfo("Kutman");
    }
}
