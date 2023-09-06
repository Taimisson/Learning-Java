class Detective{
    String name;
    String lastname;

    void sayName(){
        System.out.println(name + " " + lastname);
    }
}

class AcessAttributes{
    public static void main(String[] args){
        
        Detective ourDetective = new Detective();
        ourDetective.name = "Tom";
        ourDetective.lastname = "Pedro";
        ourDetective.sayName();

    }
}