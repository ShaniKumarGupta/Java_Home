package Basic;/* shani gupta 05-06-2020 23:17 05*/

public class objectExample {
    public objectExample(String name){
        // This constructor has one parameter, name.
        System.out.println("Passed name is "+ name);
    }

    public static void myMethod(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        // following statement would create an object obj and obj1
        objectExample obj = new objectExample("Shani");
        objectExample obj1 = new objectExample("Gupta");
        obj.myMethod("Shani Kumar Gupta");
    }
}
