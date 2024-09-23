public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(100);
        System.out.println(f);
        System.out.println(f.getCurrentFood());
        int random = (int) (Math.random() * 40 +10);
        System.out.println(random);
        System.out.println(Math.random() < 0.05);
        f.simulateOneDay(5);
        System.out.println(f.getCurrentFood());

    }
}
