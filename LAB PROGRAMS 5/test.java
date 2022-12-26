enum size
{
  small, medium, large, monster
}
public class test
{
  size ps;
  test(size pizzasize)
  {
    this.ps = pizzasize;
  }
  public void order_pizza()
  {
    switch(ps)
    {
      case small: System.out.println("I ordered a small pizza");
                  break;
      case medium: System.out.println("I ordered a medium pizza");
                   break;
      case large: System.out.println("I ordered a large pizza");
                  break;
      case monster: System.out.println("I ordered a monster pizza");
                    break;
      default: System.out.println("Size not available");
    }
  }
}
class driver
{
  public static void main(String[] args)
  {
    size s = size.small;
    test t = new test(s);
    t.order_pizza();
  }
}