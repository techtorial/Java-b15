package RecapWithAhmet.OOP;

public class PolyMorphism {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is polymorphism? (poly->many   ,  morphism--<forms)

     --> It is a different form of object

    2-What is dynamic and static polymorphism?

    *Dynamic Polymorphism: is all about Overriding. -->Dynamic(action)
    *Static Polymorphism:is all about Overloading.(Static(stable)-->no action)

    3-What is the difference between Overriding and Overloading?(***THE MOST COMMON****)

      OVERLOADING:
        1-Overloading needs to be in SAME CLASS
        2-Overloading methods can have final,static,private
       *3-Whenever you overload, it checks METHOD SIGNATURE(DIFFERENT METHOD SIGNATURE)
              METHOD SIGNATURE ==>Name of the method + Parameter
                               -->public void run(int speed)
                               -->private void run(int speed,String name)

      OVERRIDING:
        1-Overriding needs to be in DIFFERENT CLASS and SUBCLASS(EXTENDS,IMPLEMENTS)
        2-You cannot override final static,private methods
        3-Whenever you override, it checks not only Method signature also return type
              It must have SAME METHOD SIGNATURE

     */

    public void dismiss(int time,int minute,String nameOfTeacher){
        System.out.println("Students are leaving at"+time + minute+"with teacher"+nameOfTeacher);
    }

    public void dismiss(int hour,String nameOfTeacher){
        System.out.println("Students are leaving at" +hour+"with Teacher"+nameOfTeacher);
    }

   public void dismiss(String date,int nameOfTeacher){
       System.out.println("Hello");
   }
}
