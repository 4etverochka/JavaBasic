package example;

public class Lion  extends Animal {
    public int length;

    public Lion() {
        super();
        length = 10;
        System.out.println("This is my LION");
    }

    public void output() {
        System.out.println("The age " + getAge() + " he is not old ");
    }

    @Override
    public int getHeight() {
        return super.getHeight() + 10;
    }

    @Override
    public void sayHi() {
        System.out.println("HI, FOLKS!!");
    }

    public void sayHi(String s) {
        System.out.println(s);
    }
}
