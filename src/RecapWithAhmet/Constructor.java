package RecapWithAhmet;

public class Constructor {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

     1-What is constructor and what do you do with it?
       -->It is a way to initialize instance variables.
       -->it is a way to assign value for object features.

     2-Can you tell me the difference between constructor and method?

       CONSTRUCTOR:                                METHODS:
      -No Return type                              -It must have return type
      -It must have same name of Class             -It may or may not have same name of class

     3-Can you make constructor static,final and private?
    SHOW OFF: UI --> SINGLETON PATTERN DESIGN --> WE USE CONSTRUCTOR PRIVATE TO PREVENT OTHER CLASSES
     TO ACCESS THE DRIVER.
     -->THE ANSWER. YOu cannot make the constructor static,final or private(EXCEPTION-SINGLETON
     PATTERN DESIGN)

     4-What is difference between this , this() , super , super() ?

       this-->is a keyword which refers to instance variables/methods of class
       this()-->refers to the constructor from SAME CLASS
       super-->is a keyword which refers to parent instance variables/methods of class
       super()-->refers to the parent constructor from DIfferent Class

     */

     String brand="Porsche";
     int wheel =4;

     int door=2;

     public Constructor(String brand){
         this.brand=brand;
     }
     public Constructor(int door ){
         this.door=door;
         System.out.println("I am running");
     }
     public Constructor(String brand,int wheel){
         this(4); this.brand=brand;
         this.wheel=wheel;
     }
    public static void main(String[] args) {
        Constructor porshe314=new Constructor("Porshe314");
        System.out.println(porshe314.brand);
        Constructor example=new Constructor("BMW",3);
        System.out.println(example.door);
        System.out.println(example.wheel);
    }
}
