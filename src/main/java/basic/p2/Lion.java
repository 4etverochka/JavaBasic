package basic.p2;

public class Lion  implements  HasTail, IHasWhisk{

    public void roar() {
        System.out.println("It is me, Lion");
    }

    public void roar(String replica) {
        System.out.println("It is me, Lion. My favorite word is: " + replica);
    }

    public static void main(String[] args) {
        //new Lion().roar();
        //new Lion().roar("antelope");
        //System.out.println( new Lion().getInt());
        String s1 = "abc";
        String s2 = "abc";

        String s5 = s1;

        String s3 = new String("abc1");
        String s4 = new String("abc1");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));


        IHasWhisk whisk = new Lion();
        Lion lion = new Lion();
        IHasWhisk whisk1 = ((IHasWhisk) lion);
        System.out.println(whisk.getNum());
        System.out.println(whisk.getInt());

        System.out.println(whisk1.getInt());
        System.out.println(whisk1.getNum());

        System.out.println(IHasWhisk.calculate());
    }

    @Override
    public int getTailLength() {
        return 111;
    }

    @Override
    public int getNum() {
        return 100;
    }

    @Override
    public int getInt() {
        return IHasWhisk.super.getInt() + 1000;
    }
}
