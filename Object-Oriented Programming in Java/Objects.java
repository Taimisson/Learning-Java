// Object Instantiation:
// <class name> <identifier> = new <class name> ();

// class Instantiation{
//     public static void main(String [] args) {
//         Detective duke = new Detective();
//         Detective tom = new Detective();
//     }
// }

// class Detective{
//     void speak(){
//         String text = "Hello Duke";
//         System.out.println(text);
//     }
// }

// class Detective {
//     void sayHelloWorld(){
//         speak();
//         System.out.println("World");
//     }
//     void speak(){
//         System.out.println("Hello");
//     }
// }


class MethodCalls{
    void initial(){
        first();
        second();
        System.out.println("Last");
    }
    void second(){
        System.out.println("Second");
        third();
    }
    void first(){
        System.out.println("First");
    }
    void third(){
        System.out.println("Third");
    }
}