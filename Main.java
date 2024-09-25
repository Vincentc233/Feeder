public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(240000);
        int random = (int) (Math.random() * 40 +10);
        f.simulateManyDays(10,5);


    }
}
