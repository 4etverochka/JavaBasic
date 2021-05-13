package example;

public abstract class Animal {

    private int age;
    protected Animal() {
        age = 10;
        System.out.println("This is my animal");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return 40;
    }

    public abstract void sayHi();
}
