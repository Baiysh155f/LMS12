import java.util.SplittableRandom;

public class Person {
   private String name;
   private String profession;
   private int age;

   void setName( String name){
       this.name=name;
   }
   void setProfession(String profession){
       this.profession=profession;
   }
   void setAge(int age){
       this.age=age;
   }
   String getName(){
       return name;
   }
   String getProfession(){
       return profession;
   }
   int getAge(){
       return age;
   }

}
