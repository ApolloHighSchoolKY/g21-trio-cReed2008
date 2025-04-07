//Write your answer here
public class Trio implements MenuItem
{
    private Sandwich sandy;
    private Salad sally;
    private Drink bev;

    public Trio( Sandwich san, Salad sal, Drink dri)
    {
        sandy = san;
        sally = sal;
        bev = dri;
    }

    public String getName()
    {
        return sandy.getName() + "/" + sally.getName() + "/" + bev.getName() + " Trio";
    }

    public double getPrice()
    {
        double sandyPrice = sandy.getPrice();
        double sallyPrice = sally.getPrice();
        double bevPrice = bev.getPrice();
    }
}