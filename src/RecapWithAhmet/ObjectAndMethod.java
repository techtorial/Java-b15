package RecapWithAhmet;

public class ObjectAndMethod {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

     1-What do you know about Object? and tell me couple methods of it?

       -->Always go general to --> DEEP
     -->Object is a representation of the class(blueprint) --> DNA,CAR etc
     -->There are some useful methods of object that I use to perform some
     actions in my project.
       *->.equals --> Comparison of two objects values.
       *->toString-->It is a way to make the data into String format.(Arrays.toString
       *->Hashcode -->it gives you the location of data.

     2-What is the difference between Object and Class?

       Class:is a blueprint/template which you can create as many as you want
       Object:Is a representation of class/member->Instance of class(INSTANCE=OBJECT)
       Class:It is declared with Class keyword
       Object:It is declared with NEW keyword

     3-How do you initialize the instance variables?

       ->There are some common ways to initiliaze the instance variables

         -->Constructor
         -->Methods(getters and setters)
         -->Object
         -->Directly declare and initiliaze

    4-What is the difference between local and instance variable?

      Instance Variable:                                     Local Variable:
      -Belongs to class                                     -It belongs to blocks
      -it has default values(null,0,0.0,false)              -No default values
      -It can have Access Modifiers(private,public          -No you cannot have it
      protected, default(it is not a keyword)
     */
    private String name="Ahmet";
   protected int age=31;
    String eyeColor="black";
    String nationality;

    public ObjectAndMethod(String name, int age, String eyeColor, String nationality) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.nationality = nationality;
    }

    public void run(int speed){
        int number=1;//local variables cannot have default values you have to initiliaze
        //public int number-> you cannot use access modifiers for local variable
        System.out.println(number);
        System.out.println(speed);
    }


    public static void main(String[] args) {

        ObjectAndMethod maleHuman=new ObjectAndMethod("Mehmet",35,"brown","Kyrgyz");//object -->representation of class
                                                        //Instance of class
        System.out.println(maleHuman.name);
        System.out.println(maleHuman.age);//31
        maleHuman.age=32;
        System.out.println(maleHuman.age);//32
        System.out.println(maleHuman.nationality);//null
        maleHuman.nationality="Turkey";
        System.out.println(maleHuman.nationality);//Turkey
        //System.out.println(maleHuman.number);//there is no direct call for local variable



    }



}
