import java.util.*;

//  constructor
//  three type of constuctor
// 1.defult con. 2.No Args con. 3.parameteristed constructor

 /* class Main{

    // 1 defult con.

    int a = 12 ;
    public static void main(String[] args) {
      Main obj1 = new Main();
        System.out.println(obj1.a) ;
    }
} */

//  2.NoArgs constuctor
 /* class Main{
    int num1;
    int num2;
  Main(){
 num1 = 12 ;
 num2 = 23 ;
  }
    public static void main(String[] args) {
        Main obj = new Main() ;
        System.out.println(obj.num1);
        System.out.println(obj.num2);

    }
} */

// paramterister constructor
 /* class Main{
    int a ;
    int b ;
    Main(int  c, int d){
    a = c ;
    b = d ;
    }
    public static void main(String[] args) {
Main obj1 = new Main(12,13) ;
        System.out.println(obj1.a);
        System.out.println(obj1.b);

    }
} */

 /// construtor overloading and constructor chaning
//  Ek hi class me same naam ke multiple constructors ho, lekin parameter list alag ho.
  /* class Main{
    String name ;
    int age ;
    Main(){
        this.name = "Defult" ;
        this.age = 0 ;
    }
    Main(String name){
        this.name = name ;
        this.age = 0 ;
    }
     Main(int age){

         this.age = age;
     }
     Main(String name ,int age){
        this.name = name ;
        this.age = age ;
     }
     public void printDetails() {
         System.out.println("Name : " + this.name);
         System.out.println("Age : " + this.age);
     }
     public static void main(String[] args) {
         Main std1 = new Main() ;
         Main std2 = new Main("pratik") ;
         Main std4 = new Main(18) ;
         Main std3 = new Main("sanyog",16) ;

    std1.printDetails();
    std2.printDetails();
    std4.printDetails();
    std3.printDetails();
    }}
  */

///  constructor chaning
class Main{
    String name ;
    int age ;
    Main(){
        this("as") ;
    }
    Main(String name){
        this(name,0) ;
    }
    Main(int age){

        this("defult",age) ;
    }
    Main(String name ,int age){
        this.name = name ;
        this.age = age ;
    }
    public void printDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
    public static void main(String[] args) {
        Main std1 = new Main() ;
        Main std2 = new Main("pratik") ;
        Main std4 = new Main(18) ;
        Main std3 = new Main("sanyog",16) ;

        std1.printDetails();
        std2.printDetails();
        std4.printDetails();
        std3.printDetails();
    }}
