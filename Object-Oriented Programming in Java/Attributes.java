class Detective{
    String name;

}

class AcessAttributes{
    public static void main(String[] args){
        Detective ourDetective = new Detective();
        ourDetective.name = "Duke";
        System.out.println(ourDetective.name);
    }
}