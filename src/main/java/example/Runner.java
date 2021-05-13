package example;

public class Runner {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.setAge(10);

        lion.output();

        System.out.println("Lion h " +lion.getHeight());
        lion.sayHi();
        lion.sayHi("Big guy");

        Lion lion1 = new Lion();
        Object objLion = lion1;
    }
}
